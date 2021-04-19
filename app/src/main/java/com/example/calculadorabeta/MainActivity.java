package com.example.calculadorabeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView visor;
    private Button botao1;
    private Button botao2;
    private Button botao3;
    private Button botao4;
    private Button botao5;
    private Button botao6;
    private Button botao7;
    private Button botao8;
    private Button botao9;
    private Button botao0;
    private Button botaoPonto;

    private Button botaoOperacaoSoma;
    private Button botaoOperacaoSubtracao;
    private Button botaoOperacaoDivisao;
    private Button botaoOperacaoMultiplicacao;

    private Button botaoOperacaoIgual;
    private Button botaoOperacaoMemoria;
    private Button botaoOperacaoLimpar;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializar componentes
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        botao1 = findViewById(R.id.button1);
        botao2 = findViewById(R.id.button2);
        botao3 = findViewById(R.id.button3);
        botao4 = findViewById(R.id.button4);
        botao5 = findViewById(R.id.button5);
        botao6 = findViewById(R.id.button6);
        botao7 = findViewById(R.id.button7);
        botao8 = findViewById(R.id.button8);
        botao9 = findViewById(R.id.button9);
        botao0 = findViewById(R.id.button0);
        botaoPonto = findViewById(R.id.buttonPonto);

        botaoOperacaoSoma = findViewById(R.id.buttonMais);
        botaoOperacaoSubtracao = findViewById(R.id.buttonMenos);
        botaoOperacaoDivisao = findViewById(R.id.buttonDivisao);
        botaoOperacaoMultiplicacao = findViewById(R.id.buttonX);

        botaoOperacaoIgual = findViewById(R.id.buttonIgual);
        botaoOperacaoMemoria = findViewById(R.id.buttonM);
        botaoOperacaoLimpar = findViewById(R.id.buttonC);


    }


}