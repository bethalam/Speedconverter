package com.example.dineshvarma.speedconverter;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] codes={"mph","fps","m/s","km/h","kn"};
    String[] names={"Mile per hour mph","Foot per second fps","Meter per second m/s","Kilometer per hour km/h","Knot kn"};
     CustomAdapter(Context c){
        context = c;
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView txt = new TextView(context);
        txt.setTextSize(24);
        txt.setText(codes[i]);
        txt.setTextColor(Color.parseColor("#000000"));
        return  txt;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView txt = new TextView(context);
        txt.setPadding(16, 16, 16, 16);
        txt.setTextSize(28);
        txt.setText(names[position]);
        txt.setTextColor(Color.parseColor("#000000"));
        return  txt;
    }
}
