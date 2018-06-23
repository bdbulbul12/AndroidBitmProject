package com.programmerhuntbd.bulbul.customadapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bulbul on 6/23/2018.
 */

public class PersonAdapter extends ArrayAdapter<ContactPerson>{
    private Context context;
    private ArrayList<ContactPerson> persons;

    public PersonAdapter(@NonNull Context context, ArrayList<ContactPerson>persons) {
        super(context, R.layout.row_layout, persons);
        this.context=context;
        this.persons=persons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.row_layout,parent,false);

        TextView name = (TextView) convertView.findViewById(R.id.studentName);
        TextView phone = (TextView) convertView.findViewById(R.id.phoneNumber);
        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);

        name.setText(persons.get(position).getPersonName());
        phone.setText(persons.get(position).getPhoneNumber());
        return convertView;
    }
}
