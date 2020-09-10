package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bill2;
    private EditText jumlah;
    private Button btnHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private  void initUI(){
        bil1 = (EditText) findViewById(R.id.txtBil1);
        bill2 = (EditText) findViewById(R.id.txtBil2);
        jumlah = (EditText) findViewById(R.id.hasill);
        btnHasil = (Button) findViewById(R.id.btnHitung);
    }

    private  void  initEvent(){
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bill2.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total+"");
    }
}