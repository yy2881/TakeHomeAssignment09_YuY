package com.example.android.takehomeassignment09_yuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private TextView view;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myRef = database.getReference("Event");
    private Event e = new Event("Java Class",3,true);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (TextView) findViewById(R.id.topView);
        Intent newIntent = getIntent();
        String date = newIntent.getStringExtra("date");
        view.setText(date);
    }

    public void seeDate(View view){
        Intent intent = new Intent(MainActivity.this,DateActivity.class);
        startActivity(intent);
    }

    public void addEvent(View view){
        myRef.push().setValue(new Event("Group Meeting",2,true));

    }

    public void setEvent(View view){
        myRef.setValue(e);

    }



}
