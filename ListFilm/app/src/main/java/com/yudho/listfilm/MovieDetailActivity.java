package com.example.genshinweapons;

import android.content.res.TypedArray;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieDetailActivity extends AppCompatActivity {

    String title, status, user_score, runtime, language, overview;
    int path;

    public static final String EXTRA_MOVIE = "test_extra_movie";

    TextView tViewTitle, tViewStatus, tViewUserScore,
            textViewRuntime, tViewLanguage, tViewOverview;

    ImageView imagePoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        tViewTitle = findViewById(R.id.txt_title);
        tViewStatus = findViewById(R.id.txt_status);
        tViewUserScore = findViewById(R.id.txt_user_score);
        textViewRuntime = findViewById(R.id.txt_runtime);
        tViewLanguage = findViewById(R.id.txt_language);
        tViewOverview = findViewById(R.id.txt_overview);
        imagePoster = findViewById(R.id.img_poster);

        ArrayList<Movies> movie = this.getIntent().getParcelableArrayListExtra(EXTRA_MOVIE);

        title = movie.get(0).getTitle();
        tViewTitle.setText(title);

        status = movie.get(0).getStatus();
        tViewStatus.setText(status);

        user_score = movie.get(0).getUser_score();
        tViewUserScore.setText(user_score);


        runtime = movie.get(0).getRuntime();
        textViewRuntime.setText(runtime);

        language = movie.get(0).getOriginal_language();
        tViewLanguage.setText(language);

        overview = movie.get(0).getOverview();
        tViewOverview.setText(overview);

        path = movie.get(0).getPoster();
        imagePoster.setImageResource(path);

    }
}
