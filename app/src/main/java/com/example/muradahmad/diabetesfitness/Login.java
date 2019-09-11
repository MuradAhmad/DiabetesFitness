package com.example.muradahmad.diabetesfitness;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by muradahmad on 13/04/2018.
 */

public class Login extends AppCompatActivity {


    TextView txtregester;
    Button btndashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        getWindow().setBackgroundDrawableResource(R.drawable.ic_bg);



        txtregester = (TextView) findViewById(R.id.txtregister);

        btndashboard = (Button) findViewById(R.id.btnlogin);



        btndashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,Dashboard.class);
                startActivity(intent);

            }
        });



    }


 public void registerUser (View v){
     txtregester.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             Intent intent=new Intent(Login.this,Register.class);
             startActivity(intent);
         }
     });
 }
/*
    public void userDashboard (View v){
        btndashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Login.this,Dashboard.class);
                startActivity(intent);
            }
        });
    }*/


}
