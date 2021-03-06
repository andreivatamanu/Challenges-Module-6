package com.example.homeworkmodule6.Challenge5;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.homeworkmodule6.Challenge5.ListenerFragment;
import com.example.homeworkmodule6.R;

public class ListenerFragmentActivity extends AppCompatActivity {

    private TextView mTextViewSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener_fragment);
        initView();
        ListenerFragment listenerFragment = new ListenerFragment();
        addFragment(listenerFragment);
    }

    private void initView() {
        mTextViewSum = findViewById(R.id.text_view_sum);
    }

    private void addFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_listener_fragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void addNumbers (long firstNumber, long secondNumber) {
        long sum = firstNumber + secondNumber;
        mTextViewSum.setText("Sum is: " + sum);
    }
}
