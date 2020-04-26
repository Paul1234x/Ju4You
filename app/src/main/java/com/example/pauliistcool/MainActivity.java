package com.example.pauliistcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {



    private Button bFaecher;
    private Button bNachhilfe;
    private Button bStundenplan;
    private Button bTexteBeispiele;
    private ImageButton ibSchullogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        this.bNachhilfe = this.findViewById(R.id.bNachhilfe);
        this.bNachhilfe = (Button) this.findViewById(R.id.bNachhilfe);
        bNachhilfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFaecher();
            }

        });
        this.bStundenplan = this.findViewById(R.id.bStundenplan);
        this.bStundenplan = (Button) this.findViewById(R.id.bStundenplan);
        bStundenplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStundenplan();
            }
        });
        this.bTexteBeispiele = this.findViewById(R.id.bTexteBeispiele);
        this.bTexteBeispiele = (Button) this.findViewById(R.id.bTexteBeispiele);
        bTexteBeispiele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTexteBeispiele();
            }
        });
        this.ibSchullogo = this.findViewById(R.id.ibSchullogo);
        this.ibSchullogo = (ImageButton) this.findViewById(R.id.ibSchullogo);
        ibSchullogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSchullogo();
            }
        });
    }

    private void openSchullogo() {
        Uri uri = Uri.parse("https://www.brg-judenburg.ac.at/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openTexteBeispiele() {
        Intent intent = new Intent(this, TexteBeispiele.class);
        startActivity(intent);
    }

    private void openStundenplan() {
        Intent intent = new Intent(this, Stundenplan.class);
        startActivity(intent);
    }

    private void openFaecher() {
        Intent intent = new Intent(this, Faecher.class);
        startActivity(intent); }

    @Override
    public void onClick(View view) {

    }
}

