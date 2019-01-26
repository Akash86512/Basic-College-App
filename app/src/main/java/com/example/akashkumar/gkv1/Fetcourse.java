package com.example.akashkumar.gkv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fetcourse extends AppCompatActivity {

    Button cse,ece,ee,me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetcourse);

        cse=findViewById(R.id.cse);
        ece=findViewById(R.id.ece);
        me=findViewById(R.id.me);
        ee=findViewById(R.id.ee);


        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(Fetcourse.this,computer.class);
                startActivity(a1);
            }
        });
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(Fetcourse.this,electronics.class);
                startActivity(a1);
            }
        });
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(Fetcourse.this,electrical.class);
                startActivity(a1);
            }
        });
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(Fetcourse.this,Mechanical.class);
                startActivity(a1);
            }
        });

    }
}
