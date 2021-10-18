package com.example.jualdagangan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView marque = (TextView) this.findViewById(R.id.sliding_text_marquee);
        marque.setSelected(true);
    }
    public void Next (View view){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}