package com.example.milehighotters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
TODO: just input warnings for shit, cuz like, i know you and youre not gonna be doing the shit until much later
TODO: database independent errors: user tries to put admin2 for password and username, password and password cnfirmation text not matching
 */

public class AccountCreation extends AppCompatActivity {

    Button create;
    TextView username;
    TextView password;
    TextView passwordConfirmation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_creation);

        create = findViewById(R.id.createAccount);
        username = findViewById(R.id.createUserName);
        password = findViewById(R.id.createPassword);
        passwordConfirmation = findViewById(R.id.passwordConfirmation);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo: implement database-independent errors!
            }
        });
    }
}
