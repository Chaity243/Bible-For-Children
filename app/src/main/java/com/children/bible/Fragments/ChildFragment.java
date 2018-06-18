package com.children.bible.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.children.bible.R;

public class ChildFragment extends Fragment {

    private Context mContext;

    RecyclerView rc_history;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.child_fragment, container, false);

        mContext = getActivity();



        return rootView;
    }


}

