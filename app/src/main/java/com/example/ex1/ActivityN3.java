package com.example.ex1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityN3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n3);

        Bundle bundle=getIntent().getExtras();
        String username=bundle.getString("Nom");
        String code=bundle.getString("Code");

        TextView user=findViewById(R.id.username);
        TextView pwd =findViewById(R.id.password);
        user.setText(username);
        pwd.setText(code);
    }
}