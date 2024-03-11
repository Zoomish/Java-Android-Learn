package com.example.javalearn;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HelloDroidActivity extends AppCompatActivity {

    private TextView message;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanseState) {
        super.onCreate(savedInstanseState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.clickCounter);
        ImageView droid = findViewById(R.id.droidImage);

        droid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v) {
                tapDroid();
            }
        });
    }

    private void tapDroid() {
        counter++;
        String countAsText;

    }
}