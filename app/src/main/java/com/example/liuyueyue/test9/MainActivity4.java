package com.example.liuyueyue.test9;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.os.Build.VERSION_CODES.M;

public class MainActivity4 extends Activity implements Myfragment5.MyListener{
private EditText editText;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main4);
        editText = (EditText) findViewById(R.id.editText);
        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                Myfragment5 fragment5 = new Myfragment5();
                Bundle bundle = new Bundle();
                bundle.putString("name", text);
                fragment5.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction beginTransaction
                        = fragmentManager.beginTransaction();
                beginTransaction.add(R.id.layout, fragment5, "fragment5");
                beginTransaction.commit();
                Toast.makeText(MainActivity4.this,"向Fragment发送短信"+text,Toast.LENGTH_SHORT).show();

            }
        });
        FragmentManager fragmentManager = getFragmentManager();
        Fragment findFragmentById = fragmentManager.findFragmentById(R.id.frag);
        Myfragment frag = (Myfragment) findFragmentById;
        frag.setAaa("fragment静态传值");
    }

    @Override
    public void thank(String code) {
        Toast.makeText(MainActivity4.this, "已成功接收到"+",客气了!"
                ,Toast.LENGTH_SHORT).show();
    }
}