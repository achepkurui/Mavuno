package com.nashipaechepkurui.mavuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button login , details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.bLogin);
        details = (Button) findViewById(R.id.bDetails);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Login.class
                );
                startActivity(intent);
            }

        });

       details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,FarmerDetails.class
                );
                startActivity(intent);
            }

        });




    }
}
