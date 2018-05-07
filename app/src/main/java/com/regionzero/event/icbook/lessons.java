package com.regionzero.event.icbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class lessons extends AppCompatActivity {

    ScrollView myScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        myScroll = (ScrollView) findViewById(R.id.myview);

        TextView tv = (TextView) findViewById(R.id.txt_less_title);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/minecraft_rus.ttf");
        tv.setTypeface(face);
    }

    public  void onClickHeader(View view) {
        myScroll.scrollTo(0, 0);
    }


    public  void onClickLess0(View view) {
        Intent intent = new Intent(this, lesson_0.class);
        startActivity(intent);
    }
    public  void onClickLess1(View view) {
        Intent intent = new Intent(this, lesson_1.class);
        startActivity(intent);
    }
    public  void onClickLess2(View view) {
        Intent intent = new Intent(this, lesson_2.class);
        startActivity(intent);
    }
    public  void onClickLess3(View view) {
        Intent intent = new Intent(this, lesson_3.class);
        startActivity(intent);
    }
    public  void onClickLess4(View view) {
        Intent intent = new Intent(this, lesson_4.class);
        startActivity(intent);
    }
    public  void onClickLess5(View view) {
        Intent intent = new Intent(this, lesson_5.class);
        startActivity(intent);
    }
    public  void onClickLess6(View view) {
        Intent intent = new Intent(this, lesson_6.class);
        startActivity(intent);
    }
    public  void onClickLess7(View view) {
        Intent intent = new Intent(this, lesson_7.class);
        startActivity(intent);
    }
    public  void onClickLess8(View view) {
        Intent intent = new Intent(this, lesson_8.class);
        startActivity(intent);
    }
    public  void onClickLess9(View view) {
        Intent intent = new Intent(this, lesson_9.class);
        startActivity(intent);
    }
    public  void onClickLess10(View view) {
        Intent intent = new Intent(this, lesson_10.class);
        startActivity(intent);
    }
    public  void onClickLess11(View view) {
        Intent intent = new Intent(this, lesson_11.class);
        startActivity(intent);
    }
    public  void onClickLess12(View view) {
        Intent intent = new Intent(this, lesson_12.class);
        startActivity(intent);
    }
    public  void onClickLess13(View view) {
        Intent intent = new Intent(this, lesson_13.class);
        startActivity(intent);
    }
    public  void onClickLess14(View view) {
        Intent intent = new Intent(this, lesson_14.class);
        startActivity(intent);
    }
    public  void onClickLess15(View view) {
        Intent intent = new Intent(this, lesson_15.class);
        startActivity(intent);
    }

}
