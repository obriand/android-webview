package com.obriand.android_webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity extends Activity {
	
	private WebView mWebview;

	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview_activity);

		mWebview = (WebView) findViewById(R.id.webview1);
		mWebview.getSettings().setJavaScriptEnabled(true);
		mWebview.loadUrl("http://www.google.com");

	}
}
