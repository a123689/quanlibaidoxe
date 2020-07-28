package com.example.dat.demobottom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.dat.demobottom.Model.Category;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AdapterGridviewThucdon extends ArrayAdapter<Category> {
    ArrayList<Category> thucdonModels;
    int resoure;
    Context context;
    public AdapterGridviewThucdon( Context context, int resource,  ArrayList<Category> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resoure  = resource;
        this.thucdonModels = objects;
    }

    class Viewholer{
        TextView tvtenthucdon,tvdongia;

        public Viewholer(View view){
            tvtenthucdon = view.findViewById(R.id.user_name);


        }
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View view = convertView;
        Viewholer viewholer;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(resoure,parent,false);
            viewholer = new Viewholer(view);
            view.setTag(viewholer);
        }

        viewholer = (Viewholer) view.getTag();
        Category thucdonModel = thucdonModels.get(position);
        if(thucdonModel != null){
            viewholer.tvtenthucdon.setText(thucdonModel.getName());

        }
        return view;
    }
}
