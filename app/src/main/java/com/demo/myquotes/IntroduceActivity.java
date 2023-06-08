package com.demo.myquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IntroduceActivity extends AppCompatActivity {

    ImageView ImgStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce2);
        initview();
    }

    private void initview() {
        ImgStart = findViewById(R.id.ImgStart);

        ImgStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroduceActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}