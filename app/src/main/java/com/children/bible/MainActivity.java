package com.children.bible;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView essayindex_rv;
    private StoryAdapter storyAdapter;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;

        essayindex_rv= (RecyclerView)findViewById(R.id.bible_rv_index);
        storyAdapter = new StoryAdapter(mContext);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mContext);
        essayindex_rv.setLayoutManager(mLayoutManager);
        essayindex_rv.setItemAnimator(new DefaultItemAnimator());
        essayindex_rv.setAdapter(storyAdapter);
    }
}
