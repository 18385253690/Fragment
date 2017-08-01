package com.example.liuyueyue.test9;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.liuyueyue.test9.R.layout.fragment2;

public class MainActivity3 extends Activity {
    private Button button;
    private Fragment frag;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        init();
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction beginTransaction = fragmentManager
                        .beginTransaction();
                if(flag){
                    Myfragment4 frag4 = new Myfragment4();
                    beginTransaction.replace(R.id.layout,frag4);
                    flag = false;
                }else{
                    Myfragment3 frag3 = new Myfragment3();
                    beginTransaction.replace(R.id.layout,frag3);
                    flag = true;
                }
                beginTransaction.commit();
            }
        });
    }

    private void init() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager
                .beginTransaction();
        Myfragment3 frag3 = new Myfragment3();
        beginTransaction.add(R.id.layout,frag3);
        beginTransaction.commit();
    }
}
