package com.example.mipractica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
    EditText txtn1, txtn2;
    TextView txtr;
    Button btnc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtn1 = (EditText) findViewById(R.id.txtn1);
        txtn2 = (EditText) findViewById(R.id.txtn2);
        txtr = (TextView) findViewById(R.id.txtr);
        btnc = (Button) findViewById(R.id.btnc);
        btnc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int valor1 = Integer.parseInt(txtn1.getText().toString());
                int valor2 = Integer.parseInt(txtn2.getText().toString());
                int r = valor1 + valor2;
                txtr.setText("La suma es" + r);
                btnc.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        int valor1 = Integer.parseInt(txtn1.getText().toString());
                        int valor2 = Integer.parseInt(txtn1.getText().toString());

                        int mul = (valor1 * valor2);

                        txtr.setText("La multiplicacion es" + mul);


                    }

                });
            }
        });
    }
}


