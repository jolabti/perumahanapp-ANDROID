package com.example.user.perumahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText caridata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText searchText = (EditText) findViewById(R.id.searchText);
        caridata = (EditText) findViewById(R.id.searchText);
        caridata.getText();
        Button searchButton = (Button) findViewById(R.id.searchButton);


        searchButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (caridata.getText().toString().equals("")) {
            Toast.makeText(getBaseContext(), "Masukan Nomor Pelanggan", Toast.LENGTH_LONG).show();
        } else {
            Intent bukaData = new Intent(this, ShowDataActivity.class);
            startActivity(bukaData);
        }
    }
}
