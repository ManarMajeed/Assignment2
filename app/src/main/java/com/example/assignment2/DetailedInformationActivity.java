package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class DetailedInformationActivity extends AppCompatActivity {
    public static final String CHOOSEN_COMPANY = "company";
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_information);
        TextView text = findViewById(R.id.text);
        TextView textUrl = findViewById(R.id.url);
        intent = getIntent();
        if (intent.getStringExtra(CHOOSEN_COMPANY).equals("Aramco")) {
            text.setText(getResources().getString(R.string.reasonAramco));
            textUrl.setText("https://www.aramco.com/en/");
            textUrl.setPaintFlags(textUrl.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        } else {
            text.setText(getResources().getString(R.string.reasonSdaia));
            textUrl.setText("https://sdaia.gov.sa/");
            textUrl.setPaintFlags(textUrl.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        }
    }
    public void onClick(View view){
        if (intent.getStringExtra(CHOOSEN_COMPANY).equals("Aramco")){
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.aramco.com/en/"));
            startActivity(i);
        }else{
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://sdaia.gov.sa/"));
            startActivity(i);
        }
    }
}

