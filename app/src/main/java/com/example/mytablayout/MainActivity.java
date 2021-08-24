package com.example.mytablayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Cartelera");

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Film> myFilms = new ArrayList<>();
        myFilms.add(new Film(getString(R.string.film1_title), getString(R.string.film1_year), getString(R.string.film1_country), getString(R.string.film1_gender), getString(R.string.film1_qualification), getString(R.string.film1_duration), getString(R.string.film1_synopsis), R.drawable.gozdilla));
        myFilms.add(new Film(getString(R.string.film2_title), getString(R.string.film2_year), getString(R.string.film2_country), getString(R.string.film2_gender), getString(R.string.film2_qualification), getString(R.string.film2_duration), getString(R.string.film2_synopsis), R.drawable.monster));
        myFilms.add(new Film(getString(R.string.film3_title), getString(R.string.film3_year), getString(R.string.film3_country), getString(R.string.film3_gender), getString(R.string.film3_qualification), getString(R.string.film3_duration), getString(R.string.film3_synopsis), R.drawable.nomaland));
        myFilms.add(new Film(getString(R.string.film4_title), getString(R.string.film4_year), getString(R.string.film4_country), getString(R.string.film4_gender), getString(R.string.film4_qualification), getString(R.string.film4_duration), getString(R.string.film4_synopsis), R.drawable.nacion));
        myFilms.add(new Film(getString(R.string.film5_title), getString(R.string.film5_year), getString(R.string.film5_country), getString(R.string.film5_gender), getString(R.string.film5_qualification), getString(R.string.film5_duration), getString(R.string.film5_synopsis), R.drawable.traidores));

        AdaptersFilms adaptersFilms = new AdaptersFilms(getSupportFragmentManager(), getLifecycle(), myFilms);
        ViewPager2 viewpager = findViewById(R.id.viewpager);

        viewpager.setAdapter(adaptersFilms);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout, viewpager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText("Sala " +  (position + 1));
            }
        });
        mediator.attach();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.go: {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }

        }
        return super.onOptionsItemSelected(item);
    }
}