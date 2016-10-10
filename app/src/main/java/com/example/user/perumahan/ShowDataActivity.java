package com.example.user.perumahan;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowDataActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);


        TextView ringkasanView = (TextView) findViewById(R.id.ringkasanView);
        TextView idView = (TextView) findViewById(R.id.idView);
        TextView namapemilikView = (TextView) findViewById(R.id.namapemilikView);
        TextView tiperumahView = (TextView) findViewById(R.id.tiperumahView);
        TextView hargarumahView = (TextView) findViewById(R.id.hargarumahView);
        TextView dpView = (TextView) findViewById(R.id.dpView);
        TextView cicilanperbulanView = (TextView) findViewById(R.id.cicilanperbulanView);
        TextView cicilanlunasView = (TextView) findViewById(R.id.cicilanlunasView);
        TextView tunggakanView = (TextView) findViewById(R.id.tunggakanView);
        TextView sisacicilanView = (TextView) findViewById(R.id.sisacicilanView);

        TextView aidView = (TextView) findViewById(R.id.aidView);
        TextView anamapemilikView = (TextView) findViewById(R.id.anamapemilikView);
        TextView atiperumahView = (TextView) findViewById(R.id.atiperumahView);
        TextView ahargarumahView = (TextView) findViewById(R.id.ahargarumahView);
        TextView adpView = (TextView) findViewById(R.id.adpView);
        TextView acicilanperbulanView = (TextView) findViewById(R.id.acicilanperbulanView);
        TextView acicilanlunasView = (TextView) findViewById(R.id.acicilanlunasView);
        TextView atunggakanView = (TextView) findViewById(R.id.atunggakanView);
        TextView asisacicilanView = (TextView) findViewById(R.id.asisacicilanView);

        Button detailbayarButton = (Button) findViewById(R.id.detailbayarButton);

        detailbayarButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent bukadetail = new Intent(this, detailActivity.class);
        startActivity(bukadetail);

    }
}
