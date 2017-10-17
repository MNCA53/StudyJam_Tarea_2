package com.example.hp.calculadora_tarea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button boton;
    private Button btnuno;
    private Button btndos;
    private Button btntres;
    private Button btncuatro;
    private Button btncinco;
    private Button btnseis;
    private Button btnsiete;
    private Button btnocho;
    private Button btnnueve;
    private Button btncero;
    private EditText etProceso;
    private EditText etconcatenar;
    private EditText etResultado;
    private double numero1, numero2, resultado;
    private String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etResultado = (EditText) findViewById(R.id.Resultado);
        etProceso = (EditText) findViewById(R.id.etProceso);
    }
    public void cero(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "0");
    }
    public void uno(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "1");
    }
    public void dos(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "2");
    }
    public void tres(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "3");
    }
    public void cuatro(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "4");
    }
    public void cinco(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "5");
    }
    public void seis(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "6");
    }
    public void siete(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "7");
    }
    public void ocho(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "8");
    }
    public void nueve(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        etProceso.setText(etconcatenar.getText().toString() + "9");
    }
    public void suma(View view) {
        etconcatenar = (EditText)findViewById(R.id.etProceso);
        numero1 = Double.parseDouble(etconcatenar.getText().toString());
        //etProceso.setText(etconcatenar.getText().toString() + "+");
        operador = "+";
        etProceso.setText("");
    }
    public void resta(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        numero1 = Double.parseDouble(etconcatenar.getText().toString());
        // etProceso.setText(etconcatenar.getText().toString() + "-");
        operador = "-";
        etProceso.setText("");
    }
    public void multiplicacion(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        numero1 = Double.parseDouble(etconcatenar.getText().toString());
        // etProceso.setText(etconcatenar.getText().toString() + "*");
        operador = "*";
        etProceso.setText("");
    }
    public void division(View view) {
        etconcatenar = (EditText) findViewById(R.id.etProceso);
        numero1 = Double.parseDouble(etconcatenar.getText().toString());
        //etProceso.setText(etconcatenar.getText().toString() + "/");
        operador = "/";
        etProceso.setText("");
    }
    public void igual(View view){
        etconcatenar = (EditText)findViewById(R.id.etProceso);
        numero2 = Double.parseDouble(etconcatenar.getText().toString());
        if(operador.equals("+")){
            etProceso.setText("");
            resultado = numero1 + numero2;
        }
        if(operador.equals("-")){
            etProceso.setText("");
            resultado = numero1 - numero2;
        }
        if(operador.equals("*")){
            etProceso.setText("");
            resultado = numero1 * numero2;
        }
        if(operador.equals("/")){
            etProceso.setText("");
            if(numero2 != 0){
                resultado = numero1 / numero2;
            }else{
                resultado = numero1 / numero2;
                etResultado.setText("Infinito");
            }
        }
        etProceso.setText(String.valueOf(resultado));
        etResultado.setText(String.valueOf(resultado));
    }
    public void limpiar(View view){
        etProceso.setText("");
        etResultado.setText("");
    }
}

