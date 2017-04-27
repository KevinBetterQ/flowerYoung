package com.lan.nicehair.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.io.IOException;


import com.lan.nicehair.R;



public class DataActivity1 extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data1);
        
       
        Button scan_1 = (Button) this.findViewById(R.id.button1);
        scan_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Intent openCameraIntent1 = new Intent(DataActivity1.this,DataActivity2.class);
				DataActivity1.this.startActivity(openCameraIntent1);
			}
		});
        
       
        
       
       
       
    }
	
}
