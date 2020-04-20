package com.example.pauliistcool;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import androidx.appcompat.app.AppCompatActivity;

        import java.security.cert.Extension;

public class MainActivity extends AppCompatActivity{
    private Button Faecher;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Faecher = (Button) this.findViewById(R.id.id_Faecher);
        Faecher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFaecher();
            }
        });
    }
    public void openFaecher() {
        Intent intent = new Intent(this, Faecher.class);
        startActivity(intent);
    }
}
