package com.siokas.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    TextView tv;
    Button bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.text_view);
        bt2 = (Button) findViewById(R.id.change2);
        bt3 = (Button) findViewById(R.id.change3);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Hello Android 2");
            }
        });

        bt3.setOnClickListener(this);
    }

    public void changeText1(View view){
        tv.setText("Hello Android 1");
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.change3:
                tv.setText("Hello Android 3");
                break;
        }
    }
}
