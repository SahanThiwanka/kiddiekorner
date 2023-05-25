package com.example.kinder;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public class ActivityRectangleChange extends AppCompatActivity {

    ConstraintLayout btnstart;
    ImageView img;
    EditText xvalue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_change);

        btnstart = findViewById(R.id.startbtn);
        img = findViewById(R.id.square_color);
        xvalue = findViewById(R.id.getxvalue);


        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ViewGroup.LayoutParams layoutParams = img.getLayoutParams();
                layoutParams.height = Integer.parseInt(xvalue.getText().toString());
                layoutParams.width = Integer.parseInt(xvalue.getText().toString());


                img.setLayoutParams(layoutParams);
            }
        });
}}