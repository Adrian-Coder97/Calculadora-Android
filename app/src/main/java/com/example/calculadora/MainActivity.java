package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.txtSemires);
    }

    public void Numero0(View view) {
        String cad = tv1.getText().toString();
        if (cad.equals("0")) {
        } else {
            tv1.append("0");
        }
    }

    public void Numero1(View view) {


        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
            tv1.setText("1");
        } else {
            tv1.append("1");
        }
    }

    public void Numero2(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
            tv1.setText("2");
        } else {
            tv1.append("2");
        }
    }

    public void Numero3(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
            tv1.setText("3");
        } else {
            tv1.append("3");
        }
    }

    public void Numero4(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
            tv1.setText("4");
        } else {
            tv1.append("4");
        }
    }

    public void Numero5(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
            tv1.setText("5");
        } else {
            tv1.append("5");
        }
    }

    public void Numero6(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
            tv1.setText("6");
        } else {
            tv1.append("6");
        }
    }

    public void Numero7(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
            tv1.setText("7");
        } else {
            tv1.append("7");
        }
    }

    public void Numero8(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
            tv1.setText("8");
        } else {
            tv1.append("8");
        }
    }

    public void Numero9(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
            tv1.setText("9");
        } else {
            tv1.append("9");
        }
    }

    public void CE(View view) {
        tv1.setText("0");
    }

    public void C(View view) {
        tv1.setText("0");
    }

    public void Mas(View view) {
        String cad = tv1.getText().toString();
        tv2.setText(cad+"+");
        tv1.setText("0");
    }

    public void Menos(View view) {
        String cad = tv1.getText().toString();
        tv2.setText(cad+"-");
        tv1.setText("0");
    }

    public void Por(View view) {
        String cad = tv1.getText().toString();
        tv2.setText(cad+"*");
        tv1.setText("0");
    }

    public void Entre(View view) {
        String cad = tv1.getText().toString();
        tv2.setText(cad+"/");
        tv1.setText("0");
    }

    public void Punto(View view) {
        String cad = tv1.getText().toString();
        char ultimoCaracter = cad.charAt(cad.length() - 1);
        System.out.println("Ultimo caracter: " + ultimoCaracter);
        if ((ultimoCaracter == '+') || (ultimoCaracter == '-') || (ultimoCaracter == '*') || (ultimoCaracter == '/')) {
        } else {
            tv1.append(".");
        }
    }

    public void Negar(View view) {
        String cad = tv1.getText().toString();
        char primerCaracter = cad.charAt(0);
        if (cad.equals("0")) {

        } else if (primerCaracter == '-') {
            String cadN = cad.substring(1);
            tv1.setText(cadN);
        } else {
            String cadM = "-" + cad;
            tv1.setText(cadM);
        }
    }

    public void Borrar(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {

        } else if (cad.length() == 1) {
            tv1.setText("0");
        } else {
            cad = cad.substring(0, cad.length() - 1);
            tv1.setText(cad);
        }
    }


}