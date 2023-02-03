package com.anthony2027425.pleasssssestop;

import android.os.Bundle;
import android.util.Log;
//import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    private float Total;

    public double CalTxP(float val) {
        return val * 0.05;
        }
    public double CalTxF(float val){
        return val * 0.09975;
    }
    public double CalculTotal(double a, double b, float c){
        return a + b + c;
    }


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

        Log.d("MonLog", "une ligne avant le bouton");
        btnCalculTx.setOnClickListener(v -> {
            Log.d("MonLog", "Btn calcul tx cliquer");
            Total = Float.parseFloat(String.valueOf(etSousTot.getText()));
            Log.d("MonLog", "le value of total"+ Total);
            double txQueb =  CalTxP(Total);
            Log.d("MonLog", "valeur de txqueb"+ txQueb);

            double txFed = CalTxF(Total);
            Log.d("MonLog", "valeur de txqueb"+ txFed);

            double TotalFinal = CalculTotal(txFed, txQueb, Total);
            Log.d("MonLog", "valeur de total final"+ TotalFinal);
            tvTotalST.setText(String.format("%10.2f", TotalFinal));
            tvTotalTPS.setText(String.format("%10.2f", txFed));
            tvTotalTVQ.setText(String.format("%10.2f", txQueb));
        });
    }

}