package com.example.jualdagangan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {
    private CardView btn1, btn2, btn3, btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ayam Goreng Sambel = Rp 15.000",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ayam Goreng Srundeng = Rp 20.000",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ayam Krispi = Rp 20.000",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ayam Geprek = Rp 17.000",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ayam Geprek Lumer = Rp 22.000",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Sayap Goreng = Rp 25.000",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}