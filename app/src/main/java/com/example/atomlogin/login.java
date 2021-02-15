package com.example.atomlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class login extends AppCompatActivity {
    private Button button2;
    private Button button3;
    private GoogleSignInClient mGoogleSignInClient;
    private final static int RC_SIGN_IN=123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button2 = (Button) findViewById(R.id.button2);
        setContentView(R.layout.activity_login);
        Button button3 = (Button) findViewById(R.id.button3);
        createRequest();
        button2.OnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                signIn();
        })
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Openactivity_register();
            }
        });
        } private void signIn() {
            Intent signInIntent = mGoogleSignInClient.getSignInIntent();
            startActivityForResult(signInIntent, RC_SIGN_IN);
        }

    private void createRequest() {
        // Configure Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        // Build a GoogleSignInClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

    }

    public void Openactivity_register(){
            Intent intent = new Intent(this,register.class);
            startActivity(intent);
        }

}
