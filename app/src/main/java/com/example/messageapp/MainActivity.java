package com.example.messageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsername, edtPassword, edtEmail;
    private Button btnSubmit;
    private TextView txtLoginInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtUsername = findViewById(R.id.edtUsername);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtLoginInfo = findViewById(R.id.txetLoginInfo);







    }
}

