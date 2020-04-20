package com.example.pauliistcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Faecher extends AppCompatActivity {

    private Button Mathe;
    private Button Latein;
    private Button Physik;

    private Button Back;
    private Button Home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faecher);

        this.Mathe = this.findViewById(R.id.id_Mathe);
        this.Mathe = (Button) this.findViewById(R.id.id_Mathe);
        Mathe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFaecher_Mathe();
            }
        });

        this.Latein = this.findViewById(R.id.id_latien);
        this.Latein = (Button) this.findViewById(R.id.id_latien);
        Latein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFaecher_Latein();
            }
        });

        this.Physik = this.findViewById(R.id.id_physik);
        this.Physik = (Button) this.findViewById(R.id.id_physik);
        Latein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFaecher_Physik();
            }
        });

        this.Back = this.findViewById(R.id.id_back);
        this.Home = this.findViewById(R.id.id_home);
    }
    public void openFaecher_Mathe() {
        Intent intent = new Intent(this, Faecher_Mathe.class);
        startActivity(intent);

    }
    public void openFaecher_Latein() {
            Intent intent = new Intent(this, Faecher_Latein.class);
            startActivity(intent);
    }
    public void openFaecher_Physik() {
        Intent intent = new Intent(this, Faecher_Physik.class);
        startActivity(intent);
    }
}
