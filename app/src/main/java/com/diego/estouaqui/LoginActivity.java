package com.diego.estouaqui;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView textApresentacao ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Typeface fontApresentacao = Typeface.createFromAsset(this.getBaseContext().getAssets(),"Barrio-Regular.ttf");

        textApresentacao = (TextView) findViewById(R.id.NameApp);
        textApresentacao.setTypeface(fontApresentacao);

    }
}
