package com.example.twitterclone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextEmail;
    private EditText mEditTextPassword;

    public void onSignUpClick(View view)
    {
        Log.d("SignUpActivity","SignUp Email is"+mEditTextEmail.getText().toString());
    }
    public void onLoginClick(View view)
    {
        Log.d("LoginActivity","Login Email is"+mEditTextEmail.getText().toString());
    }
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextEmail = findViewById(R.id.EmailAddress);
        mEditTextPassword = findViewById(R.id.Password);

    }
}