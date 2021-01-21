package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.login.ui.login.LoginActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void logout(View view) {
        Intent it = new Intent(Home.this, LoginActivity.class);
        startActivity(it);
        Toast.makeText(getApplicationContext(), "Logged Out", Toast.LENGTH_LONG).show();
    }
}