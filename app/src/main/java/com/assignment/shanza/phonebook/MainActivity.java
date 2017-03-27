package com.assignment.shanza.phonebook;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import javax.microedition.khronos.opengles.GL;

public class MainActivity extends AppCompatActivity {
    public static Drawable db2;
    ListView myCustomList;
    //  String[] data = getResources().getStringArray(R.array.name);

    String data[];
    String data2[];
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data=getResources().getStringArray(R.array.name);
        data2=getResources().getStringArray(R.array.num);
        list = (ListView) findViewById(R.id.lv);
        CustomAdapter adapter = new CustomAdapter(MainActivity.this, data, data2);

        list.setAdapter(adapter);
       /* CustomAdapter adapter = new CustomAdapter(MainActivity.this,data,data2);
        list=(ListView) findViewById(R.id.lv);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +data[+ position], Toast.LENGTH_SHORT).show();

            }
        });

*/

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {
                String value = (String) adapter.getItemAtPosition(position);
                // assuming string and if you want to get the value on click of list item
                // do what you intend to do on click of listview row
                String twoDigTemp;
                String NameTemp;
                String noTemp;
                TextView tn = (TextView) v.findViewById(R.id.TwoDig);
                TextView nme = (TextView) v.findViewById(R.id.tvName);
                TextView phn = (TextView) v.findViewById(R.id.tvNum);

                twoDigTemp = tn.getText().toString();
                NameTemp = nme.getText().toString();
                noTemp = phn.getText().toString();

                String abc = ""+tn.getBackground();
                //   Toast.makeText(getApplicationContext(),""+myColor.getColorFilter(),Toast.LENGTH_SHORT).show();


                Intent myIntent = new Intent(MainActivity.this,ToShow.class);
                myIntent.putExtra("Dig",twoDigTemp);
                myIntent.putExtra("Name",NameTemp);
                myIntent.putExtra("Num",noTemp);
                myIntent.putExtra("Color",abc);
                Global.db = tn.getBackground();
                startActivity(myIntent);

            }
        });

    }
}

