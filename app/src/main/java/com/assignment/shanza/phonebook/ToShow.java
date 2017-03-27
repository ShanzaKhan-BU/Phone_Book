package com.assignment.shanza.phonebook;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;


public class ToShow extends AppCompatActivity {
    String name="asf";
    String twoDig="saf";
    String no="sdaf";
    String color;
    Drawable drawable;
    int id;


    TextView dispName;
    TextView dispTwo;
    TextView dispNum;
    Drawable db;
    int cf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.to_show);
        Intent myIntent = getIntent();


        name = myIntent.getStringExtra("Name");
        twoDig = myIntent.getStringExtra("Dig");
        no = myIntent.getStringExtra("Num");
        color = myIntent.getStringExtra("Color");
        dispNum = (TextView) findViewById(R.id.tvDifNum);
        dispTwo = (TextView) findViewById(R.id.bTwoDisp);
        dispName = (TextView) findViewById(R.id.tvDifName);
        dispTwo.setBackground(Global.db);


        dispTwo.setText(""+twoDig);
        dispName.setText(""+name);
        dispNum.setText(""+no);


    }
}
