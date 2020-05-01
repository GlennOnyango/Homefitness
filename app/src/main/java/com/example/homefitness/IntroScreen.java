package com.example.homefitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroScreen extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Full Screen Display
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_intro_screen);

        viewPager = findViewById(R.id.intro_view_pager);
        tabLayout = findViewById(R.id.intro_tab);


        List<IntroScreenDetails> screenDetails = new ArrayList<>();
        screenDetails.add(new IntroScreenDetails(R.drawable.intro_slide_image_1));
        screenDetails.add(new IntroScreenDetails(R.drawable.intro_slide_image_2));
        screenDetails.add(new IntroScreenDetails(R.drawable.intro_slide_image_3));
        screenDetails.add(new IntroScreenDetails(R.drawable.intro_slide_image_4));

        ViewPagerAdapter adapter = new ViewPagerAdapter(screenDetails,this);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }
}
