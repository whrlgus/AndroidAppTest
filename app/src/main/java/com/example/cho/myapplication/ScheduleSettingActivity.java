package com.example.cho.myapplication;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class ScheduleSettingActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        String[] str = getResources().getStringArray(R.array.spinner_time);
        ArrayAdapter<String> arrAda = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item,str);

        Spinner spi_startTime = (Spinner)findViewById(R.id.spinner_startTime);
        spi_startTime.setAdapter(arrAda);
        spi_startTime.setOnItemSelectedListener(this);

        Spinner spi_endTime = (Spinner)findViewById(R.id.spinner_endTime);
        spi_endTime.setAdapter(arrAda);
        spi_endTime.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (view.getId()){
            case R.id.spinner_startTime:
                break;
            case R.id.spinner_endTime:
                break;

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
