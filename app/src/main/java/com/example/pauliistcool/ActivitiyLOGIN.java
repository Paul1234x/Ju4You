package com.example.pauliistcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitiyLOGIN extends AppCompatActivity {

    private Button bREGISTER;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitiy_login);
        this.bREGISTER = this.findViewById(R.id.bStundenplan);
        this.bREGISTER = (Button) this.findViewById(R.id.bStundenplan);
        bREGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityREGISTER();
            }
        });
    }
    private void openActivityREGISTER() {
        Intent intent = new Intent(this, ActivitiyLOGIN.class);
        startActivity(intent);
    }
}