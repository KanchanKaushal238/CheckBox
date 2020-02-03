package com.kanchan.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox cb1, cb2, cb3, cb4, cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.java);
        cb1.setOnClickListener(this);

         cb2 = findViewById(R.id.python);
        cb2.setOnClickListener(this);

        cb3 = findViewById(R.id.c);
        cb3.setOnClickListener(this);

         cb4 = findViewById(R.id.android);
        cb4.setOnClickListener(this);

        cb5 = findViewById(R.id.css);
        cb5.setOnClickListener(this);


    }
    @Override

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.java:
                if(cb1.isChecked())

                    Toast.makeText(getApplicationContext(), "JAVA", Toast.LENGTH_LONG).show();

                break;

            case R.id.python:
                if(cb2.isChecked())

                    Toast.makeText(getApplicationContext(), "PYTHON", Toast.LENGTH_LONG).show();

                break;

            case R.id.c:
                if(cb3.isChecked())

                    Toast.makeText(getApplicationContext(), "C", Toast.LENGTH_LONG).show();

                break;

            case R.id.android:
                if(cb4.isChecked())

                    Toast.makeText(getApplicationContext(), "ANDROID", Toast.LENGTH_LONG).show();

                break;

            case R.id.css:
                if(cb5.isChecked())

                    Toast.makeText(getApplicationContext(), "CSS", Toast.LENGTH_LONG).show();

                break;
        }
    }
}
