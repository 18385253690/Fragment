package com.example.liuyueyue.test9;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by liuyueyue on 2017/7/29.
 */

public class Myfragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container,false);
        TextView text = (TextView) view.findViewById(R.id.text);
        text.setText("动态加载fragment");
        return view;
    }
}
