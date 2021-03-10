package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textView);
    }

    public void Numero0(View view) {
        tv1.append("0");
    }

    public void Numero1(View view) {
        tv1.append("1");
    }

    public void Numero2(View view) {
        tv1.append("2");
    }

    public void Numero3(View view) {
        tv1.append("3");
    }

    public void Numero4(View view) {
        tv1.append("4");
    }

    public void Numero5(View view) {
        tv1.append("5");
    }

    public void Numero6(View view) {
        tv1.append("6");
    }

    public void Numero7(View view) {
        tv1.append("7");
    }

    public void Numero8(View view) {
        tv1.append("8");
    }

    public void Numero9(View view) {
        tv1.append("9");
    }

    public void Borrar(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {

        } else {
            cad = cad.substring(0, cad.length() - 1);
            tv1.setText(cad);
        }

    }

}