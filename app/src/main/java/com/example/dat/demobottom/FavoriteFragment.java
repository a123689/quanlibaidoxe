package com.example.dat.demobottom;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.dat.demobottom.Model.Category;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * create an instance of this fragment.
 */
public class FavoriteFragment extends Fragment {


    public FavoriteFragment() {
        // Required empty public constructor
    }
    GridView gridView;
    AdapterGridviewThucdon adapterGridviewThucdon;
    ArrayList<Category> arraylist;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gridView = view.findViewById(R.id.gridview);
        arraylist = new ArrayList<>();
        arraylist.add(new Category(1,"a", R.drawable.rectangle));
        arraylist.add(new Category(2,"b", R.drawable.rectangle1));
        arraylist.add(new Category(3,"c", R.drawable.rectangle2));
        arraylist.add(new Category(4,"d", R.drawable.rectangle3));
        arraylist.add(new Category(5,"e", R.drawable.rectangle4));
        arraylist.add(new Category(6,"f", R.drawable.rectangle5));
        adapterGridviewThucdon = new AdapterGridviewThucdon(getActivity(),R.layout.item,arraylist);
        gridView.setAdapter(adapterGridviewThucdon);

    }
}
