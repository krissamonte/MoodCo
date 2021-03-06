package com.example.kris.moodco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btnEdit;
    Button btnStatus;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnEdit = (Button) findViewById(R.id.btnEditProfile);
        btnEdit.setOnClickListener(goToLogin);

        btnStatus = (Button) findViewById(R.id.btnStatus);
        btnStatus.setOnClickListener(goToStatusActivity);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(goToHome);
    }

    View.OnClickListener goToHome = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getBaseContext(), HomeActivity.class);
            startActivity(i);

        }
    };

    View.OnClickListener goToLogin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getBaseContext(), MainActivity.class);
            startActivity(i);

        }
    };

    View.OnClickListener goToStatusActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getBaseContext(), StatusActivity.class);
            startActivity(i);

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
