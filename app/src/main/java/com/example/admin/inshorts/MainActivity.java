package com.example.admin.inshorts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    VerticalViewPager verticalViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        verticalViewPager = (VerticalViewPager) findViewById(R.id.verticleViewPager);
        verticalViewPager.setAdapter(new VerticlePagerAdapter(this));
    }
}
