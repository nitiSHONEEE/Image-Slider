package com.example.imageslider;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    ViewPager ViewPager;


    int[] images = {R.drawable.animal1, R.drawable.animal2, R.drawable.animal3, R.drawable.animal4};

    ImageViewAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager = (ViewPager)findViewById(R.id.viewPager);


        mViewPagerAdapter = new ImageViewAdapter(MainActivity.this, images);

        ViewPager.setAdapter(mViewPagerAdapter);

        }
}

