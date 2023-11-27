package com.example.assignment2;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.company);
    }
    public void onDisplayOverview(View view){
        Intent intent = new Intent(this , OverviewActivity.class);
        intent.putExtra(OverviewActivity.CHOOSEN_COMPANY, String.valueOf(spinner.getSelectedItem()));
        startActivity(intent);
    }
    public void onDisplayDetails(View view){
        Intent intent = new Intent(this , DetailedInformationActivity.class);
        intent.putExtra(OverviewActivity.CHOOSEN_COMPANY, String.valueOf(spinner.getSelectedItem()));
        startActivity(intent);
    }
}
