package com.demo.myquotes;



import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.demo.myquotes.CategoriesActivity;
import com.demo.myquotes.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    EditText TxtEmail, TxtPsd;
    CardView cardsign;
    TextView txtsign;

    ImageView imgGoogle , imgFacebook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initview();
    }

    private void initview() {

        TxtEmail = findViewById(R.id.TxtEmail);
        TxtPsd = findViewById(R.id.TxtPsd);
        cardsign = findViewById(R.id.cardsign);
        txtsign = findViewById(R.id.txtsign);
        imgFacebook = findViewById(R.id.imgFacebook);
        imgGoogle = findViewById(R.id.imgGoogle);

        cardsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, password;
                username = TxtEmail.getText().toString();
                password = TxtPsd.getText().toString();
                if (username.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter your username", Toast.LENGTH_SHORT).show();
                } else
                {
                    if (password.isEmpty())
                    {
                        Toast.makeText(LoginActivity.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent g=new Intent(LoginActivity.this, CategoriesActivity.class);
                        startActivity(g);
                    }
                }
            }
        });
//        cardsign.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(LoginActivity.this,CategoriesActivity.class);
//                startActivity(i);
//            }
//        });


        imgGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.google.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        imgFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.facebook.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

    }
}
