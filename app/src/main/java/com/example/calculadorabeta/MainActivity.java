package com.example.calculadorabeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

    private Double calculo = 0.0;
    private String numero = "";

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializar componentes
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        botao1 = findViewById(R.id.button1);
        botao1.setOnClickListener(this);
        botao2 = findViewById(R.id.button2);
        botao2.setOnClickListener(this);
        botao3 = findViewById(R.id.button3);
        botao3.setOnClickListener(this);
        botao4 = findViewById(R.id.button4);
        botao4.setOnClickListener(this);
        botao5 = findViewById(R.id.button5);
        botao5.setOnClickListener(this);
        botao6 = findViewById(R.id.button6);
        botao6.setOnClickListener(this);
        botao7 = findViewById(R.id.button7);
        botao7.setOnClickListener(this);
        botao8 = findViewById(R.id.button8);
        botao8.setOnClickListener(this);
        botao9 = findViewById(R.id.button9);
        botao9.setOnClickListener(this);
        botao0 = findViewById(R.id.button0);
        botao0.setOnClickListener(this);
        botaoPonto = findViewById(R.id.buttonPonto);
        botaoPonto.setOnClickListener(this);

        botaoOperacaoSoma = findViewById(R.id.buttonMais);
        botaoOperacaoSoma.setOnClickListener(this);
        botaoOperacaoSubtracao = findViewById(R.id.buttonMenos);
        botaoOperacaoSubtracao.setOnClickListener(this);
        botaoOperacaoDivisao = findViewById(R.id.buttonDivisao);
        botaoOperacaoDivisao.setOnClickListener(this);
        botaoOperacaoMultiplicacao = findViewById(R.id.buttonX);
        botaoOperacaoMultiplicacao.setOnClickListener(this);

        botaoOperacaoIgual = findViewById(R.id.buttonIgual);
        botaoOperacaoIgual.setOnClickListener(this);
        botaoOperacaoMemoria = findViewById(R.id.buttonM);
        botaoOperacaoMemoria.setOnClickListener(this);
        botaoOperacaoLimpar = findViewById(R.id.buttonC);
        botaoOperacaoLimpar.setOnClickListener(this);

        visor = findViewById(R.id.textView);

    }


    @Override
    public void onClick(View view) {

                switch (view.getId()){

                    case R.id.button1:
                        visor.setText(numero =  numero.concat("1"));

                        break;

                    case R.id.button2:
                        visor.setText(numero =  numero.concat("2"));

                        break;

                    case R.id.button3:
                        visor.setText(numero =  numero.concat("3"));

                        break;

                    case R.id.button4:
                        visor.setText(numero =  numero.concat("4"));

                        break;

                    case R.id.button5:
                        visor.setText(numero =  numero.concat("5"));

                        break;

                    case R.id.button6:
                        visor.setText(numero =  numero.concat("6"));

                        break;

                    case R.id.button7:
                        visor.setText(numero =  numero.concat("7"));

                        break;

                    case R.id.button8:
                        visor.setText(numero =  numero.concat("8"));

                        break;

                    case R.id.button9:
                        visor.setText(numero =  numero.concat("9"));

                        break;

                    case R.id.button0:
                        visor.setText(numero =  numero.concat("0"));

                        break;

                    case R.id.buttonPonto:
                        visor.setText(numero =  numero.concat("."));

                        break;

                    case R.id.buttonC:
                         visor.setText( "" );
                         numero = "";
                        calculo = 0.0;

                         break;

                    case R.id.buttonMais:
                         funcaoSoma();
                         numero = "";


                        break;
                }

    }


    public void funcaoSoma(){
        Double digitos = 0.0;
        Double soma = calculo;
        digitos = digitos.parseDouble(numero);
        calculo = soma + digitos;

        visor.setText(calculo.toString());
    }


}