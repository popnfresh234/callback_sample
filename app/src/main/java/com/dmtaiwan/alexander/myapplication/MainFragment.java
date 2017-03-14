package com.dmtaiwan.alexander.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Alexander on 3/14/2017.
 */

public class MainFragment extends Fragment implements MainActivity.MyListener {

    TextView myTextView;
    Button resetButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        myTextView = (TextView) rootView.findViewById(R.id.my_text_view);
        resetButton = (Button) rootView.findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView.setText("This is a Fragment");
            }
        });
        return rootView;
    }


    @Override
    public void onClick(String myString) {
        myTextView.setText(myString);
    }
}
