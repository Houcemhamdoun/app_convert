package com.houssem.convert_temp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText temp;
    RadioButton cel;
    RadioButton far;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp=(EditText)findViewById(R.id.editTextTEMP);
        cel=(RadioButton)findViewById(R.id.radioButtoncf);
        far=(RadioButton)findViewById(R.id.radioButtonfc);

    }
    public void convertir (View v){
        Double value = new Double(temp.getText().toString());
        if(cel.isChecked())
            value=convtemp.farenheit_celsus(value);
        else
            value=convtemp.celsus_farenheit(value);
        temp.setText(new Double(value).toString());

    }

}