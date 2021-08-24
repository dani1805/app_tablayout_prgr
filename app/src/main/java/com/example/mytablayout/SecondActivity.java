package com.example.mytablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TabLayout tabLayout = findViewById(R.id.tabLayoutTwo);
        Toolbar toolbar = findViewById(R.id.toolbarTwo);
        setSupportActionBar(toolbar);

        navigateToFragment(R.id.cinema);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                navigateToFragment(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void navigateToFragment(int position) {
        Fragment fragment;
        String title = "Próximos estrenos";

        switch (position) {
            default:
                title = "Próximos estrenos";
                fragment = new FragmentCinema();
                break;
            case 1:
                title = "Contacto";
                fragment = new FragmentContact();
                break;
            case 2:
                title = "Información";
                fragment = new FragmentWebView();
                break;
        }

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.frameLayout, fragment);
        transaction.commit();

        setTitle(title);

    }
}