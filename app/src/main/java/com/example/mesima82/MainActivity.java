package com.example.mesima82;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    View background;
    RadioGroup radioGroup1;
    //RadioButton radioButton1;
    //RadioButton radioButton2;
    //RadioButton radioButton3;
    //RadioButton radioButton4;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch switch1;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        //radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        //radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        //radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        switch1 = (Switch) findViewById(R.id.switch1);
        background = (View) findViewById(R.id.background);
        btn = (Button) findViewById(R.id.btn);
    }


    public void redClicked(View view)
    {
        if(!(switch1.isChecked()))
        {
            background.setBackgroundColor(Color.RED);
        }
    }

    public void greenClicked(View view)
    {
        if(!(switch1.isChecked()))
        {
            background.setBackgroundColor(Color.GREEN);
        }
    }

    public void blueClicked(View view)
    {
        if(!(switch1.isChecked()))
        {
            background.setBackgroundColor(Color.BLUE);
        }
    }

    public void yellowClicked(View view)
    {
        if(!(switch1.isChecked()))
        {
            background.setBackgroundColor(Color.YELLOW);
        }
    }

    public void clicker(View view)
    {
        int radioid = radioGroup1.getCheckedRadioButtonId();
        if(radioid == R.id.radioButton1)
            background.setBackgroundColor(Color.RED);
        else if(radioid == R.id.radioButton2)
            background.setBackgroundColor(Color.GREEN);
        else if(radioid == R.id.radioButton3)
            background.setBackgroundColor(Color.BLUE);
        else if(radioid == R.id.radioButton4)
            background.setBackgroundColor(Color.YELLOW);
    }
}

