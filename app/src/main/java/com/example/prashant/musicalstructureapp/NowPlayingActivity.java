package com.example.prashant.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_now_playing);
    Button navButton = (Button) findViewById(R.id.nav_home_from_now_playing);
    navButton.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Intent navIntent = new Intent(view.getContext(), MainActivity.class);
        view.getContext().startActivity(navIntent);
      }
    });
  }
}
