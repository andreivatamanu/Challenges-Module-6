package com.example.homeworkmodule6.Challenge3;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.homeworkmodule6.R;

public class BundleFragmentActivity extends AppCompatActivity {

    public static final String EMAIL = "email";
    private EditText mEditTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_fragment);
        initView();
    }

    private void initView() {
        mEditTextEmail = findViewById(R.id.edit_text_bundle_fragment);
        createDynamicFragment(new BundleFragment());
    }

    private void createDynamicFragment(BundleFragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_bundle_fragment, fragment);
        fragmentTransaction.commit();
    }

    public void sendEmailToFragmentOnClick(View view) {
        Bundle bundle = new Bundle();
        if (mEditTextEmail != null) {
            String email = mEditTextEmail.getText().toString();
            if (!email.isEmpty()) {
                bundle.putString(EMAIL, email);
                BundleFragmentActivity bundleFragment = new BundleFragmentActivity();
                bundleFragment.setArguments(bundle);
                createDynamicFragment(bundleFragment);
            }
        }
    }
}
