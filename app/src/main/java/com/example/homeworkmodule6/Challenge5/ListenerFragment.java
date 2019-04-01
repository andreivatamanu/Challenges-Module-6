package com.example.homeworkmodule6.Challenge5;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.homeworkmodule6.Logging;
import com.example.homeworkmodule6.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListenerFragment extends Fragment {


    private EditText mEditTextFirstNumber;
    private EditText mEditTextSecondNumber;
    private Button mButtonSendNumbers;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_listener, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mEditTextFirstNumber = view.findViewById(R.id.edit_text_first_number);
        mEditTextSecondNumber = view.findViewById(R.id.edit_text_second_number);
        mButtonSendNumbers = view.findViewById(R.id.btnSendNumbers);
        mButtonSendNumbers.setOnClickListener(v -> {
            if (mEditTextFirstNumber != null && mEditTextSecondNumber != null) {
                String firstNumberInput = mEditTextFirstNumber.getText().toString();
                String secondNumberInput = mEditTextSecondNumber.getText().toString();
                if (!firstNumberInput.isEmpty() && !secondNumberInput.isEmpty()) {
                    long firstNumber = Long.parseLong(firstNumberInput);
                    long secondNumber = Long.parseLong(secondNumberInput);
                    Listener listener = (Listener) getActivity();
                    if (listener != null) {
                        listener.addNumbers(firstNumber, secondNumber);
                    }
                } else {
                    mEditTextFirstNumber.setError(getString(R.string.error_first_number));
                    mEditTextSecondNumber.setError(getString(R.string.error_second_number));
                }
            } else {
                Logging.show(ListenerFragment.this, getString(R.string.text_can_be_null));
            }
        });
    }
}
