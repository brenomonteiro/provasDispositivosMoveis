package prova1.iftm.com.br.provaandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.NumberFormat;

import prova1.iftm.com.br.provaandroid.R;

public class MainActivity extends AppCompatActivity {

    EditText visor;
    int operando1, operando2;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visor = (EditText) findViewById(R.id.visor);     }

    public void operacao(View botao){
        switch(botao.getId()) {

        case R.id.b0 :

                case R.id.b1 :
                    case R.id.b2 :
                        case R.id.b3 :
                            case R.id.b4 :
                                case R.id.b5 :
                                    case R.id.b6 :
                                        case R.id.b7 :
                                            case R.id.b8 :
                                                case R.id.b9 :
                                                    visor.setText(visor.getText().append(((Button) botao).getText()));

                                                    break;
                                                    case R.id.bc : visor.setText("");
                                                    break;


                                                    case R.id.divisao:
                                                    case R.id.multiplcação:
                                                    case R.id.soma:
                                                    case R.id.subtração:
                                                    operando1 = Integer.parseInt((visor.getText().toString()));
                                                    operador=((Button) botao).getText().toString();
                                                    visor.setText("");
                                                    break;

            case R.id.b00 : visor.setText(operando1+" "+operador+" "+operando2+" =");

                break;
                                                                    case R.id.igual:
                                                                        operando2 = Integer.parseInt((visor.getText().toString()));
                                                                        NumberFormat resultado = NumberFormat.getNumberInstance();
                                                                        switch(operador) {
                                                                            case "+": visor.setText(resultado.format(operando1 + operando2));
                                                                            break;
                                                                            case "-": visor.setText(resultado.format(operando1 - operando2));
                                                                            break;
                                                                            case "*": visor.setText(resultado.format(operando1 * operando2));
                                                                            break;
                                                                            case "/": visor.setText(resultado.format(operando1 / operando2));
                                                                            break;

                                                                        }

        }
    }

}