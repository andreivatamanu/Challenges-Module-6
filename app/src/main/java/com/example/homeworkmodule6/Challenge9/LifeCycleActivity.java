package com.example.homeworkmodule6.Challenge9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.homeworkmodule6.Logging;
import com.example.homeworkmodule6.R;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Logging.show(LifeCycleActivity.this, "onCreate - activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logging.show(LifeCycleActivity.this, "onStart - activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logging.show(LifeCycleActivity.this, "onResume - activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logging.show(LifeCycleActivity.this, "onPause - activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logging.show(LifeCycleActivity.this, "onRestart - activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logging.show(LifeCycleActivity.this, "onStop - activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logging.show(LifeCycleActivity.this, "onDestroy - activity");
    }
}

