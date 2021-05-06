package com.example.telalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoPaginaCriarConta,botaoLogar,botaoRecuperarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoLogar=findViewById(R.id.btnLogar);
        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Logar=new Intent(getApplicationContext(),TelaInicial.class);
                startActivity(Logar);
            }
        });

        botaoPaginaCriarConta=findViewById(R.id.btnPaginaCriarConta);
        botaoPaginaCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CriarConta=new Intent(getApplicationContext(),Tela_Criar_Conta.class);
                startActivity(CriarConta);
            }
        });


    }
}

