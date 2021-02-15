package com.example.atomlogin;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {
    private Button button;
    EditText Fname;
    FirebaseAuth fAuth;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Fname= findViewById(R.id.editTextTextPersonName);
        b = findViewById(R.id.button);
        fAuth= FirebaseAuth.getInstance();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Fname.getText().toString().trim();

                if(TextUtils.isEmpty(name)) {
                    Fname.setError("Please enter your name");
                    return;
                }
                fAuth.cre
            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Openactivity_homescreen();
            }
        });

    }
        public void Openactivity_homescreen(){
            Intent intent = new Intent(this,screen_home.class);
            startActivity(intent);
        }
}