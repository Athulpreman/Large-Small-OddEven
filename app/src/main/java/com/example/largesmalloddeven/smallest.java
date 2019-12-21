package com.example.largesmalloddeven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class smallest extends AppCompatActivity
{

    EditText e1,e2;
    String s1,s2;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_largest);

        e1=(EditText)findViewById(R.id.num1);
        e2=(EditText)findViewById(R.id.num2);
        t1=(TextView)findViewById(R.id.printlarge);
        b1=(Button)findViewById(R.id.findlarge);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1=e1.getText().toString().trim();
                s2=e2.getText().toString().trim();

                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);

                if(a<b)
                    t1.setText(a+"  is small");
                else
                    t1.setText(b+"  is small");
            }
        });
    }
}
