package com.bignerdranch.andriod.lia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton voorzieningenBtn = findViewById(R.id.voorzieningenBtn);
        voorzieningenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VoorzieningenActivity.class);
                startActivity(intent);
            }
        });
        ImageButton maaltijdBtn = findViewById(R.id.maaltijdBtn);
        maaltijdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MaaltijdActivity.class);
                startActivity(intent);
            }
        });
    }
}
