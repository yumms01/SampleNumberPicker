package com.example.tacademy.samplenumberpicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textView1, textView2, textView3, textView4, textView5;
    private int uprange_year = 2018;
    private int downrange_year = 2015;
    private int values_year = 2016;

    private int uprange_month = 12;
    private int downrange_month = 1;
    private int values_month = 1;

    private int uprange_hour = 23;
    private int downrange_hour = 1;
    private int values_hour = 1;

    private int uprange_day = 31;
    private int downrange_day = 1;
    private int values_day = 1;

    private int uprange_minute = 59;
    private int downrange_minute = 1;
    private int values_minute = 1;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView4 = (TextView)findViewById(R.id.textView4);
        textView5 = (TextView)findViewById(R.id.textView5);

        Button upButton1 = (Button)findViewById(R.id.upButton1);
        upButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_year >= downrange_year && values_year <= uprange_year)
                    values_year++;
                if (values_year > uprange_year)
                    values_year = downrange_year;
                textView1.setText("" + values_year);
            }
        });
        Button upButton2 = (Button)findViewById(R.id.upButton2);
        upButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_month >= downrange_month && values_month <= uprange_month)
                    values_month++;
                if (values_month > uprange_month)
                    values_month = downrange_month;
                textView2.setText("" + values_month);
            }
        });
        Button upButton3 = (Button)findViewById(R.id.upButton3);
        upButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_day >= downrange_day && values_day <= uprange_day)
                    values_day++;
                if (values_day > uprange_day)
                    values_day = downrange_day;
                textView3.setText("" + values_day);
            }
        });
        Button upButton4 = (Button)findViewById(R.id.upButton4);
        upButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_hour >= downrange_hour && values_hour <= uprange_hour)
                    values_hour++;
                if (values_hour > uprange_hour)
                    values_hour = downrange_hour;
                textView4.setText("" + values_hour);
            }
        });
        Button upButton5 = (Button)findViewById(R.id.upButton5);
        upButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_minute >= downrange_minute && values_minute <= uprange_minute)
                    values_minute++;
                if (values_minute > uprange_minute)
                    values_minute = downrange_minute;
                textView5.setText("" + values_minute);
            }
        });

        Button downButton1 = (Button)findViewById(R.id.downButton1);
        downButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_year >= downrange_year && values_year <= uprange_year)
                    values_year--;

                if (values_year < downrange_year)
                    values_year = uprange_year;

                textView1.setText(values_year + "");
            }
        });
        Button downButton2 = (Button)findViewById(R.id.downButton2);
        downButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_month >= downrange_month && values_month <= uprange_month)
                    values_month--;

                if (values_month < downrange_month)
                    values_month = uprange_month;

                textView2.setText(values_month + "");
            }
        });
        Button downButton3 = (Button)findViewById(R.id.downButton3);
        downButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_day >= downrange_day && values_day <= uprange_day)
                    values_day--;

                if (values_day < downrange_day)
                    values_day = uprange_day;

                textView3.setText(values_day + "");
            }
        });
        Button downButton4 = (Button)findViewById(R.id.downButton4);
        downButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_hour >= downrange_hour && values_hour <= uprange_hour)
                    values_hour--;

                if (values_hour < downrange_hour)
                    values_hour = uprange_hour;

                textView4.setText(values_hour + "");
            }
        });
        Button downButton5 = (Button)findViewById(R.id.downButton5);
        downButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (values_minute >= downrange_minute && values_minute <= uprange_minute)
                    values_minute--;

                if (values_minute < downrange_minute)
                    values_minute = uprange_minute;

                textView5.setText(values_minute + "");
            }
        });


    }
}

