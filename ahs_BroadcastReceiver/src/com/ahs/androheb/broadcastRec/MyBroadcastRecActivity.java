package com.ahs.androheb.broadcastRec;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MyBroadcastRecActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
         registerReceiver(
        	       new MyBroadcastReceiver(), 
        	       new IntentFilter(Intent.ACTION_TIME_TICK));  
  
    }
      
}