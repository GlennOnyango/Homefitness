package com.example.homefitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(
        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN);

    }

    public void OpenLoginfromLanding(View view) {
        findViewById(R.id.loginPage).setVisibility(View.VISIBLE);
        findViewById(R.id.openLogin).setVisibility(View.INVISIBLE);

    }

    public void OpenJoin(View view) {
        findViewById(R.id.joinPage).setVisibility(View.VISIBLE);
        findViewById(R.id.openLogin).setVisibility(View.INVISIBLE);
        findViewById(R.id.loginPage).setVisibility(View.INVISIBLE);

    }

    public void OpenLoginfromjoin(View view) {
        findViewById(R.id.joinPage).setVisibility(View.INVISIBLE);
        findViewById(R.id.loginPage).setVisibility(View.VISIBLE);

    }
}
