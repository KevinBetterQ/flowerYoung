package com.lan.nicehair.activity;


import com.lan.nicehair.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class WelcomeActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                WelcomeActivity.this.finish();
              
            }
        }, 5000);//两秒后跳转到另一个页面
       
    }
}
