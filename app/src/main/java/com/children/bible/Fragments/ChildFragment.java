package com.children.bible.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.children.bible.DetailActivity;
import com.children.bible.R;

public class ChildFragment extends Fragment {

    private Context mContext;
private WebView webview_child_story;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.child_fragment, container, false);

        mContext = getActivity();
        DetailActivity activity = (DetailActivity) getActivity();
        int position = activity.getPosition();

        String file_name =   this.mContext.getResources().getStringArray(R.array.bibleIndex)[position];
        file_name=file_name.replaceAll(" ", "_");
        String url ="https://bibleforchildren.org/PDFs/english/"+file_name+"_English.pdf";
        System.out.println("HRA REPORT URL : "+url);
        webview_child_story=rootView.findViewById(R.id.webview_child_story);
        webview_child_story.loadUrl(url);


        return rootView;
    }


}

