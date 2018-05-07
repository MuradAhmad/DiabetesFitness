package com.example.muradahmad.diabetesfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by muradahmad on 04/05/2018.
 */

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.idDashboard);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
       // getActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_profile:
               // Toast.makeText(this,"this is User Profile", Toast.LENGTH_LONG).show();

              getSupportFragmentManager().beginTransaction().replace(R.id.idDashboard, new Profile()).commit();

                break;

            case R.id.menu_dietMed:
                  Toast.makeText(this,"this is Diet Medicine Plan", Toast.LENGTH_LONG).show();

                break;
            case R.id.menu_Exercise:
                Toast.makeText(this,"this is Exercise", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_weekLog:
                Toast.makeText(this,"this is Weekly Logs", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_setting:
                Toast.makeText(this,"this is Settings", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_logout:
                Toast.makeText(this,"this is Logout", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_dashboard:
                Toast.makeText(this,"this is Dashboard", Toast.LENGTH_LONG).show();


                break;


        }


        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

   @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}