package com.example.administrator.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class endActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        TextView endscore = (TextView) findViewById(R.id.endscore);
        TextView regame = (TextView) findViewById(R.id.regame);
        final Intent getintent = getIntent();
        endscore.setText("Счет : "+ getintent.getIntExtra("Счет",0));

        regame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if (getintent.getIntExtra("Счет",0) > 10) {
                    intent = new Intent(endActivity.this,theoryActivity.class);
                }
                else intent = new Intent(endActivity.this,MainActivity.class);

                startActivity(intent);
                finish();
            }
        });
    }
}
