package com.example.recyclerview3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//1- we have to declare some variables

    RecyclerView recyclerView;

//2- declare variable for Linear Layout

    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//3- set our data RecyclerView for this we have to create function.
        initData();          //5- Create method from it.
        initRecyclerView(); //4- Create method from it.


    }
//5 - a- method
    private void initData() {

//5 - b-
    userList = new ArrayList<>();
//5- c- give parameter for display in our project, ( data you use in item_design data , like image1, Text ).

    userList.add(new ModelClass(R.drawable.img1,"Aradhana"));
        userList.add(new ModelClass(R.drawable.img2,"Aradhana"));
        userList.add(new ModelClass(R.drawable.img3,"Aradhana"));
        userList.add(new ModelClass(R.drawable.img4,"Aastha"));
        userList.add(new ModelClass(R.drawable.img5,"Mine"));
        userList.add(new ModelClass(R.drawable.img6,"Ankita and Aastha"));
        userList.add(new ModelClass(R.drawable.img7,"Nikki"));
        userList.add(new ModelClass(R.drawable.img8,"Gang"));
        userList.add(new ModelClass(R.drawable.img9,"Squad"));

    }

    //4 - a - method
    private void initRecyclerView() {

//4 - b-
    recyclerView=findViewById(R.id.recyclerview);
    layoutManager= new LinearLayoutManager(this);
    layoutManager.setOrientation(RecyclerView.VERTICAL);
    recyclerView.setLayoutManager(layoutManager);
    adapter=new Adapter(userList);
    recyclerView.setAdapter(adapter);
    adapter.notifyDataSetChanged();

    }
}