package jiyun.com.boluomidemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jiyun.com.boluomidemo.R;

public class ZhuyeFragment extends Fragment {


    public ZhuyeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_zhuye, container, false);
    }

}
