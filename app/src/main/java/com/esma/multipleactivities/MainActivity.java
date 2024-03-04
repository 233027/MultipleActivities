package com.esma.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//birden fazla aktivite kullanma
//neden ihtiyaç duyarız?
//örneğin bir kullanıcı giriş ekranımız var giriş yaptıktan sonra
//başka bir ekrana başka bie kativiteye yönlendirmeye ihtiyacımız
//var yüzden kullanmak zorundayız.
public class MainActivity extends AppCompatActivity {

    String username;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        username="";
    }

    public void changeActivity(View view){

        username = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        intent.putExtra("userInput",username);//anahtar kelime,değer;

        startActivity(intent);

    }
}