package net.yusufakgun.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView istatistik;
    TextView karakterOzellikleri;
    Button saldir;
    Button yemekye;
    Button uyu;
    karakter k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        istatistik = (TextView) findViewById(R.id.istatistik);
        karakterOzellikleri = (TextView) findViewById(R.id.karakterOzellikleri);
        saldir = (Button) findViewById(R.id.saldir);
        yemekye = (Button) findViewById(R.id.yemekye);
        uyu = (Button) findViewById(R.id.uyu);

        saldir.setOnClickListener(this);
        yemekye.setOnClickListener(this);
        uyu.setOnClickListener(this);

        k = new karakter();
        k.hareketKabiliyeti = 10;
        k.kilo = 10;
        k.saldiriGucu = 100;

        karakterOzellikleri.setText(k.toString());
        istatistik.setText("Oyuna hoş geldiniz lütfen bir işlem seçiniz");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== saldir.getId())
            istatistik.setText(k.savas());
        else if(v.getId()== yemekye.getId())
            istatistik.setText(k.yemek());
        else if(v.getId()== uyu.getId())
            istatistik.setText(k.uyumak());

        karakterOzellikleri.setText(k.toString());
    }
}
