package com.example.mytablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class AdaptersFilms extends FragmentStateAdapter {

    ArrayList<Film> films;

    public AdaptersFilms(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public AdaptersFilms(@NonNull Fragment fragment) {
        super(fragment);
    }

    public AdaptersFilms(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, ArrayList<Film> films) {
        super(fragmentManager, lifecycle);
        this.films = films;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Film film = films.get(position);
        FragmentFilms fragment = FragmentFilms.newInstance(film, position);
        return fragment;

    }

    @Override
    public int getItemCount() {
        return films.size();
    }
}
