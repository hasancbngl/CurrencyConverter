package com.example.currencyconventer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public void convert(View view) {
         EditText tlAmount = (EditText) findViewById(R.id.tlAmount); //to get info from edittext

         Double tlAmountDouble=Double.parseDouble(tlAmount.getText().toString()); //double.parsedouble() function is to convert string to number(double variable )

         Double usdAmount = tlAmountDouble*0.15;

         Double euroAmount = tlAmountDouble*0.14;

         Double poundAmount = tlAmountDouble*0.13;

         Toast.makeText(MainActivity.this,"£" + String.format("%.2f", poundAmount), Toast.LENGTH_SHORT).show(); //string.format to show it as a decimal.
         Toast.makeText(MainActivity.this,"$" +      String.format("%.2f ", usdAmount), Toast.LENGTH_SHORT).show();
         Toast.makeText(MainActivity.this,"euro" + String.format("%.2f", euroAmount), Toast.LENGTH_SHORT).show();

     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
