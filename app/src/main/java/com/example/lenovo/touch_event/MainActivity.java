package com.example.lenovo.touch_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ExploreTouchEvent(this,null));



    }
}
//  setContentView(new ExploreTouchEvent(this,null));
