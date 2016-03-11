package com.kminfosystems.android.secondtask;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class TutorialPageFive extends Fragment {
    private static final String EXTRA_MESSAGE = "mes";

    public static final TutorialPageFive newInstance(String message) {
        TutorialPageFive f = new TutorialPageFive();
        Bundle bdl = new Bundle(1);
        bdl.putString(EXTRA_MESSAGE, message);
        f.setArguments(bdl);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String message = getArguments().getString(EXTRA_MESSAGE);
        View v = inflater.inflate(R.layout.item4, container, false);
        final TextView messageTextView = (TextView) v.findViewById(R.id.textView);
        messageTextView.setText(message);

        LinearLayout Click = (LinearLayout) v.findViewById(R.id.Click);
        Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),messageTextView.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });
        return v;
    }
}
