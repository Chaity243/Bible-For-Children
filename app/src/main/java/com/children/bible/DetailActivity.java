package com.children.bible;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.ArrayList;

public class DetailActivity  extends AppCompatActivity {

    private TextView tv_content;
    private int position;
    private Context context;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        context = this;
        TabLayout tabsbooking = (TabLayout) findViewById(R.id.tabsbooking);
        ViewPager pagerbooking = (ViewPager) findViewById(R.id.pagerbooking);

        pagerbooking.setAdapter(new DetailTabAdapter(getSupportFragmentManager(), context));

        tabsbooking.setupWithViewPager(pagerbooking);
        tabsbooking.getTabAt(0).setText("Children Story");
        tabsbooking.getTabAt(1).setText("Genesis");


        Bundle extras = getIntent().getExtras();


//        if (extras != null) {
//            position = extras.getInt("position");
//            getSupportActionBar().setTitle(this.context.getResources().getStringArray(R.array.bibleIndex)[position]);
//            // and get whatever type user account id is
//        }
//        String strVar="essay"+String.valueOf(position);
//        tv_content.setText(this.context.getResources().getStringArray(R.array.bibleGenesis)[position]);
    }



}
