package com.rawat.compliancesguru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText emailtxt,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailtxt=findViewById(R.id.textemail);
        password=findViewById(R.id.textpwd);
    }

    public void login(View view) {
        if(emailtxt.getText().toString().equals("") ){
            emailtxt.setError("Please Enter Valid Email");
        }

        if(password.getText().toString().equals("")){
            password.setError("Please Enter Valid password");
        }
    }

    public void forget(View view) {
        Toast.makeText(this, "You Clicked forget password", Toast.LENGTH_SHORT).show();
    }

    public void registerPage(View view) {
        Intent in =new Intent(Login.this,Registeration.class);
        startActivity(in);
    }

    @Override
    public void onBackPressed() {
        Intent in=new Intent(Login.this,Home.class);
        in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(in);
        Login.this.finish();
    }
}
