package com.example.kris.moodco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChooseMoodActivity extends AppCompatActivity {
    Button happy;
    Button sad;
    Button angry;

    TextView happyScore;
    TextView sadScore;
    TextView angryScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mood);

        happy = (Button) findViewById(R.id.btnHappy);
        happy.setOnClickListener(addHappyScore);

        sad = (Button) findViewById(R.id.btnSad);
        sad.setOnClickListener(addSadScore);

        angry = (Button) findViewById(R.id.btnAngry);
        angry.setOnClickListener(addAngryScore);

        happyScore = (TextView) findViewById(R.id.tvScore);
        sadScore = (TextView) findViewById(R.id.tvScore2);
        angryScore = (TextView) findViewById(R.id.tvScore3);

    }

    View.OnClickListener addHappyScore = new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent();
            i.putExtra("score", i);
            setResult(RESULT_OK, i);
            startActivityForResult(i, 0);
        }
    };

    View.OnClickListener addSadScore = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getBaseContext(), HomeActivity.class);
            startActivity(i);

        }
    };

    View.OnClickListener addAngryScore = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent();
            i.setClass(getBaseContext(), HomeActivity.class);
            startActivity(i);

        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0 && resultCode == RESULT_OK){
            int score = data.getExtras().getInt("score");
            happyScore.setText(score+34);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_mood, menu);
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
