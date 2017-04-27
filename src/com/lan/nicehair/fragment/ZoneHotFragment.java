package com.lan.nicehair.fragment;

import butterknife.ButterKnife;
import butterknife.InjectView;

import com.lan.nicehair.R;
import com.lan.nicehair.adapter.ZoneHotAdapter;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class ZoneHotFragment extends Fragment {
	
	private WebView webView;

	@InjectView(R.id.grid_zone_hot_tag) GridView mGridView;
	private ZoneHotAdapter mAdapter;
	public static ZoneHotFragment newInstance() {
		ZoneHotFragment fragment = new ZoneHotFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View contentView = inflater.inflate(R.layout.view_zone_hot_tag, container, false);
		
		initWeb(contentView);
		
		
		ButterKnife.inject(this, contentView);
		mAdapter=new ZoneHotAdapter(getActivity());
		mGridView.setAdapter(mAdapter);
		mGridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
			}
		});
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
    		   if(url!=null&&url.contains("flowernews/news.html")) {
                   String fun="javascript:function getClass(parent,sClass) { var aEle=parent.getElementsByTagName('div'); var aResult=[]; var i=0; for(i<0;i<aEle.length;i++) { if(aEle[i].className==sClass) { aResult.push(aEle[i]); } }; return aResult; } ";
                   view.loadUrl(fun);
                   String fun2="javascript:getClass(document,'header')[0].style.display='none';";//
                   view.loadUrl(fun2);
                   
                  
                   
                  // view.loadUrl("javascript:hideOther();");
                  
                   

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
       webView.loadUrl("http://m.yayaliyi.com/flowernews/news.html");
	}
	
	
	public void goBack() {
        if (webView != null) {
            webView.goBack();
        }
    }
	
	
	
	@Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
