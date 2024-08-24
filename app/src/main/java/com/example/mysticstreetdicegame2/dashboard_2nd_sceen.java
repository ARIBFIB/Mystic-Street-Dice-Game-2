package com.example.mysticstreetdicegame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class dashboard_2nd_sceen extends AppCompatActivity {

    TextView caldicePool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2nd_sceen);

        caldicePool = findViewById(R.id.caldicePool);

        caldicePool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard_2nd_sceen.this, all_menu_notations.class);
                startActivity(intent);
            }
        });


    }
}