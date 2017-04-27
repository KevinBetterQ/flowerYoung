package com.lan.nicehair.fragment;

import java.util.LinkedList;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.ButterKnife;
import butterknife.InjectView;

import com.lan.nicehair.R;
import com.lan.nicehair.activity.HairCommentActivity;
import com.lan.nicehair.activity.PostInfoActivity;
import com.lan.nicehair.adapter.FindHairAdapter;
import com.lan.nicehair.common.json.FindHairParser.HairResult;
import com.lan.nicehair.common.model.FindHairItem;
import com.lan.nicehair.common.model.ZoneAllItem;
import com.lan.nicehair.common.net.ActionOfUrl.JsonAction;
import com.lan.nicehair.common.net.NetAsyncTask;
import com.lan.nicehair.utils.AppToast;
import com.lan.nicehair.utils.HProgress;
import com.lan.nicehair.utils.ImageFetcher;
import com.lan.nicehair.waterfall.base.PLA_AdapterView;
import com.lan.nicehair.waterfall.base.PLA_AdapterView.OnItemClickListener;
import com.lan.nicehair.waterfall.widget.XListView;
import com.lan.nicehair.waterfall.widget.XListView.IXListViewListener;

public class FindHairFragment extends Fragment implements IXListViewListener{
	
	private WebView webView;

	@InjectView(R.id.water_list) XListView mWaterList;
	private LinkedList<FindHairItem> mListInfos= new LinkedList<FindHairItem>();
	private FindHairAdapter mAdapter;
	private ImageFetcher mImageFetcher;
	private int currentPage = 1;
	private Handler mHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case R.id.ui_show_dialog:
				//dialog.show();
				HProgress.show(getActivity(), null);
				break;
			case R.id.ui_dismiss_dialog:
				//dialog.dismiss();
				HProgress.dismiss();
				break;
			case R.id.ui_show_text://网络超时和数据解析异常
				if(getActivity()!=null)
					AppToast.showShortText(getActivity(), msg.arg1);
				break;
			case R.id.ui_update_ui:
				break;
			}
		}
	};
	public static FindHairFragment newInstance(int position) {
		FindHairFragment fragment = new FindHairFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        fragment.setArguments(bundle);
        return fragment;
    }
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View contentView = inflater.inflate(R.layout.view_hair_recomm, container, false);
		
		initWeb(contentView);
		
		ButterKnife.inject(this, contentView);
		mWaterList.setPullLoadEnable(true);
		mWaterList.setXListViewListener(this);
		mImageFetcher = new ImageFetcher(getActivity(), 300);
		mImageFetcher.setLoadingImage(R.drawable.hairscan_loading);
	    mAdapter = new FindHairAdapter(getActivity(), mImageFetcher);
	    mWaterList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(PLA_AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				if(position<1)return;
				FindHairItem info=mAdapter.mListInfos.get(position-1);
				Intent intent = new Intent(getActivity(),HairCommentActivity.class);
				Bundle mBundle = new Bundle();    
			    mBundle.putSerializable("hairInfo",info);    
			    intent.putExtras(mBundle);
			    startActivity(intent);
			}
		});
	    parseArgument();
		return contentView;
	}
	
	
	
	@SuppressLint("SetJavaScriptEnabled")
	private void initWeb(View contentV) {
		webView = (WebView) contentV.findViewById(R.id.webView);
       
		
       webView.getSettings().setJavaScriptEnabled(true);
        //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
       webView.setWebViewClient(new WebViewClient(){
    	   
    	   
    	   @Override
    	public void onPageStarted(WebView view, String url, Bitmap favicon) {
    		// TODO Auto-generated method stub
    		super.onPageStarted(view, url, favicon);
    	}
    	   
    	   @Override
    	public void onPageFinished(WebView view, String url) {
    		// TODO Auto-generated method stub
    		   if(url!=null&&url.contains("huajiang.cc")) {
                   String fun="javascript:function getClass(parent,sClass) { var aEle=parent.getElementsByTagName('div'); var aResult=[]; var i=0; for(i<0;i<aEle.length;i++) { if(aEle[i].className==sClass) { aResult.push(aEle[i]); } }; return aResult; } ";
                   view.loadUrl(fun);
                   String fun2="javascript:getClass(document,'comment_nav clearfix')[0].style.display='none';";
                   view.loadUrl(fun2);
                   String fun3="javascript:document.getElementById('mainpage').style.display='none';";
                   view.loadUrl(fun3);
                   

                   //System.out.println("yyyyyyyyyyyyyyy");

    		   }
    		super.onPageFinished(view, url);
    	}
    	   
           @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
               //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
             view.loadUrl(url);
            return true;
        }
       });
		
     //WebView加载web资源
       webView.loadUrl("http://m.huajiang.cc/list/18.html");
	}
	
	
	private void parseArgument() {
		mWaterList.setAdapter(mAdapter);
		Bundle bundle = getArguments();
		int position=bundle.getInt("position");
		switch(position) {
		case 0:
		case 1:
			AddItemToContainer(++currentPage, 1);
			break;
		}
	}
	public class NetCotnent extends NetAsyncTask{

		private HairResult result;
		private int mType = 1;
		public NetCotnent(Handler uiHandler,int type) {
			super(uiHandler);
			this.mType=type;
			if(mListInfos.size()==0)
				setDialogId(1);
		}
		@Override
		protected void handlePreExecute() {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected String handleNetworkProcess(String... arg0) throws Exception {
			// TODO Auto-generated method stub
			result=(HairResult) httptask.getRequestbyPOST(JsonAction.FINDHAIR,arg0[0], null);
			return result != null ? HANDLE_SUCCESS : HANDLE_FAILED;
		}

		@Override
		protected void handleResult() {
			// TODO Auto-generated method stub
			if (result!=null&&result.isSuccess()) {
				mListInfos=result.getmListInfo();
				if (mType == 1) {
					mAdapter.mListInfos=mListInfos;
					mAdapter.notifyDataSetChanged();
					mWaterList.stopRefresh();
				} else if (mType == 2) {
					mWaterList.stopLoadMore();
					mAdapter.addItemLast(mListInfos);
					mAdapter.notifyDataSetChanged();
				}
			}            
		}
		
	}
	private void AddItemToContainer(int pageindex, int type) {
		String url = "album/1733789/masn/p/" + pageindex + "/24/";
		new NetCotnent(mHandler,type).execute(url);
	}
	@Override
	public void onResume() {
		super.onResume();
		mImageFetcher.setExitTasksEarly(false);
	}
	 @Override
	 public void onDestroyView() {
		 // TODO Auto-generated method stub
		 super.onDestroyView();
		 ButterKnife.reset(this);
	 }

	    @Override
	    public void onRefresh() {
	    	currentPage=1;
	        AddItemToContainer(currentPage, 1);

	    }

	    @Override
	    public void onLoadMore() {
	        AddItemToContainer(++currentPage, 2);

	    }
}
