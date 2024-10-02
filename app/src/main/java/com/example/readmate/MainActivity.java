package com.example.readmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton shareBtn = findViewById(R.id.shareBtn);
        CardView trendingCardView = findViewById(R.id.beritaTrending);

        // Menambahkan onClickListener pada shareBtn
        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka CommentActivity
                Intent intent = new Intent(MainActivity.this, Comment.class);
                startActivity(intent);  // Memulai aktivitas baru
            }
        });


        trendingCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke DetailActivity
                Intent intent = new Intent(MainActivity.this, DetailArtikel.class);
                startActivity(intent);
            }
        });
    }
}