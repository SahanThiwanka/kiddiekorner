package com.example.kinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout,constraintLayout1,constraintLayout2,constraintLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        constraintLayout = findViewById(R.id.constraintLayout);
        constraintLayout1 = findViewById(R.id.constraintLayout2);
        constraintLayout2= findViewById(R.id.constraintLayout4);
        constraintLayout3 = findViewById(R.id.constraintLayout3);

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menuActivity.this,Shapes1.class);
                startActivity(intent);
            }
        });
        constraintLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menuActivity.this,Shaoes2.class);
                startActivity(intent);
            }
        });
        constraintLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(menuActivity.this,ActivitySquareTutorial.class);
                startActivity(intent);
            }
        });
    }
}