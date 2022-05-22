package com.example.administrator.test2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class testActivity extends AppCompatActivity implements View.OnClickListener {

    Button button2;
    CheckBox checkbox;
    CheckBox checkbox2;
    CheckBox checkbox3;
    CheckBox checkbox4;
    CheckBox checkbox5;
    CheckBox checkbox6;
    CheckBox checkbox7;
    CheckBox checkbox8;
    CheckBox checkbox9;
    TextView textView26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener((View.OnClickListener) this);
        checkbox = (CheckBox) findViewById(R.id.checkBox);
        checkbox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkbox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkbox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkbox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkbox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkbox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkbox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkbox9 = (CheckBox) findViewById(R.id.checkBox9);
        textView26 = (TextView) findViewById(R.id.textView26);

    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                if (checkbox.isChecked() & checkbox5.isChecked() & checkbox7.isChecked() &
                        !checkbox2.isChecked() & !checkbox3.isChecked() & !checkbox4.isChecked() &
                        !checkbox6.isChecked() & !checkbox8.isChecked() & !checkbox9.isChecked()) {
                    textView26.setText("Результат: ПОЗДРАВЛЯЕМ! ТЕСТ ПРОЙДЕН!");
                    textView26.setTextColor(Color.GREEN);
                }
                else {
                    textView26.setText("Результат: ТЕСТ НЕ ПРОЙДЕН!");
                    textView26.setTextColor(Color.RED);
                }

                //Intent intent = new Intent(Activity.this, testActivity.class);
                //startActivity(intent);
                //finish();
                break;
            default:
                break;
        }
    }
}