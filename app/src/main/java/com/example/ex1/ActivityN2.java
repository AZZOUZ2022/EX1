package com.example.ex1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityN2 extends AppCompatActivity {

    EditText username;

    EditText password;
    Button loginButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n2);
    }
            public void LoginButton(View view) {
                username = findViewById(R.id.username);
                password = findViewById(R.id.password);
                loginButton = findViewById(R.id.loginButton);
            Intent intent = new Intent(this, ActivityN3.class);
            Bundle bundle = new Bundle();
            bundle.putString("Nom",username.getText().toString());
            bundle.putString("Code",password.getText().toString());
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
