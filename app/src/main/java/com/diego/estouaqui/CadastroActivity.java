package com.diego.estouaqui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private ImageView buttonBack;
    private Button buttonForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        buttonBack = (ImageView) findViewById(R.id.backButton);
        buttonForgot = (Button) findViewById(R.id.forgot);


        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        buttonForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Esqueceu a senha ?", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
