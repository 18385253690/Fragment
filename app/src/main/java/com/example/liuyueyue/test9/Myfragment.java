package com.example.liuyueyue.test9;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.id;

/**
 * Created by liuyueyue on 2017/7/29.
 */

public class Myfragment extends Fragment {

    private String aaa;
    private Button button;


    @Nullable
    @Override
    //静态加载fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //layout布局文件转换成view对象
        /*resource:fragment需要加载的布局文件
        * root：加载layout的父viewgroup
        * attactroot:false，不返回父viewgroup*/
        View view = inflater.inflate(R.layout.fragment,container,false);
        TextView text = (TextView) view.findViewById(R.id.text);
        button = (Button) view.findViewById(R.id.button);
        text.setText("静态加载fragment");
        button.setText("获取内容");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = getAaa();
                Toast.makeText(getActivity(),"value="+value,Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }
}
