package com.example.swipeview;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = new PageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("count", position + 1);

        //setting the arguments for the page Fragment to get
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
