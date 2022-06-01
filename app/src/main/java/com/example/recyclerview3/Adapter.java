package com.example.recyclerview3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//1- extends RecyclerView.Adapter<Adapter.ViewHolder>

public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<ModelClass> userList;

//4 - Make Constructor

    public Adapter (List<ModelClass>userList){this.userList = userList; }
//2 - implements methods OnCreateViewHolder , OnBindViewHolder ,
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent, false);
      return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

//5- declare variable  and get the values.

//i take i image view1 and 1 textview 1 so i declare it one one time. It may many which your takes
//in your xml file (i,e - item.design)

        int resource = userList.get(position).getImageview1();
        String name = userList.get(position).getTextview1();

//6 - Now sending our data to our Holder
//Note we pass only resource, name because we take 2 data in item_design.xml.It may many which you
//take in item_design.xml

        holder.setData(resource,name);  //12- shift+enter click on setData and create method automatically.

    }

    @Override
    public int getItemCount() {

 //7 - Return userList size
        return userList.size();
    }
//3 - Create class of extended ViewHolder i.e ( public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder>
    public class ViewHolder extends RecyclerView.ViewHolder{     //8- extends RecyclerView.ViewHolder

 //10- Simply declare an variable for our 1st imageview
 //i declare 2 items because i implements 2 items in item_design.xml

    private ImageView imageView;
    private TextView textView;


 //9- Create Constructor matching super (hold cursor on red line)

     public ViewHolder(@NonNull View itemView) {
        super(itemView);

//11- Here we assign our xml id into java ids.
//i assign 2 data , because i use 2 items in item_design.xml

        imageView=itemView.findViewById(R.id.imageview1);
        textView=itemView.findViewById(R.id.textview1);

    }

//12- a - created through setData (shift+enter)

    public void setData(int resource, String name) {

///12- b - set data into these variables
// i set 2 data only bcz i use only 2 data in item_design.xml

    imageView.setImageResource(resource);
    textView.setText(name);
    }
}
}
