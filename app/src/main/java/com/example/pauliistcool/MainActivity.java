package com.example.pauliistcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bNachhilfe;
    private Button bStundenplan;
    private Button bTexteBeispiele;
    private ImageButton ibSchullogo;


    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://urania.webuntis.com/WebUntis/?school=brg-judenburg#/basic/main"));
    Intent homepage = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bNachhilfe = this.findViewById(R.id.bNachhilfe);
        this.bStundenplan = this.findViewById(R.id.bStundenplan);
        this.bTexteBeispiele = this.findViewById(R.id.bTexteBeispiele);
        this.ibSchullogo = this.findViewById(R.id.ibSchullogo);

        this.bStundenplan.setOnClickListener((View.OnClickListener) this);
        this.bNachhilfe.setOnClickListener((View.OnClickListener) this);
        this.bTexteBeispiele.setOnClickListener((View.OnClickListener) this);
        this.ibSchullogo.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View view) {
        Button clicked = (Button) view;
        if(clicked.getId() == this.bStundenplan.getId()) {
            startActivity(intent);
        }
        if(clicked.getId() == this.bTexteBeispiele.getId()) {
            startActivity(wissmanont);
        }
        if(clicked.getId() == this.bNachhilfe.getId()) {
            startActivity(Emifragen);
        }
        if(clicked.getId() == this.ibSchullogo.getId())  {
            startActivity(homepage);
    }
    }

