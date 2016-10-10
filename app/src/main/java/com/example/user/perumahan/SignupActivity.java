package com.example.user.perumahan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText edUsername, edPassword;
    String getusername;
    String getpassword;
    Button tekanSignup;
    LoginDataBaseAdapter loginDataBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edUsername = (EditText) findViewById(R.id.UsernameText);
        edPassword = (EditText) findViewById(R.id.PasswordText);

        getusername = edUsername.getText().toString();
        getpassword = edPassword.getText().toString();

        loginDataBaseAdapter = new LoginDataBaseAdapter(this);
        loginDataBaseAdapter = loginDataBaseAdapter.open();
        tekanSignup = (Button) findViewById(R.id.SignUpButton);

        tekanSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginDataBaseAdapter.insertEntry(getusername, getpassword);
                Toast.makeText(getApplicationContext(),
                        "Account Successfully Created ", Toast.LENGTH_LONG)
                        .show();
                Intent i = new Intent(SignupActivity.this,
                        LoginActivity.class);
                startActivity(i);
                finish();
            }
        });


    }


}
