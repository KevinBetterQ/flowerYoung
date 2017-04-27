package com.lan.nicehair.activity;


import com.lan.nicehair.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FlowerMarketActivity extends Activity{
	
	private WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_markrt);
		
		initWeb();
	}
	
	
	private void initWeb() {
		webView = (WebView) findViewById(R.id.webView);
       
		
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
       webView.loadUrl("http://m.huamu.com/fenlei/6_lvzhipenzai.html");
	}
	
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {       
            webView.goBack();     
            System.out.println("back");
            return true;       
        }       
		return super.onKeyDown(keyCode, event);
	}
	
	
	/*public boolean onKeyDown(int keyCode, KeyEvent event) {       
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {       
            webView.goBack();     
            System.out.println("back");
            return true;       
        }       
        return super.onKeyDown(keyCode, event);       
    }*/
}
