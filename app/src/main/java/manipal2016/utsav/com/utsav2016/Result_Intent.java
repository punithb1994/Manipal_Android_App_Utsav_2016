package manipal2016.utsav.com.utsav2016;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import com.pushbots.push.Pushbots;

/*
 *********Created by Akshath K, Punith B, Ajay J [March 2016]*********
*/
public class Result_Intent extends Activity
{
    WebView webresult;
    ProgressDialog dialog;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setTitle("Results");
        FrameLayout f=(FrameLayout) findViewById(R.id.frameinternetconnectionerror);

        if(isNetworkStatusAvialable (getApplicationContext())) {
            f.setVisibility(View.GONE);
            dialog = new ProgressDialog(Result_Intent.this);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.setMessage("Loading. Please wait...");
            dialog.setIndeterminate(true);
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();

            webresult=(WebView)findViewById(R.id.webViewResult);
            webresult.setWebViewClient(new MyBrowser());
            String url = "http://www.fazilamir.me/api/results.php";
            webresult.getSettings().setLoadsImagesAutomatically(true);
            webresult.getSettings().setJavaScriptEnabled(true);
            webresult.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            webresult.loadUrl(url);
        }
        else
        {
            f.setVisibility(View.VISIBLE);

        }

    }
    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url)
        {
            super.onPageFinished(view, url);
            dialog.dismiss();
        }
    }

    public static boolean isNetworkStatusAvialable (Context context)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null)
        {
            NetworkInfo netInfos = connectivityManager.getActiveNetworkInfo();
            if(netInfos != null)
                if(netInfos.isConnected())
                    return true;
        }
        return false;
    }
}

