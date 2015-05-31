package jp.hakosuko_android;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;

public class MainActivity extends Activity  {
	private WebView webView = null;
	private static final Uri URL_STHOME = Uri.parse("http://192.168.100.104:9000/index.html");

	/**
	 * アプリ起動時に最初に呼ばれるメソッド(onCreate)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//setContentView(R.layout.activity_main); // activity_browser.xmlをセット
		//webView = (WebView) findViewById(R.id.webview);
		//webView.loadUrl("http://192.168.100.104:9000/index.html"); 	// サイトの読み込み

		Intent web = new Intent(Intent.ACTION_VIEW, URL_STHOME);
		startActivity(web);

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_BACK) {
    		finish();
        }
	    return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
	    // TODO Auto-generated method stub
	    if (event.getAction()==KeyEvent.ACTION_DOWN) {
	        if(event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
        		finish();
	        }
	    }
	    return super.dispatchKeyEvent(event);
	}

}
