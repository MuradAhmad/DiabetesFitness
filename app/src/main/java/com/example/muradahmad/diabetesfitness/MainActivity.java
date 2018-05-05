package com.example.muradahmad.diabetesfitness;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {





    Button login,register, settings, btnDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        login = (Button) findViewById(R.id.btnlogin);
        register = (Button) findViewById(R.id.btnregister);
        settings = (Button) findViewById(R.id.btnsettings);
        btnDashboard = (Button) findViewById(R.id.btndashboard);


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



        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Settings.class);
                startActivity(intent);

            }
        });


        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Dashboard.class);
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
