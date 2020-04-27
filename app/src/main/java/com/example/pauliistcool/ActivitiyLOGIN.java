package com.example.pauliistcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivitiyLOGIN extends AppCompatActivity {

    private Button bREGISTER;
    private Button bLOGIN;
    EditText etUsername, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitiy_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        this.bREGISTER = this.findViewById(R.id.bREGISTER);
        this.bREGISTER = (Button) this.findViewById(R.id.bREGISTER);
        bREGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityREGISTER();
            }
        });
    }
    private void openActivityREGISTER() {
        Intent intent = new Intent(this, ActivityREGISTER.class);
        startActivity(intent);
    }
}
