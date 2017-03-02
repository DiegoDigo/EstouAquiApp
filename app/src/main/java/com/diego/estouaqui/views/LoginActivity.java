package com.diego.estouaqui.views;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.diego.estouaqui.R;
import com.diego.estouaqui.views.Home.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    private TextView textoUsuario, textoSenha ,textoTitulo;
    private Button btncriarConta, btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Typeface fontApresentacao = Typeface.createFromAsset(this.getBaseContext().getAssets(),"MontserratAlternates-Bold.ttf");
        Typeface fontTextLabel = Typeface.createFromAsset(this.getBaseContext().getAssets(),"Lato-LightItalic.ttf");

        textoTitulo = (TextView)findViewById(R.id.txtTitulo);
        textoUsuario = (TextView)findViewById(R.id.txtUser);
        textoSenha = (TextView)findViewById(R.id.txtSenha);
        btncriarConta = (Button) findViewById(R.id.buttonCreate);
        btnlogin = (Button) findViewById(R.id.buttonLogin);

        textoTitulo.setTypeface(fontApresentacao);
        textoSenha.setTypeface(fontTextLabel);
        textoUsuario.setTypeface(fontTextLabel);
        btncriarConta.setTypeface(fontTextLabel);

        btncriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), OpcoesCreateContaActivity.class);
                startActivity(intent);

            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), HomeActivity.class);
                startActivity(intent);
            }
        });




    }
}
