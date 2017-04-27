package com.lan.nicehair.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



import com.lan.nicehair.R;



public class DataActivity2 extends BaseActivity {
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data2);
        
       
        Button scan_2 = (Button) this.findViewById(R.id.button2);
        scan_2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Intent openCameraIntent2 = new Intent(DataActivity2.this,DataActivity3.class);
				DataActivity2.this.startActivity(openCameraIntent2);
			}
		});
        
       
        
       
       
       
    }
	
}
