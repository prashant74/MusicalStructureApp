package com.example.prashant.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  Button currentPlayingNavBtn;
  Button playListNavBtn;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    currentPlayingNavBtn = (Button) findViewById(R.id.nav_current_playing);
    playListNavBtn = (Button) findViewById(R.id.nav_music_library);
    currentPlayingNavBtn.setOnClickListener(this);
    playListNavBtn.setOnClickListener(this);
  }

  @Override public void onClick(View view) {
    int viewId = view.getId();
    Intent navIntent;
    switch (viewId) {
      case R.id.nav_current_playing:
        navIntent = new Intent(this, NowPlayingActivity.class);
        startActivity(navIntent);
        break;
      case R.id.nav_music_library:
        navIntent = new Intent(this, PlaylistActivity.class);
        startActivity(navIntent);
        break;
    }
  }
}
