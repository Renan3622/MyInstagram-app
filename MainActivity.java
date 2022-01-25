package com.mycompany.insta;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.mycompany.insta.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
            WebView containerWebview = (WebView) findViewById(R.id.containerWebView);
					containerWebview.setWebViewClient(new MyWebViewClient());
					String url = "https://www.instagram.com/renandasilva.s/";
					containerWebview.getSettings().setJavaScriptEnabled(true);
					containerWebview.loadUrl(url); // load a web page in a web view
				  
				}
				
				private class MyWebViewClient extends WebViewClient {
							@Override
							public boolean shouldOverrideUrlLoading(WebView view, String url) {
											view.loadUrl(url);
											return true;
					}
				}
  
}