package com.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.security.PublicKey;


public class MainActivity extends AppCompatActivity {

    int Total = 0, a = 0, b = 0, c = 0, d = 0, x = 0, y = 0;
    Boolean solid = false, liquid = false, gas = false, icecream = false;
    String Writetext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void submit(View view) {
        Total = 0;
        Total = a + b + c + d + x + y;
        Toast.makeText(getBaseContext(), Total + "/5", Toast.LENGTH_SHORT).show();
        CheckBox Solid = (CheckBox) findViewById(R.id.solid);
        solid = Solid.isChecked();
        CheckBox liq = (CheckBox) findViewById(R.id.liquid);
        liquid = liq.isChecked();
        CheckBox Gas = (CheckBox) findViewById(R.id.gas);
        gas = Gas.isChecked();
        CheckBox ice = (CheckBox) findViewById(R.id.icecream);
        icecream = ice.isChecked();

        if (solid == Boolean.TRUE && liquid == Boolean.TRUE && gas == Boolean.TRUE && icecream == Boolean.FALSE) {
            c = 1;
            Total = 0;
            Total = a + b + c + d + x + y;
        } else {
            c = 0;
        }

        EditText WriteText = (EditText) findViewById(R.id.EditText);
        Writetext = WriteText.getText().toString();
        if (Writetext.matches("")) {
            a = 0;
        } else {
            a = 1;
        }
        Total = 0;
        Total = a + b + c + d + x + y;
        Toast.makeText(getBaseContext(), Total + "/5", Toast.LENGTH_SHORT).show();
        return;

    }

    public void Q2RadioButtom(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.englishClub:
                if (checked) {
                    b = 0;
                    Total = 0;
                    Total = a + b + c + d + x + y;
                    break;
                }
            case R.id.spain:
                if (checked) {
                    b = 1;
                    Total = 0;
                    Total = a + b + c + d + x + y;
                    break;
                }

        }
    }

    public void Q4RadioButtom(View view) {
        boolean checked3 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.red:
                if (checked3) {
                    d = 0;
                    break;
                }
            case R.id.grey:
                if (checked3) {
                    d = 1;
                    Total = 0;
                    Total = a + b + c + d + x + y;
                    break;
                }
            case R.id.black:
                if (checked3) {
                    d = 0;
                    break;
                }


        }
    }

    public void Q5RadioButtom(View view) {
        boolean checked4 = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.meter:
                if (checked4) {
                    x = 0;
                    break;
                }
            case R.id.kg:
                if (checked4) {
                    x = 1;
                    Total = 0;
                    Total = a + b + c + d + x + y;
                    break;
                }
            case R.id.volt:
                if (checked4) {
                    x = 0;
                    break;
                }


        }
    }
}