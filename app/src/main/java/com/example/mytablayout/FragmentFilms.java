package com.example.mytablayout;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentFilms#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentFilms extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_FILM = "film";
    private static final String ARG_POS = "position";
    private TextView tvTitle;
    private TextView tvYear;
    private TextView tvCountry;
    private TextView tvGender;
    private TextView tvQualification;
    private TextView tvDuration;
    private TextView tvSynopsis;
    private ImageView photo;


    // TODO: Rename and change types of parameters
    private Film film;
    private int position;


    public FragmentFilms() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param film     Film.
     * @param position position.
     * @return A new instance of fragment FragmentFilms.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentFilms newInstance(Film film, int position) {
        Bundle args = new Bundle();
        args.putParcelable(ARG_FILM, film);
        args.putInt(ARG_POS, position);

        FragmentFilms fragmentFilms = new FragmentFilms();
        fragmentFilms.setArguments(args);

        return fragmentFilms;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey(ARG_FILM)) {
                film = arguments.getParcelable(ARG_FILM);
            }
            if (arguments.containsKey(ARG_POS)) {
                position = arguments.getInt(ARG_POS);
            }

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_films, container, false);
        tvTitle = view.findViewById(R.id.tvTitle);
        tvYear = view.findViewById(R.id.tvYear);
        tvCountry = view.findViewById(R.id.tvCountry);
        tvQualification = view.findViewById(R.id.tvQualification);
        tvGender = view.findViewById(R.id.tvGender);
        tvDuration = view.findViewById(R.id.tvDuration);
        photo = view.findViewById(R.id.photo);
        tvSynopsis = view.findViewById(R.id.tvSynopsis);

        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvTitle.setText(film.getTitle());
        tvYear.setText(film.getYear());
        tvCountry.setText(film.getCountry());
        tvQualification.setText(film.getQualification());
        tvGender.setText(film.getGender());
        tvDuration.setText(film.getDuration());
        tvSynopsis.setText(film.getSynopsis());
        photo.setImageResource(film.getPhoto());
    }
}