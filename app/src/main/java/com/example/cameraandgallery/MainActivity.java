package com.example.cameraandgallery;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv;
    Button btn, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        iv = findViewById(R.id.imageView);

    }

    @Override
    public void onClick(View view) {
        if (view == btn) {

        } else if (view == btn2) {

        }
    }
}