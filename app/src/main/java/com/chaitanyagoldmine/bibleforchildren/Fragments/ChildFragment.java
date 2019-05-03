package com.chaitanyagoldmine.bibleforchildren.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.chaitanyagoldmine.bibleforchildren.DetailActivity;
import com.chaitanyagoldmine.bibleforchildren.R;

public class ChildFragment extends Fragment {

    private Context mContext;
    private WebView webview_child_story;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.child_fragment, container, false);

        mContext = getActivity();
        DetailActivity activity = (DetailActivity) getActivity();
        int position = activity.getPosition();

        String file_name = this.mContext.getResources().getStringArray(R.array.bibleIndex)[position];
        file_name = file_name.replaceAll(" ", "_");
        String url = "https://bibleforchildren.org/PDFs/english/" + file_name + "_English.pdf";
        System.out.println("HRA REPORT URL : " + url);
        webview_child_story = rootView.findViewById(R.id.webview_child_story);

        webview_child_story.getSettings().setJavaScriptEnabled(true);
        webview_child_story.getSettings().setPluginState(WebSettings.PluginState.ON);

        //---you need this to prevent the webview from
        // launching another browser when a url
        // redirection occurs---
        webview_child_story.setWebViewClient(new Callback());
        webview_child_story.loadUrl("http://docs.google.com/gview?embedded=true&url=" + url);


        return rootView;
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(
                WebView view, String url) {
            return (false);
        }
    }
}

