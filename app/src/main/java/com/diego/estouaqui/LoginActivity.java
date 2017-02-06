package com.diego.estouaqui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView textApresentacao ;
    private Button createCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Typeface fontApresentacao = Typeface.createFromAsset(this.getBaseContext().getAssets(),"Barrio-Regular.ttf");

        textApresentacao = (TextView) findViewById(R.id.NameApp);
        createCount = (Button) findViewById(R.id.criarConta);
        textApresentacao.setTypeface(fontApresentacao);

        createCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), CadastroActivity.class);
                startActivity(intent);

            }
        });



    }
}
