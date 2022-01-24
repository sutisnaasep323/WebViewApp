package com.example.webview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle(R.string.action_bar);
        actionBar.getTitle().toString();

        WebView webview = findViewById(R.id.web);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://youtube.com/");

        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);
    }
}