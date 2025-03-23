package com.example.loginapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView headerText = findViewById(R.id.header_text);
        TextView nameText = findViewById(R.id.name_text);
        TextView npmText = findViewById(R.id.npm_text);
        TextView footerText = findViewById(R.id.footer_text);


        headerText.setText("Data Mahasiswa");
        nameText.setText("Nama: Agglyra Paseru");
        npmText.setText("NPM: 22 411 073");
        footerText.setText("Mobile Computing");
    }
}
