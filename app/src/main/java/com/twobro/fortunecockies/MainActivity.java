package com.twobro.fortunecockies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    // КНОПКА ОТКРЫТИЯ ПРЕДСКАЗАНИЯ
    public void openCockie (View view){
        String predscazanie="You must try, or hate yourself for not trying.";

        ImageView imgv1 = (ImageView) findViewById(R.id.cockie_Image);// Выключаем видимость картинки печенья
        imgv1.setVisibility(view.INVISIBLE);


        TextView predskazanie = (TextView) findViewById(R.id.Cockie);// Включаем видимость предсказания
        predskazanie.setVisibility(view.VISIBLE);



        display(predscazanie);

    }

    private void display(String predscazanie) {
        TextView quantityTextView = findViewById(R.id.Cockie);
        quantityTextView.setText(predscazanie);
    }
}