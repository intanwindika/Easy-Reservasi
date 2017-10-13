package com.example.aprivate.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText nameText, emailText, passwordText;
    Button mainButton;
    AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        nameText = (EditText) findViewById(R.id.name);
        emailText = (EditText) findViewById(R.id.email);
        passwordText = (EditText) findViewById(R.id.password);
        mainButton = (Button) findViewById(R.id.main_button);

        awesomeValidation.addValidation(this, R.id.name, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.email, Patterns.EMAIL_ADDRESS, R.string.emailerror);
        awesomeValidation.addValidation(this, R.id.password, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.passworderror);

        mainButton.setOnClickListener(this);
    }
    private void submitForm() {

        if (awesomeValidation.validate()) {
            Intent inten1= new Intent(MainActivity.this, second.class);
            startActivity(inten1);
        }

    }
    @Override
    public void onClick(View view) {
        if (view == mainButton) {
            submitForm();
        }
    }

}




