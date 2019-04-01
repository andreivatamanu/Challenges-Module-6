package com.example.homeworkmodule6.Challenge3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.homeworkmodule6.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BundleFragment extends Fragment {

    private TextView mTextViewEmail;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bundle, container, false);
        initView(view);
        return (view);
    }

    private void initView(View view) {
        mTextViewEmail = view.findViewById(R.id.text_view_bundle_fragment);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String email = bundle.getString(BundleFragmentActivity.EMAIL);
            if (email != null && !email.isEmpty()) {
                mTextViewEmail.setText(email);
            }

        }
    }
}
