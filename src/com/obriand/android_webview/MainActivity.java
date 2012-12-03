package com.obriand.android_webview;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button mButton1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		final Context context = this;
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mButton1 = (Button)this.findViewById(R.id.button1);
		mButton1.setOnClickListener(new OnClickListener() {
			  @Override
			  public void onClick(View arg0) {
			    Intent intent = new Intent(context, WebviewActivity.class);
			    startActivity(intent);
			  }
		} );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
