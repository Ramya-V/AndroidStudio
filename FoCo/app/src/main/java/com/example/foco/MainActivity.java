package com.example.foco;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Initialization of variables
    TextView T;
    Button B;
    int ch=1;
    float Font=20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialization of components
        T=findViewById(R.id.Text);
        B=findViewById(R.id.Button);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Change of Font
                T.setTextSize(Font);
                Font=Font+5;
                if(Font==40){
                    Font=20;
                }

                //Change of Colors
                switch (ch){
                        case 1:
                           T.setTextColor(Color.RED);
                           break;

                        case 2:
                           T.setTextColor(Color.GREEN);
                           break;

                        case 3:
                           T.setTextColor(Color.BLUE);
                           break;

                        case 4:
                           T.setTextColor(Color.MAGENTA);
                           break;

                        case 5:
                           T.setTextColor(Color.YELLOW);
                           break;

                }
                ch++;
                if(ch==6){
                    ch=1;
                }
            }
        });

    }
}
