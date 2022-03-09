package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private EditText editText1;
    private EditText editText2;
    private TextView textView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code:
        button =findViewById(R.id.button);
        button2 =findViewById(R.id.button2);
        button3 =findViewById(R.id.button3);
        button4 =findViewById(R.id.button4);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textView4 = findViewById(R.id.textView4);



        //onClick for buttons
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 =editText1.getText().toString();
                int num1 =Integer.parseInt(str1);

                String str2 =editText2.getText().toString();
                int num2= Integer.parseInt(str2);
            int add = num1+num2;
            textView4.setText("The sum is "+add);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = editText1.getText().toString();
                int num1 = Integer.parseInt(str1);
                String str2 = editText2.getText().toString();
                int num2 = Integer.parseInt(str2);
                int sub = num1-num2;
                textView4.setText("The difference is "+sub);
            }
        });

    }


    // Functions

    public void product(View view){
        String str1 = editText1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = editText2.getText().toString();
        int num2 = Integer.parseInt(str2);
        int product = num1*num2;
        textView4.setText("The product is "+product);
    }

    public void division(View view){
        String str1 = editText1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = editText2.getText().toString();
        int num2= Integer.parseInt(str2);
        int div = num1/num2;
        textView4.setText("The result is "+div);
    }


}