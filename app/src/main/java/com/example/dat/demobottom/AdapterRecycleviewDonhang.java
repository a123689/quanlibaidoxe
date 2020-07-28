package com.example.dat.demobottom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dat.demobottom.Model.Category;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AdapterRecycleviewDonhang extends RecyclerView.Adapter<AdapterRecycleviewDonhang.Viewholer> {

    ArrayList<Category> giohangModelArrayList;
    int thanhtien =0;
    public AdapterRecycleviewDonhang(ArrayList<Category> arrayList){
        this.giohangModelArrayList = arrayList;


    }

    @NonNull
    @Override
    public Viewholer onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_category,viewGroup,false);
        return new Viewholer(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholer viewholer, int i) {


    }

    @Override
    public int getItemCount() {
        return giohangModelArrayList.size();
    }

    public class Viewholer extends RecyclerView.ViewHolder{


        public Viewholer(@NonNull View itemView) {
            super(itemView);

        }
    }
}
