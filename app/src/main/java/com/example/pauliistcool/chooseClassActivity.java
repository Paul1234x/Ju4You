package com.example.pauliistcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseClassActivity extends AppCompatActivity implements View.OnClickListener {
    private Button id_5;
    private Button id_6;
    private Button id_7;
    private Button id_8;
    private Button id_zurück;
    private Button id_home;
    private Button id_school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_class);
    }

    @Override
    public void onClick(View view) {

    }
}
