package com.assignment.shanza.phonebook;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Random;
public class CustomAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String data[];
    private final String data2[];
    private String data3[];


    int colId;
    TextView tvTwo;
    TextView tvName;
    TextView tvNum;
    Drawable myCircle;
    public CustomAdapter(Activity context, String[] web, String[] imageId) {
        super(context, R.layout.custom_adapter, web);
        this.context = context;
        this.data = web;
        this.data2 = imageId;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.custom_adapter, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.tvName);
        txtTitle.setText(data[position]);
        tvTwo = (TextView) rowView.findViewById(R.id.TwoDig); //For two dig
        tvName = (TextView) rowView.findViewById(R.id.tvName);//For Name
        tvNum = (TextView) rowView.findViewById(R.id.tvNum);//For Number
        breakDown();
        //////////////////////////////////////////
        myCircle = context.getResources().getDrawable(R.drawable.circle);

        ///
        //final String TAG = "MyActivity";
        //Log.v(TAG, " mY rnadong index=" + rand.nextInt(5));

        Random r = new Random();
        int num = r.nextInt(5);
        String s;
        int colIdTemp[] ={R.color.changingColor1,R.color.changingColor2,R.color.changingColor3,R.color.changingColor4,R.color.changingColor5,R.color.changingColor6};

        colId = colIdTemp[num];//color id
        /*switch (rand.nextInt()){
            case 1:
                 colId = R.color.changingColor1;
                break;
            case 2:
                colId = R.color.changingColor2;
                break;
            case 3:
                colId = R.color.changingColor3;
                break;
            case 4:
                colId = R.color.changingColor4;
                break;
            case 5:
                colId = R.color.changingColor5;
                break;
            case 6:
                colId = R.color.changingColor6;
                break;
        *///}
        int mycolor = context.getResources().getColor(colId);

        myCircle.setColorFilter(mycolor, PorterDuff.Mode.SRC_ATOP);
        tvTwo.setBackground(myCircle);



        ////////////////////////////////////////////
        tvTwo.setText(data3[position]);
        tvName.setText(""+data[position]);
        tvNum.setText(""+data2[position]);

        return rowView;

    }

    public void breakDown() {
        String temp;
        int index;
        data3 = new String[data.length];
        String zzz;
        String bzzz;
        //String  a[]={"Huzaifa Ahmed","Tayyab Satti","Abdul Wahab"};
        for (int i = 0; i < data.length; i++) {
            temp = data[i];
            index = temp.indexOf(" ");
            System.out.println(index);
            zzz = Character.toString(temp.charAt(0));
            bzzz = Character.toString(temp.charAt(index + 1));

            data3[i] = zzz;
            data3[i] = data3[i].concat(bzzz);

        }
    }
   /* private Activity context;
    String data3[]; //To store 2 digits



    TextView tvTwo;
    TextView tvName;
    TextView tvNum;

    public CustomAdapter(Activity context,String data[],String data2[]){
        super(context,R.layout.custom_adapter);
        this.data = data;
        this.data2 = data2;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_adapter,null,true);
        breakDown();
        tvTwo = (TextView) rowView.findViewById(R.id.TwoDig); //For two dig
        tvName = (TextView) rowView.findViewById(R.id.tvName);//For Name
        tvNum = (TextView) rowView.findViewById(R.id.tvNum);//For Number

         tvTwo.setText(data3[position]);
        tvName.setText(data[position]);
        tvNum.setText(data2[position]);

        return rowView;
    }

    public void breakDown(){
        String temp;
        int index;
        data3 = new String[data.length];
        String zzz;
        String bzzz;
        //String  a[]={"Huzaifa Ahmed","Tayyab Satti","Abdul Wahab"};
        for(int i=0;i<data.length;i++){
            temp = data[i];
            index = temp.indexOf(" ");
            System.out.println(index);
            zzz = Character.toString(temp.charAt(0));
            bzzz = Character.toString(temp.charAt(index+1));

            data3[i] = zzz;
            data3[i] = data3[i].concat(bzzz);

        }
    }*/

}

