package com.chaitanyagoldmine.bibleforchildren.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chaitanyagoldmine.bibleforchildren.DetailActivity;
import com.chaitanyagoldmine.bibleforchildren.R;

public class GenisisFragment  extends Fragment {

    private Context mContext;

    private TextView tv_genesis;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.genisis_fragment, container, false);

        mContext = getActivity();
        DetailActivity activity = (DetailActivity) getActivity();
        int position = activity.getPosition();
        tv_genesis=rootView.findViewById(R.id.tv_genesis);
        tv_genesis.setText(this.mContext.getResources().getStringArray(R.array.bibleGenesis)[position]);



        return rootView;
    }


}

