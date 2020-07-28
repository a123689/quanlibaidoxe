package com.example.dat.demobottom.Presenter.Logic;

import com.example.dat.demobottom.Model.Category;
import com.example.dat.demobottom.Presenter.Pre.PresenterCategory;
import com.example.dat.demobottom.R;
import com.example.dat.demobottom.View.ViewCategory;

import java.util.ArrayList;

public class CategoryLogic implements PresenterCategory {
    ViewCategory viewCategory;
    public CategoryLogic(ViewCategory viewCategory){
        this.viewCategory = viewCategory;
    }
    @Override
    public void listCategory() {
        ArrayList<Category> arrayList = new ArrayList<>();
        arrayList.add(new Category(1,"a", R.drawable.rectangle));
        arrayList.add(new Category(2,"b", R.drawable.rectangle1));
        arrayList.add(new Category(3,"c", R.drawable.rectangle2));
        arrayList.add(new Category(4,"d", R.drawable.rectangle3));
        arrayList.add(new Category(5,"e", R.drawable.rectangle4));
        arrayList.add(new Category(6,"f", R.drawable.rectangle5));

        viewCategory.viewListcategory(arrayList);
    }


}
