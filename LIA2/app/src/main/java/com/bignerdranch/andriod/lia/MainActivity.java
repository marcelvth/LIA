package com.bignerdranch.andriod.lia;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog = new Dialog(this);

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
        ImageButton medicijnenBtn = findViewById(R.id.medicijnenBtn);
        medicijnenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MedicijnenActivity.class);
                startActivity(intent);
            }
        });
    }
    public void ShowVoiceControl(View v) {
        TextView txtclose;
        Button btnVoiceControl;
        myDialog.setContentView(R.layout.voice_activation);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("X");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
    public void ShowNoodGeval(View v) {
        TextView txtclose;
        Button btnNoodGeval;
        myDialog.setContentView(R.layout.ingevalvannood);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("X");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}


