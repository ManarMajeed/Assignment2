package com.example.assignment2;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OverviewActivity extends AppCompatActivity {
    public static final String CHOOSEN_COMPANY = "company";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        TextView text = findViewById(R.id.overview);
        ImageView image = findViewById(R.id.logo);
        Intent intent = getIntent();
        if (intent.getStringExtra(CHOOSEN_COMPANY).equals("Aramco")){
            image.setImageResource(R.drawable.aramcologo);
            text.setText(getResources().getString(R.string.overviewAramco));
        }else{
            image.setImageResource(R.drawable.sdaia);
            text.setText(getResources().getString(R.string.overviewSdaia));
        }
    }
}