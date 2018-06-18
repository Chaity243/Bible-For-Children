package com.children.bible.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.children.bible.DetailActivity;
import com.children.bible.R;

public class GenisisFragment  extends Fragment {

    private Context mContext;

    private TextView tv_genesis;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.genisis_fragment, container, false);

        mContext = getActivity();
        DetailActivity activity = (DetailActivity) getActivity();
        String myDataFromActivity = activity.getMyData();
        tv_genesis=rootView.findViewById(R.id.tv_genesis);
        tv_genesis.setText(this.context.getResources().getStringArray(R.array.bibleGenesis)[position]);



        return rootView;
    }


}

