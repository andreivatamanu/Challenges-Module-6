package com.example.homeworkmodule6.Challenge9;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homeworkmodule6.Logging;
import com.example.homeworkmodule6.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LifeCycleFragment extends Fragment {


    public LifeCycleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Logging.show(getActivity(), "onCreateView - fragment");
        return inflater.inflate(R.layout.fragment_life_cycle, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Logging.show(getActivity(), "onAttach - fragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logging.show(getActivity(), "onCreate - fragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Logging.show(getActivity(), "onActivityCreated - fragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Logging.show(getActivity(), "onStart - fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Logging.show(getActivity(), "onResume - fragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Logging.show(getActivity(), "onPause - fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Logging.show(getActivity(), "onStop - fragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Logging.show(getActivity(), "onDestroyView - fragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logging.show(getActivity(), "onDestroy - fragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Logging.show(getActivity(), "onDetach - fragment");
    }
}
