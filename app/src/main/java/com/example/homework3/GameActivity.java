package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView imImage;
    Button btn1, btn2, btn3;
    Button btnOne, btnTwo, btnThree;
    boolean isAdele, isLanaDelRay, isOliviaRodrigo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        initialization();
        listeners();
    }


    private void initialization() {

        imImage = findViewById(R.id.im_image);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                imImage.setImageResource(R.drawable.lana);
                isLanaDelRay = true;
                isAdele = false;
                isOliviaRodrigo = false;
                break;
            case R.id.btn_2:
                imImage.setImageResource(R.drawable.olivia);
                isAdele = false;
                isOliviaRodrigo = true;
                isLanaDelRay = false;
                break;
            case R.id.btn_3:
                imImage.setImageResource(R.drawable.adele);
                isOliviaRodrigo = false;
                isLanaDelRay = false;
                isAdele = true;
                break;
        }
    }

    private void listeners() {
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view
            ) {
                if (isAdele) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view
            ) {
                if (isLanaDelRay) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                }


            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view
            ) {
                if (isOliviaRodrigo) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
