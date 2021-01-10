package com.company.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Day> data;
    ListView listView;
    DayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list);

        data=new ArrayList<>();

        data.add(new Day("Saturday","One",R.drawable.one));
        data.add(new Day("Sunday","Two",R.drawable.two));
        data.add(new Day("Monday","Three",R.drawable.three));
        data.add(new Day("Tuesday","Four",R.drawable.four));
        data.add(new Day("Wednesday","Five",R.drawable.five));
        data.add(new Day("Thursday","Six",R.drawable.six));
        data.add(new Day("Friday","Seven",R.drawable.seven));

        adapter=new DayAdapter(MainActivity.this,data);
        listView.setAdapter(adapter);


    }
}