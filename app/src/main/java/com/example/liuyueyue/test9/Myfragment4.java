package com.example.liuyueyue.test9;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by liuyueyue on 2017/7/29.
 */

public class Myfragment4 extends Fragment {
    private TextView tv;
    /*
    * 每次创建都会绘制Fragment的view组件时回调该方法
    * */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container,false);
        tv = (TextView) view.findViewById(R.id.text);
        tv.setText("第二个fragment");
        Log.i("Main","Fraagment2--onCreatView()");
        return view;
    }
    /*
    当fragment被添加到Activity的时候，会回调这个方法，并且只调用一次
    */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("Main","Fraagment2--onAttach()");
    }
    /*
    创建Fragment时调用，只调用一次
    */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Main","Fraagment2--onCreate()");
    }
    /*
    当Fragment所在的Activity启动完成后调用
    */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Main","Fraagment2--onActivityCreated()");
    }
    /*
    * 启用Fragment
    * */
    @Override
    public void onStart() {
        super.onStart();
        Log.i("Main","Fraagment2--onStart()");
    }
    /*
    * 恢复Fragment的时候会被回调，调用onStart()的方法后面一定会调用onResume()方法
    * */
    @Override
    public void onResume() {
        super.onResume();
        Log.i("Main","Fraagment2--onResume()");
    }
    /*
    * 暂停fragment
    * */
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Main","Fraagment2--onPause()");
    }
    /*
    * 停止fragment
    */
    @Override
    public void onStop() {
        super.onStop();
        Log.i("Main","Fraagment2--onStop()");
    }
    /*
    销毁Fragment所包含的View组件时
    */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Main","Fraagment2--onDestroyView()");
    }

    /*
    销毁Fragment的时候调用
   */
    public void onDestroy() {
        super.onDestroy();
        Log.i("Main","Fraagment2--onDestroy()");
    }
    /*
    * Fragment从Activity中删除时回调该方法，并且只调用一次
    * */
    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Main","Fraagment2--onDetach()");
    }
}
