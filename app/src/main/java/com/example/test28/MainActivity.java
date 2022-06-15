package com.example.test28;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();//값을 받기 위함, subactivity에서 받는다.
        String str = intent.getExtras().getString("키");//string형식으로 넘겨줬으니까
        Log.d("로그",str);
        EditText editText=findViewById(R.id.edit_text);
        editText.setText(str);
    }
}