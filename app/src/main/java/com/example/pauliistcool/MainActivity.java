package com.example.pauliistcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {



    private Button bFaecher;
    private Button bNachhilfe;
    private Button bStundenplan;
    private Button bTexteBeispiele;
    private ImageButton ibSchullogo;
    private Button bLogin;

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
        this.bLogin = this.findViewById(R.id.bLogin);
        this.bLogin = (Button) this.findViewById(R.id.bLogin);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityLOGIN();
            }

        });
    }

    private void openSchullogo() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.brg-judenburg.ac.at/"));
        startActivity(browserIntent);
    }

    private void openTexteBeispiele() {
        Intent intent = new Intent(this, Faecher.class);
        startActivity(intent);
    }

    private void openStundenplan() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://urania.webuntis.com/WebUntis/?school=brg-judenburg#/basic/main"));
        startActivity(browserIntent);
    }

    private void openFaecher() {
        Intent intent = new Intent(this, Faecher.class);
        startActivity(intent); }

    private void openActivityLOGIN() {
        Intent intent = new Intent(this, ActivitiyLOGIN.class);
        startActivity(intent);
    }
}