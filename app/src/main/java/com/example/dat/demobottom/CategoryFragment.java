package com.example.dat.demobottom;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dat.demobottom.Model.Category;
import com.example.dat.demobottom.Presenter.Logic.CategoryLogic;
import com.example.dat.demobottom.View.ViewCategory;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * create an instance of this fragment.
 */
public class CategoryFragment extends Fragment implements ViewCategory {


    public CategoryFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    RecyclerView mRecyclerView;
    RecyclerViewAdapter mRcvAdapter;
    List<Category> arraylist;
    AdapterCategory adapterCategory;
    CategoryLogic categoryLogic;
    @SuppressLint("WrongConstant")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.recycleviewCategory);
        arraylist = new ArrayList<>();
        arraylist.add(new Category(1,"a", R.drawable.rectangle));
        arraylist.add(new Category(2,"b", R.drawable.rectangle1));
        arraylist.add(new Category(3,"c", R.drawable.rectangle2));
        arraylist.add(new Category(4,"d", R.drawable.rectangle3));
        arraylist.add(new Category(5,"e", R.drawable.rectangle4));
        arraylist.add(new Category(6,"f", R.drawable.rectangle5));
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRcvAdapter = new RecyclerViewAdapter(arraylist);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRcvAdapter);
    }


    @Override
    public void viewListcategory(ArrayList<Category> categories) {
        //setrecycleview(categories);
    }
}
