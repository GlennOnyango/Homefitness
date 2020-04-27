package com.example.homefitness;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class IntroAdapter extends FragmentStateAdapter {
    public IntroAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new IntroFragment();

            case 1:
                return  new IntroFragment1();

            case 2:
                return new IntroFragment2();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
