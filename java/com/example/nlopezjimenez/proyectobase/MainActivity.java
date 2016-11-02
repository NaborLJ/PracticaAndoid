package com.example.nlopezjimenez.proyectobase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        TextView text1 = (TextView) findViewById(R.id.text1);
    }

    public void eventoBoton(View a){
        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText("Hola Mundo");
    }
}
