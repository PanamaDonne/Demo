package com.momo.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class CondoActivity extends Activity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condo);

        button1=(Button)findViewById(R.id.button1);
        button1.setText("YOUR SCHEDULE");

        button2=(Button)findViewById(R.id.button2);
        button2.setText("SCHEDULE CLASSES");

        button3=(Button)findViewById(R.id.button3);
        button3.setText("HOUSING PROBLEM");

        button4=(Button)findViewById(R.id.button4);
        button4.setText("NEWS");

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CondoActivity.this,schedule.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CondoActivity.this,classes.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CondoActivity.this,report.class);
                startActivity(intent);
            }
        });
    }


}