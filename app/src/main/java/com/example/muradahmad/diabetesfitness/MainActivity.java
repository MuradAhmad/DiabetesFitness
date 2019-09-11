package com.example.muradahmad.diabetesfitness;

import android.content.Intent;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.FloatMath;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    float number1 = 1.0f;

    float number2 = 2.0f;




    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       // float number3 = FloatMath.sqrt(number1 + number2);

                login = (Button) findViewById(R.id.btnlogin);
        register = (Button) findViewById(R.id.btnregister);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Register.class);
                startActivity(intent);

            }
        });





/*        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick (View v) {
//                startActivity(new Intent("com.tobidae.Activity1"));
//            }
//            /*//** OR you can just use the one down here instead, both work either way
            @Override
            public void onClick (View v){
                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        }*/

    }



}
