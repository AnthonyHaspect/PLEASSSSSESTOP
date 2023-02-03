package com.anthony2027425.pleasssssestop;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button btnCalculTx;
    Button btnPourbNet;
    Button btnPourbPourc;
    EditText etSousTot;
    EditText etPourb;
    TextView tvTotalTVQ;
    TextView tvTotalTPS;
    TextView tvTotalST;
    TextView tvTotalPB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MonLog", "L'application est démarrée");
        //associer les variables aux objets avec les id du layout
        btnCalculTx = findViewById(R.id.btnCalculTx);
        btnPourbNet = findViewById(R.id.btnPourbNet);
        btnPourbPourc = findViewById(R.id.btnPourbPourc);
        etPourb = findViewById(R.id.etPourb);
        etSousTot = findViewById(R.id.etSousTot);
        tvTotalPB = findViewById(R.id.tvTotalPB);
        tvTotalST = findViewById(R.id.tvTotalST);
        tvTotalTPS = findViewById(R.id.tvTotalTPS);
        tvTotalTVQ = findViewById(R.id.tvTotalTVQ);

        public int cacTxTT(int val){
            double value = val * 1.09975;
            value +=  val * 1.05;
            return value;

        }

        btnCalculTx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MonLog", "Btn cliquer");

            }
        });
    }
}