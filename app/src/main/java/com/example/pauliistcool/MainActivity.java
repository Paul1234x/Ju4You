package com.example.pauliistcool;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.security.cert.Extension;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Faecher;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Faecher = this.findViewById(R.id.id_Faecher);

        }


    @Override
    public void onClick(View view) {
        Button clicked = (Button) view;
        if (clicked.getId() == this.Faecher.getId()){
            startActivity(Faecher);
    }

    }
        private void startActivity(Button faecher) {

        startActivity(Faecher);
    }
}
