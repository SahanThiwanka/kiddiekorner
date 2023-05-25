package com.example.kinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Shapes1 extends AppCompatActivity {

    ConstraintLayout btncircle,btnsquare,btnrectangle,btntriangle,btnpentagon,btnparallelogram,btntrpezium,btnhexagon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes1);

        btncircle = findViewById(R.id.btncircle);
        btnsquare = findViewById(R.id.btnsquare);
        btnrectangle = findViewById(R.id.btnrectangle);
        btntriangle = findViewById(R.id.btntriangle);
        btnpentagon = findViewById(R.id.btnpentagon);
        btnparallelogram = findViewById(R.id.btnparallelogram);
        btntrpezium = findViewById(R.id.btntrpezium);
        btnhexagon = findViewById(R.id.btnhexagon);

        btncircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shapes1.this,ActivityCricleChange.class);
                startActivity(intent);
            }
        });

        btnsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shapes1.this,ActivitySquareChange.class);
                startActivity(intent);
            }
        });

        btnrectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shapes1.this, ActivityRectangleChange.class);
                startActivity(intent);
            }
        });

        btntriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shapes1.this, ActivityTriangleChange.class);
                startActivity(intent);
            }
        });
        btnpentagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shapes1.this, ActivityPentagonChange.class);
                startActivity(intent);
            }
        });

        btnparallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shapes1.this,ActivityParallelogramChange.class);
                startActivity(intent);
            }
        });
        btntrpezium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shapes1.this, ActivityTripizumChange.class);
                startActivity(intent);
            }
        });

        btnhexagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shapes1.this, ActivityHexagonChange.class);
                startActivity(intent);
            }
        });


    }
}