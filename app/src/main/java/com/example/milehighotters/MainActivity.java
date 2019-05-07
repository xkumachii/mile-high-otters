package com.example.milehighotters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    TODO: fucking do shit.
    TODO: create things.
     */

    Button login;
    TextView password;
    TextView username;
    Button createAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        createAccount = findViewById(R.id.createAccount);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: FUCKING IMPLEMENT USER DATABASE SHIT YOU NIGGER
                // The admin username and password are hardcoded into this system, and will not be part
                // of any database.
                try {
                    if (username.getText().toString().equals("admin2") &&
                            password.getText().toString().equals("admin2")) {
                        Intent intent = new Intent(MainActivity.this, FlightManagement.class);
                        startActivity(intent);
                    } else {
                        //TODO: IMPLEMENT FUCKING USER DATABASE SHIT YOU FUCK
                        //TODO: FOR NOW, THE SCREEN LEADS DIRECTLY INTO THIS SHITTY FUCKING MENU.
                        Intent intent = new Intent(MainActivity.this, MainMenu.class);
                        startActivity(intent);
                    }
                } catch (NullPointerException e) {
                    Log.i("ERROR", "NO INPUT.");
                }
            }
        });

    }
}
