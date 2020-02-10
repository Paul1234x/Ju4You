package com.example.pauliistcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Faecher extends AppCompatActivity implements View.OnClickListener {

    private Button Mathe;
    private Button Latein;
    private Button Physik;

    private Button Back;
    private Button Home;
    Intent intent = new Intent(this, NamenMathe.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faecher);

        this.Mathe = this.findViewById(R.id.id_Mathe);
        this.Latein = this.findViewById(R.id.id_latien);
        this.Physik = this.findViewById(R.id.id_physik);


        this.Back = this.findViewById(R.id.id_back);
        this.Home = this.findViewById(R.id.id_home);
    }

    @Override
    public void onClick(View view) {
        Button clicked = (Button) view;
        if (clicked.getId() == this.Mathe.getId())  {
            startActivity(intent);

        }
        if (clicked.getId() == this.Latein.getId()){


        }
        if (clicked.getId() == this.Physik.getId()){


        }
        if (clicked.getId() == this.Back.getId()){


        }
        if (clicked.getId() == this.Home.getId()){


        }

    }


}
