package com.esma.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView= findViewById(R.id.textView2);
        //1. aktiviteden aldığımız usernamei nasıl alıcaz

        Intent intent = getIntent(); // intent i karşıla inteni al diyoruz
        String userName = intent.getStringExtra("userInput"); //aktivite 1 deki put ekstarya girdiğimiz anahtar keimenin bire bir aynısını kullanıyoruz
        textView.setText("Welcome " +userName); // dersek kullanının adı text e yazılır
    }

    public void changeScreen(View view){

        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}