package com.example.android.takehomeassignment09_yuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.util.Calendar;

public class DateActivity extends AppCompatActivity {

    private TextView date;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        this.setTitle("What day is today?");
        date = (TextView) findViewById(R.id.date);
        back = (Button) findViewById(R.id.goBack);


        Calendar calendar = Calendar.getInstance();
        final String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        date.setText(currentDate);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DateActivity.this,MainActivity.class);
                i.putExtra("date",currentDate);
                startActivity(i);
            }
        });


    }
}
