package com.example.readmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailArtikel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_artikel);

        ImageButton commentBtn = findViewById(R.id.commentBtn);

        // Menambahkan onClickListener pada shareBtn
        commentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka CommentActivity
                Intent intent = new Intent(DetailArtikel.this, Comment.class);
                startActivity(intent);  // Memulai aktivitas baru
            }
        });
    }
}