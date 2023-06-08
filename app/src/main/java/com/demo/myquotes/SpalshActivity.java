package com.demo.myquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class SpalshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        initview();
    }

    private void initview() {

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(SpalshActivity.this,IntroduceActivity.class);
                startActivity(i);
                finish();
            }
        }, 4000);
    }
}


