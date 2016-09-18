package com.example.alumno.calculadoraprimos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button miBoton;
    TextView result;
    EditText numIntroducido;
    String pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numIntroducido = (EditText) findViewById(R.id.editText);


        miBoton = (Button) findViewById(R.id.idButton);
        miBoton.setOnClickListener(this);
    }

    //al hacer click en el boton que muestre el resultado
    public void onClick(View view){
        //leer el valor
        pos = String.valueOf(numIntroducido.getText());

        //pasar String a int
       int numPos = Integer.parseInt(pos);
        //llamada al metodo y mandar el numero que lee
        int num = posPrimos.numPrimo(numPos);


        result = (TextView)findViewById((R.id.idResult));
        //devuelve el num que corresponde a la pos

        String txt = String.valueOf(num);

        result.setText(txt);
    }



}
