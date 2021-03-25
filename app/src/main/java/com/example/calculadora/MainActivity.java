package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.SQLOutput;

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
        tv2.setText("");
    }

    public void C(View view) {
        tv1.setText("0");
        tv2.setText("");
    }


    public void comprobarOperacion(char c, String cadArriba, String cad) {
        cadArriba = cadArriba.substring(0, cadArriba.length() - 1);//quitarle el simbolo ultimo con el que viene la cadArriba
        if (c == '+') {
            System.out.println("SUMAR: " + cadArriba + c + cad);
            Sumar(cadArriba, cad);
        } else if (c == '-') {
            System.out.println("RESTAR: " + cadArriba + c + cad);
            Restar(cadArriba, cad);
        } else if (c == '*') {
            System.out.println("MULTIPLICAR: " + cadArriba + c + cad);
            Multiplicar(cadArriba, cad);
        } else if (c == '/') {
            System.out.println("DIVIDIR: " + cadArriba + c + cad);
            Dividir(cadArriba, cad);
        }
    }



    /*----------------------------METODOS DE OPERACIONES-----------------------------------------------------------*/

    public void Sumar(String cadArriba, String cad) {
        float n1 = Float.parseFloat(cadArriba);/*REALIZAR LA OPERACION*/
        float n2 = Float.parseFloat(cad);
        float res = n1 + n2;
        String resCad = String.valueOf(res);

        if (resCad.charAt(resCad.length() - 1) == '0' && resCad.charAt(resCad.length() - 2) == '.') {//si el resultado termina en .0 quitamos ese .0 por que es redundante
            int resAInt = Math.round(res);
            tv2.setText(resAInt + "+");
            tv1.setText("0");
        } else {
            tv2.setText(res + "+");/*MOSTRAR EL RESULTADO*/
            tv1.setText("0");
        }
    }


    public void Restar(String cadArriba, String cad) {
        float n1 = Float.parseFloat(cadArriba);/*REALIZAR LA OPERACION*/
        float n2 = Float.parseFloat(cad);
        float res = n1 - n2;
        String resCad = String.valueOf(res);

        if (resCad.charAt(resCad.length() - 1) == '0' && resCad.charAt(resCad.length() - 2) == '.') {//si el resultado termina en .0 quitamos ese .0 por que es redundante
            int resAInt = Math.round(res);
            tv2.setText(resAInt + "-");
            tv1.setText("0");
        } else {
            tv2.setText(resCad + "-");/*MOSTRAR EL RESULTADO*/
            tv1.setText("0");
        }
    }

    public void Multiplicar(String cadArriba, String cad) {
        float n1 = Float.parseFloat(cadArriba);/*REALIZAR LA OPERACION*/
        float n2 = Float.parseFloat(cad);
        float res = n1 * n2;
        String resCad = String.valueOf(res);

        if (resCad.charAt(resCad.length() - 1) == '0' && resCad.charAt(resCad.length() - 2) == '.') {//si el resultado termina en .0 quitamos ese .0 por que es redundante
            int resAInt = Math.round(res);
            tv2.setText(resAInt + "*");
            tv1.setText("0");
        } else {
            tv2.setText(resCad + "*");/*MOSTRAR EL RESULTADO*/
            tv1.setText("0");
        }
    }

    public void Dividir(String cadArriba, String cad) {
        float n1 = Float.parseFloat(cadArriba);/*REALIZAR LA OPERACION*/
        float n2 = Float.parseFloat(cad);
        float res = n1 / n2;
        String resCad = String.valueOf(res);

        if (resCad.charAt(resCad.length() - 1) == '0' && resCad.charAt(resCad.length() - 2) == '.') {//si el resultado termina en .0 quitamos ese .0 por que es redundante
            int resAInt = Math.round(res);
            tv2.setText(resAInt + "/");
            tv1.setText("0");
        } else {
            tv2.setText(resCad + "/");/*MOSTRAR EL RESULTADO*/
            tv1.setText("0");
        }
    }



    /*----------------------------METODOS DE OPERACIONES-----------------------------------------------------------*/

    public void Mas(View view) {
        String cad = tv1.getText().toString();
        String cadArriba = tv2.getText().toString();
        if (cadArriba == "") {/*si la caja de texto de arriba no tiene pasar lo que se ingrese en la caja de abajo a ella*/
            tv2.setText(cad + "+");
            tv1.setText("0");
        } else if (cadArriba.length() >= 1 && cadArriba.charAt(cadArriba.length() - 1) != '+') {
            char c = cadArriba.charAt(cadArriba.length() - 1);
            comprobarOperacion(c, cadArriba, cad);

            if (Character.isDigit(cadArriba.charAt(cadArriba.length() - 1))) {/*este IF se ejecuta si el ultimo caracter en una cadena de cadArriba no es un simbolo*/
                System.out.println("NO QUITAR EL ULTIMO Y AGREGAR MAS");
                tv2.setText(cadArriba + "+");
            } else {
                System.out.println("QUITAR EL ULTIMO y CAMBIARLO POR MAS");
                String cadArriba2 = tv2.getText().toString();
                cadArriba2 = cadArriba2.substring(0, cadArriba2.length() - 1);
                cadArriba2 = cadArriba2 + "+";
                tv2.setText(cadArriba2);
            }

        } else {
            char c = cadArriba.charAt(cadArriba.length() - 1);
            comprobarOperacion(c, cadArriba, cad);
        }
    }

    public void Menos(View view) {
        String cad = tv1.getText().toString();
        String cadArriba = tv2.getText().toString();
        if (cadArriba == "") {
            tv2.setText(cad + "-");
            tv1.setText("0");
        } else if (cadArriba.length() >= 1 && cadArriba.charAt(cadArriba.length() - 1) != '-') {
            char c = cadArriba.charAt(cadArriba.length() - 1);
            comprobarOperacion(c, cadArriba, cad);
            if (Character.isDigit(cadArriba.charAt(cadArriba.length() - 1))) {/*este IF se ejecuta si el ultimo caracter en una cadena de cadArriba no es un simbolo*/
                System.out.println("NO QUITAR EL ULTIMO AGREGAR MENOS");
                tv2.setText(cadArriba + "-");
            } else {
                System.out.println("QUITAR EL ULTIMO AGREGAR MENOS");
                String cadArriba2 = tv2.getText().toString();
                cadArriba2 = cadArriba2.substring(0, cadArriba2.length() - 1);
                cadArriba2 = cadArriba2 + "-";
                tv2.setText(cadArriba2);
            }
        } else {
            char c = cadArriba.charAt(cadArriba.length() - 1);
            comprobarOperacion(c, cadArriba, cad);
        }
    }

    public void Por(View view) {
        String cad = tv1.getText().toString();
        String cadArriba = tv2.getText().toString();
        if (cadArriba == "") {
            tv2.setText(cad + "*");
            tv1.setText("0");
        } else if (cadArriba.length() >= 1 && cadArriba.charAt(cadArriba.length() - 1) != '*') {
            char c = cadArriba.charAt(cadArriba.length() - 1);
            comprobarOperacion(c, cadArriba, cad);
            if (Character.isDigit(cadArriba.charAt(cadArriba.length() - 1))) {/*este IF se ejecuta si el ultimo caracter en una cadena de cadArriba no es un simbolo*/
                System.out.println("NO QUITAR EL ULTIMO AGREGAR POR");
                tv2.setText(cadArriba + "*");
            } else {
                System.out.println("QUITAR EL ULTIMO AGREGAR POR");
                String cadArriba2 = tv2.getText().toString();
                cadArriba2 = cadArriba2.substring(0, cadArriba2.length() - 1);
                cadArriba2 = cadArriba2 + "*";
                tv2.setText(cadArriba2);
            }
        } else {
            char c = cadArriba.charAt(cadArriba.length() - 1);
            comprobarOperacion(c, cadArriba, cad);
        }

    }

    public void Entre(View view) {
        String cad = tv1.getText().toString();
        String cadArriba = tv2.getText().toString();
        if (cadArriba == "") {
            tv2.setText(cad + "/");
            tv1.setText("0");
        } else if (cadArriba.length() >= 1 && cadArriba.charAt(cadArriba.length() - 1) != '/') {
            char c = cadArriba.charAt(cadArriba.length() - 1);
            comprobarOperacion(c, cadArriba, cad);
            if (Character.isDigit(cadArriba.charAt(cadArriba.length() - 1))) {/*este IF se ejecuta si el ultimo caracter en una cadena de cadArriba no es un simbolo*/
                System.out.println("NO QUITAR EL ULTIMO AGREGAR ENTRRE");
                tv2.setText(cadArriba + "/");
            } else {
                System.out.println("QUITAR EL ULTIMO AGREGAR ENTRE");
                String cadArriba2 = tv2.getText().toString();
                cadArriba2 = cadArriba2.substring(0, cadArriba2.length() - 1);
                cadArriba2 = cadArriba2 + "/";
                tv2.setText(cadArriba2);
            }
        } else {
            char c = cadArriba.charAt(cadArriba.length() - 1);
            comprobarOperacion(c, cadArriba, cad);
        }
    }

    public void Igual(View view) {
        String cad = tv1.getText().toString();
        String cadArriba = tv2.getText().toString();
        if (cad.isEmpty() || cadArriba.isEmpty()) {
            System.out.println("OPERACIONES INCOMPLETAS NO HACER IGUAL");
        } else {
            char c = cadArriba.charAt(cadArriba.length() - 1);
            comprobarOperacion(c, cadArriba, cad);
            String cadArriba2 = tv2.getText().toString();
            cadArriba2 = cadArriba2.substring(0, cadArriba2.length() - 1);//quitar el ultimo caracter (es un simbolo que no es necesario)
            tv2.setText(cadArriba2);
        }
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


    /*-----------------------------------------------------ESPECIALES----------------------------------------------------------------*/

    public void Raiz(View view) {
        String cad = tv1.getText().toString();
        if (cad.isEmpty() || cad.equals("0")) {
        } else {
            double n1 = Double.parseDouble(cad);
            double raiz = Math.sqrt(n1);
            float raizAFloat = (float) raiz;
            String raizRes = String.valueOf(raiz);
            if (raizRes.charAt(raizRes.length() - 1) == '0' && raizRes.charAt(raizRes.length() - 2) == '.') {//si el resultado termina en .0 quitamos ese .0 por que es redundante
                int resAInt = Math.round(raizAFloat);
                String resAString = String.valueOf(resAInt);
                tv2.setText(resAString);
                tv1.setText("0");
            } else {
                tv2.setText(raizRes);
            }
        }
    }
}

