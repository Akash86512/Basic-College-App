package com.example.akashkumar.gkv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class livenews extends AppCompatActivity {

    Button aajtak,indiatv,tej,todayindia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livenews);

        aajtak=findViewById(R.id.aajtak);
        indiatv=findViewById(R.id.indiatv);
        tej=findViewById(R.id.tej);
        todayindia=findViewById(R.id.indiatoday);

        aajtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(livenews.this,aajtak.class);
                startActivity(a1);
            }
        });
        indiatv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(livenews.this,indiatv.class);
                startActivity(a1);
            }
        });
        tej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(livenews.this,tez.class);
                startActivity(a1);
            }
        });
        todayindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(livenews.this,Main3Activity.class);
                startActivity(a1);
            }
        });
    }
}
