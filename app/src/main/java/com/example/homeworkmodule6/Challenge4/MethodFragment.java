package com.example.homeworkmodule6.Challenge4;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.homeworkmodule6.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MethodFragment extends Fragment {


    private String mName;
    private TextView mTextViewHello;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_method, container, false);
        initView(view);
        setTextViewHello();
        return view;
    }

    private void setTextViewHello() {
        if (mTextViewHello != null) {
            mTextViewHello.setText("Hello " + mName + "!");
        }
    }

    private void initView(View view) {
        mTextViewHello = view.findViewById(R.id.text_view_hello);
    }

    public void setName (String name) {
        this.mName = name;
    }

}