package com.dreamliner.jitpacksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dreamliner.jitpack.lib.JitpackTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView helloTv = (TextView) findViewById(R.id.hello_tv);
        helloTv.setText(JitpackTest.getHello());
    }
}
