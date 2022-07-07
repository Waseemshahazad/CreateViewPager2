package com.codewithcoffee.createviewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager2Adapter adapter;
    private ViewPager2 viewPager2;
    private ArrayList<PicModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewpager2);

        list = new ArrayList<>();
        adapter = new ViewPager2Adapter(list,this);
        viewPager2.setAdapter(adapter);

        list.add(new PicModel(R.drawable.looks_one));
        list.add(new PicModel(R.drawable.looks_two));
        list.add(new PicModel(R.drawable.looks_three));
        list.add(new PicModel(R.drawable.looks_four));

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
}