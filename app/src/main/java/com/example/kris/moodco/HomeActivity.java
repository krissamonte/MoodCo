package com.example.kris.moodco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    ImageButton ibMenu;
    Button btnUpdate;
    ImageButton ibStatus;
    Button ibCalendar;
    Button ibDiary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ibMenu = (ImageButton) findViewById(R.id.ibMenu);
        ibMenu.setOnClickListener(goToMenuActivity);

        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(goToStatusActivity);

        ibStatus = (ImageButton) findViewById(R.id.ibStatus);
        ibStatus.setOnClickListener(goToChooseMoodActivity);

        ibCalendar = (Button) findViewById(R.id.ibCalendar);
        ibCalendar.setOnClickListener(goToCalendarActivity);

        ibDiary = (Button) findViewById(R.id.ibDiary);
        ibDiary.setOnClickListener(goToDiaryActivity);

    }

    View.OnClickListener goToMenuActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getBaseContext(), MenuActivity.class);
            startActivity(i);

        }
    };

    View.OnClickListener goToChooseMoodActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getBaseContext(), ChooseMoodActivity.class);
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

    View.OnClickListener goToCalendarActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getBaseContext(), CalendarActivity.class);
            startActivity(i);

        }
    };

    View.OnClickListener goToDiaryActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getBaseContext(), DiaryActivity.class);
            startActivity(i);

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
