package com.example.largesmalloddeven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OddEven extends AppCompatActivity {

    EditText e1;
    TextView t1;
    Button b1;
    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odd_even);

        e1=(EditText)findViewById(R.id.oddeven);
        t1=(TextView)findViewById(R.id.oddevenPrint);
        b1=(Button)findViewById(R.id.oddevencheck);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = e1.getText().toString().trim();
                int i = Integer.parseInt(s1);

                if ((i % 2) == 0)
                {
                    t1.setText("Number is EVEN");
                }
                else
                {
                    t1.setText("Number is ODD");
                }
            }
        });
    }
}
