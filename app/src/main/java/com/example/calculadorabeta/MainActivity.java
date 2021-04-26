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
    private Button botaoOperacaoPorcentagem;
    private Button botaoOperacaoLimpar;

    private Double primeiroNumero = 0.0;
    private String numeroDigitado = "";
    private String operacao="";
    private String memoria = "";
    private Double segundoNumero = 0.0;
    private Double memoriacalculo = 0.0;

    

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
        botaoOperacaoPorcentagem = findViewById(R.id.buttonPorcentagem);
        botaoOperacaoPorcentagem.setOnClickListener(this);
        botaoOperacaoLimpar = findViewById(R.id.buttonC);
        botaoOperacaoLimpar.setOnClickListener(this);

        visor = findViewById(R.id.textView);

    }


    @Override
    public void onClick(View view) {

                switch (view.getId()){

                    case R.id.button1:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("1"));

                        break;

                    case R.id.button2:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("2"));

                        break;

                    case R.id.button3:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("3"));

                        break;

                    case R.id.button4:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("4"));

                        break;

                    case R.id.button5:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("5"));

                        break;

                    case R.id.button6:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("6"));

                        break;

                    case R.id.button7:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("7"));

                        break;

                    case R.id.button8:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("8"));

                        break;

                    case R.id.button9:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("9"));

                        break;

                    case R.id.button0:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("0"));

                        break;

                    case R.id.buttonPonto:
                        visor.setText(numeroDigitado =  numeroDigitado.concat("."));

                        break;

                    case R.id.buttonC:
                         visor.setText( "" );
                         numeroDigitado = "";
                         primeiroNumero = 0.0;

                         break;

                    case R.id.buttonMais:
                         funcaoSoma();
                         numeroDigitado = "";
                         operacao = "+";

                        break;

                    case R.id.buttonMenos:
                        funcaoSubtracao();
                        numeroDigitado = "";
                        operacao = "-";

                        break;

                    case R.id.buttonX:
                        funcaoMultiplicao();
                        numeroDigitado = "";
                        operacao = "*";

                        break;

                    case R.id.buttonDivisao:
                        funcaoDivisao();
                        numeroDigitado = "";
                        operacao = "/";

                        break;

                    case R.id.buttonIgual:
                        funcaoIgual(operacao);
                        numeroDigitado = "";

                        break;

                    case R.id.buttonPorcentagem:
                       // porcentagem();


                }

    }

 //
    public void funcaoSoma(){
        try {
            Double total = 0.0;
            if(primeiroNumero == 0.0){
                primeiroNumero = primeiroNumero.parseDouble(numeroDigitado);
                numeroDigitado = "";
                visor.setText(primeiroNumero.toString());
            }

            segundoNumero = segundoNumero.parseDouble(numeroDigitado);
            total = primeiroNumero + segundoNumero;
            primeiroNumero = total;
            visor.setText(total.toString());

        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();

        }
        catch (Exception e){
            e.printStackTrace();

        }

    }

    public void funcaoSubtracao(){

        try {
            Double total = 0.0;
            if(primeiroNumero == 0.0){
                primeiroNumero = primeiroNumero.parseDouble(numeroDigitado);
                numeroDigitado = "";
                visor.setText(primeiroNumero.toString());
            }

            segundoNumero = segundoNumero.parseDouble(numeroDigitado);
            total = primeiroNumero - segundoNumero;
            primeiroNumero = total;
            visor.setText(total.toString());

        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();

        }
        catch (Exception e){
            e.printStackTrace();

        }

       
     }




    public void funcaoMultiplicao(){

        segundoNumero = 1.0;
        Double valor = primeiroNumero;
        segundoNumero = segundoNumero.parseDouble(numeroDigitado);

        try {
            if(primeiroNumero != 0.0){
                primeiroNumero = primeiroNumero.parseDouble(numeroDigitado);
                visor.setText(numeroDigitado);

                primeiroNumero = segundoNumero * valor;

                visor.setText(primeiroNumero.toString());
            }else {
                primeiroNumero = primeiroNumero.parseDouble(numeroDigitado);
                visor.setText(numeroDigitado);
            }

        }     catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();

            }
        catch (Exception e){
                e.printStackTrace();

            }

     }

    public void funcaoDivisao(){

        segundoNumero = 0.0;
        Double valor = primeiroNumero;
        segundoNumero = segundoNumero.parseDouble(numeroDigitado);

        try {

            if(primeiroNumero != 0.0){
                primeiroNumero = primeiroNumero.parseDouble(numeroDigitado);
                visor.setText(numeroDigitado);

                primeiroNumero = valor / segundoNumero;

                visor.setText(primeiroNumero.toString());
            }else {
                primeiroNumero = primeiroNumero.parseDouble(numeroDigitado);
                visor.setText(numeroDigitado);
            }

        } catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();

        } catch (Exception e){

            e.printStackTrace();
        }



    }
     // verificar como a funcao esta mandando o digito para o visor e verificar como as variaveis estao sendo atualizadas apos isso.
    //  possivel falha quando atualiza a ultima variavel
    public void funcaoIgual(String funcaoAnterior) {


        switch (operacao){
            case "+":
                funcaoSoma();
                operacao = "";
                break;
            case "-" :
                funcaoSubtracao();
                operacao = "-";
                break;

            case "*":
                segundoNumero = primeiroNumero;
                funcaoMultiplicao();
                operacao = "*";


                break;

            case "/":
                funcaoDivisao();
                operacao = "/";
                break;

        }


    }

    public void porcentagem(){




    }

}