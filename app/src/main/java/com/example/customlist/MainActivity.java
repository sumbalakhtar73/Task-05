package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.customlist.adapter.CustomAdapterList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int[] image={R.drawable.apple,R.drawable.banana,R.drawable.cake,R.drawable.dog
            ,R.drawable.egg,R.drawable.fishh,R.drawable.goat,R.drawable.horseee};
    String[] names={"A is Apple","B is Banana","C is Cake","D is Dog","E is Egg","F is Fish"
            ,"G is Goat","H is Horse"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list);
        CustomAdapterList  customAdapterList=new CustomAdapterList(MainActivity.this,image,names);

        listView.setAdapter(customAdapterList);


    }
}
