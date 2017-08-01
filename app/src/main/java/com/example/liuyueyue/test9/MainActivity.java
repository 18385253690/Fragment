package com.example.liuyueyue.test9;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
private RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group = (RadioGroup) findViewById(R.id.radiogroup);
        group.setOnCheckedChangeListener(this);

    }
    //fragmeng切换模式
    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId){
            //静态Fragment切换
            case R.id.first:{
                Intent intent = new Intent(this,MainActivity2.class);
                startActivity(intent);
                break;

            }case R.id.second:{
                //动态Fragment切换
            Myfragment2 fragment2 = new Myfragment2();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.add(R.id.frame,fragment2);
                beginTransaction.addToBackStack(null);
                beginTransaction.commit();
                break;

            }case R.id.third:{
            Intent intent = new Intent(MainActivity.this,MainActivity3.class);
             startActivity(intent);
                break;

            }case R.id.fourth:{
                Intent intent = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
                break;

            }
        }
    }
}
