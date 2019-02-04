package com.example.jokeandroidlibrary;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokesActivityFragment extends Fragment {


    public JokesActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jokes_activity, container, false);
        //Intent i = getActivity().getIntent();

        String gce_result = getActivity().getIntent().getStringExtra("gce_result");
        TextView gce_result_show = (TextView) view.findViewById(R.id.jokes_text_view);
        gce_result_show.setText(gce_result);

        return view;
    }

}
