package com.example.homefitness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    List<IntroScreenDetails> screenDetails;
    Context mContext;

    public ViewPagerAdapter(List<IntroScreenDetails> screenDetails, Context mContext) {
        this.screenDetails = screenDetails;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.intro_screen_layout,null);

        ImageView imageView = view.findViewById(R.id.intro_image_view);

        imageView.setImageResource(screenDetails.get(position).getImage());

        container.addView(view);

        return view;

    }

    @Override
    public int getCount() {
        return screenDetails.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
