package com.example.user.perumahan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//memasukan fungsi yang digunakan dihalaman ini


public class LoginActivity extends AppCompatActivity  {

    private EditText UsernameText;
    private EditText PasswordText;
    //deklarasi variabel
    Button createAccount;
     /*
    * Memanggil kelas pengatur database
    * */
    LoginDataBaseAdapter loginDataBaseAdapter;

    String inputUsername ,inputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginDataBaseAdapter = new LoginDataBaseAdapter(this);
        loginDataBaseAdapter= loginDataBaseAdapter.open();
        createAccount = (Button)findViewById(R.id.cacount);
        //=========================================

        TextView loginView = (TextView) findViewById(R.id.loginView);
        //variabel loginView berupa textView//cari berdasarkan id

        //ambil text/string dari kolom Password
        Button loginButton = (Button) findViewById(R.id.LoginButton);
        //variabel loginButton berupa button//cari berdasarkan id


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                UsernameText = (EditText) findViewById(R.id.UsernameText);
                //variabel Usernametext berupa EditText//cari berdasarkan id
                inputUsername= UsernameText.getText().toString();
                //ambil text/string dari kolom UsernameText
                PasswordText = (EditText) findViewById(R.id.PasswordText);
                //variabel passwordText berupa EditText//cari berdasarkan id
                inputPassword = PasswordText.getText().toString();
                String storePassword = loginDataBaseAdapter.getSingleEntry(inputUsername) ;

                Log.d("StoredPassword", inputPassword);
            }
        });
        //perintah ketika tombol loginButton ditekan//(this) perintahnya ada di kelas ini
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoAccaount = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(gotoAccaount);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginDataBaseAdapter.close();
    }




}