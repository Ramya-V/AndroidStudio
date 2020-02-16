package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variable initialization
    EditText Edit1,Edit2;
    TextView Text;
    Button add,sub,mul,div;
    int n1,n2;
    float res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Component Initialization
        Edit1 = findViewById(R.id.edit1);
        Edit2 = findViewById(R.id.edit2);
        Text = findViewById(R.id.text);
        add = findViewById(R.id.B1);
        sub = findViewById(R.id.B2);
        mul = findViewById(R.id.B3);
        div = findViewById(R.id.B4);

        //Addition Operation
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Integer.parseInt(Edit1.getText().toString());
                n2 = Integer.parseInt(Edit2.getText().toString());
                res = n1 + n2;
                Text.setText(String.valueOf(res));

            }
        });

        //Subtraction Operation
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Integer.parseInt(Edit1.getText().toString());
                n2 = Integer.parseInt(Edit2.getText().toString());
                res = n1 - n2;
                Text.setText(String.valueOf(res));
            }
        });

        //Multiplication Operation
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Integer.parseInt(Edit1.getText().toString());
                n2 = Integer.parseInt(Edit2.getText().toString());
                res = n1 * n2;
                Text.setText(String.valueOf(res));
            }
        });

        //Division Operation
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Integer.parseInt(Edit1.getText().toString());
                n2 = Integer.parseInt(Edit2.getText().toString());
                res = n1 / n2;
                Text.setText(String.valueOf(res));
            }
        });


    }
}
