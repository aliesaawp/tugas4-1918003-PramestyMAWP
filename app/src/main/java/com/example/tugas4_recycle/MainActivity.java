package com.example.tugas4_recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;

    String s1[], s2[];
    int images[] = {R.drawable.frozenii,R.drawable.gonjiam,R.drawable.jirisan,R.drawable.leverage,
            R.drawable.squid};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.film);
        s2 = getResources().getStringArray(R.array.deskripsi);

        FilmAdapter appAdapter = new FilmAdapter(this,s1,s2,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
