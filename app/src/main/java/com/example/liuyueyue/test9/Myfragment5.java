package com.example.liuyueyue.test9;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by liuyueyue on 2017/7/29.
 */

public class Myfragment5 extends Fragment{
    private String code = "thanks,your activity";


    public MyListener listener;
    public interface MyListener{

        public void thank(String code);

    }

    @Override
    public void onAttach(Activity activity) {
        listener = (MyListener) activity;
        super.onAttach(activity);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container,false);
        TextView tv = (TextView) view.findViewById(R.id.text);
        String text = getArguments().get("name")+"";
        tv.setText(text);
        Toast.makeText(getActivity(),"已成功接收"+text,Toast.LENGTH_SHORT).show();
        Toast.makeText(getActivity(),"向Activity发送"+code,Toast.LENGTH_SHORT).show();
        listener.thank(code);
        return view;

    }
}
