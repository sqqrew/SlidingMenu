package com.a_zona.slidingmenu.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a_zona.slidingmenu.R;

/**
 * Created by Alexey Filyushin (sqqrew@gmail.com) on 13.01.2015.
 * Package: com.a_zona.slidingmenu.fragment
 * Project: SlidingMenu
 * <p/>
 * Copyright (c) 2014 A-Zona, Inc.
 */
public class HomeFragment extends Fragment {

    public HomeFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        return rootView;
    }
}