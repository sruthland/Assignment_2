package com.example.stephen.traveland;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.stephen.traveland.Models.Country;

import java.util.ArrayList;
import java.util.List;

public class AdapterData2 extends ArrayAdapter<Country> {

    private Activity activity;
    private ArrayList<Country> data2s;
    private LayoutInflater inflater = null;

    public AdapterData2(Activity act, int resource, List<Country> data2s) {
        super(act, resource, data2s);
        this.activity = act;
        //this.data2s = data2s;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public static class ViewHolder {
        public TextView displayTitle;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        final ViewHolder holder;

        try {
            if (view == null) {
                view = inflater.inflate(R.layout.item_view, parent, false);
                holder = new ViewHolder();

                holder.displayTitle = (TextView) view.findViewById(R.id.itemView_title);
            } else {
                holder = (ViewHolder) view.getTag();
            }

            Log.i("RAWR: ", "" + data2s.get(position).getEng().getName());

            holder.displayTitle.setText(data2s.get(position).getEng().getName());
        } catch (Exception e) {
            Log.e("ERROR", "error ", e);
            return null;
        }

        return view;
    }
}
