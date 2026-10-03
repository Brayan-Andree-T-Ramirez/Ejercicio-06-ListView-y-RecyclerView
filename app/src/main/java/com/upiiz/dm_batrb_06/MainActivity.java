package com.upiiz.dm_batrb_06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Variables
    Button btnBasicLV, btnCustomLV,btnBasicRecyclerLV,btnCustomRecyclerLV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Enlazar
        initComponents();

        //Listener
        btnBasicLV.setOnClickListener(this);
        btnCustomLV.setOnClickListener(this);
        btnBasicRecyclerLV.setOnClickListener(this);
        btnCustomRecyclerLV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnBasicLV){
            iniciarBasicLV();
        }else if(v.getId() == R.id.btnCustomLV){
            iniciarCustomLV();
        }else if(v.getId() == R.id.btnBasicRecyclerLV){
            iniciarBasicRecyclerLV();
        }else{
            iniciarCustomRecyclerLV();
        }

    }

    public void iniciarBasicLV(){
        //En los intents podemos pasar parámetros
        Intent intentBLV = new Intent(this, BasicListViewActivity.class);
        startActivity(intentBLV);
    }

    public void iniciarCustomLV(){
        Intent customCLV = new Intent(this, CustomListViewActivity.class);
        startActivity(customCLV);
    }

    public void iniciarBasicRecyclerLV(){
        Intent intentBRV = new Intent(this, BasicRecyclerViewActivity.class);
        startActivity(intentBRV);
    }

    public void iniciarCustomRecyclerLV(){
        Intent intentCRV = new Intent(this,CustomRecyclerViewActivity.class);
        startActivity(intentCRV);
    }

    public void initComponents(){
        btnBasicLV = findViewById(R.id.btnBasicLV);
        btnCustomLV = findViewById(R.id.btnCustomLV);
        btnBasicRecyclerLV = findViewById(R.id.btnBasicRecyclerLV);
        btnCustomRecyclerLV = findViewById(R.id.btnCustomRecyclerLV);
    }
}