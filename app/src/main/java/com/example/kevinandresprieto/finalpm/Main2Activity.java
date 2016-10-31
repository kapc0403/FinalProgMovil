package com.example.kevinandresprieto.finalpm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    String msj;
    EditText mensajeBody;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        msj = getIntent().getStringExtra("msj");
        mensajeBody.setText(msj);
    }
}
