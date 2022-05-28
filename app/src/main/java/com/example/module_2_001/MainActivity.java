package com.example.module_2_001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView= findViewById(R.id.textView2);
    }

    public void doSomething(View view) {
        myTextView.setText("Add New Text");
        Toast.makeText(this, "Toast msg to user", Toast.LENGTH_SHORT).show();

    }
}