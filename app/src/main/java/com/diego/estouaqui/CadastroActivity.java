package com.diego.estouaqui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private ImageView buttonBack;
    private Button buttonForgot ;
    private FloatingActionButton buttonDone;
    private TextView titulo ,txtEmail ,txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Typeface fontApresentacao = Typeface.createFromAsset(this.getBaseContext().getAssets(),"MontserratAlternates-Bold.ttf");
        Typeface fontTextLabel = Typeface.createFromAsset(this.getBaseContext().getAssets(),"Lato-LightItalic.ttf");

        buttonBack = (ImageView) findViewById(R.id.backButton);
        buttonForgot = (Button) findViewById(R.id.forgot);
        buttonDone = (FloatingActionButton) findViewById(R.id.botaoDone);
        titulo = (TextView) findViewById(R.id.tituloTela);
        txtEmail = (TextView) findViewById(R.id.txt_email);
        txtSenha = (TextView) findViewById(R.id.txt_senha);

        titulo.setTypeface(fontApresentacao);
        txtEmail.setTypeface(fontTextLabel);
        txtSenha.setTypeface(fontTextLabel);


        buttonDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(intent);
                String msg  = "Em Breve você recebera um email de confirmação";
                msgToast(msg, Toast.LENGTH_LONG);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        buttonForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msgToast("Esqueceu a senha ?",Toast.LENGTH_SHORT);
            }
        });
    }

    private void  msgToast(String msg , int duracao){
        Toast.makeText(getBaseContext(), msg , duracao).show();
    }

}
