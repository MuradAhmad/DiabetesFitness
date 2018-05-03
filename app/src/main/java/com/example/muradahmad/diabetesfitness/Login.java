package com.example.muradahmad.diabetesfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by muradahmad on 13/04/2018.
 */

public class Login extends AppCompatActivity {


    TextView txtregester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        getWindow().setBackgroundDrawableResource(R.drawable.ic_bg);



        txtregester = (TextView) findViewById(R.id.txtregister);



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



}
