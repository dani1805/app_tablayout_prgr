package com.example.mytablayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCinema#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCinema extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentCinema() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCinema.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentCinema newInstance(String param1, String param2) {
        FragmentCinema fragment = new FragmentCinema();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_cinema, container, false);

        Button trailerOne = view.findViewById(R.id.trailerOne);
        Button trailerTwo = view.findViewById(R.id.trailerTwo);
        Button trailerThree = view.findViewById(R.id.trailerThree);
        Button trailerFour = view.findViewById(R.id.trailerFour);
        Button trailerFive = view.findViewById(R.id.trailerFive);
        Button trailerSix = view.findViewById(R.id.trailerSix);

        trailerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=9491sTTkvzQ"));
                startActivity(intent);
            }
        });

        trailerTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=BizjYFvJpd8&t=1s"));
                startActivity(intent);
            }
        });

        trailerThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=64Qcp5K0_HE"));
                startActivity(intent);
            }
        });

        trailerFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=erNbtU5j_XY"));
                startActivity(intent);
            }
        });

        trailerFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=eKl8TuDYkmw"));
                startActivity(intent);
            }
        });

        trailerSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=AdLbrdMbfv0"));
                startActivity(intent);
            }
        });



        return view;
    }
}