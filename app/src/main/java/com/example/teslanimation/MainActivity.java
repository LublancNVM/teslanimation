package com.example.teslanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable logoanimb;
    AnimationDrawable logoanimt;
    AnimationDrawable logoanimm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);

        final Animation animation_bottom = AnimationUtils.loadAnimation(this, R.anim.animation_bottom);
        animation_bottom.setDuration(2000);

        final Animation animation_top = AnimationUtils.loadAnimation(this, R.anim.animation_top);
        animation_top.setDuration(2000);

        final ImageView bottom = (ImageView) findViewById(R.id.bottom);
        bottom.setBackgroundResource(R.drawable.transfor);
        logoanimb = (AnimationDrawable) bottom.getBackground();

        final ImageView top = (ImageView) findViewById(R.id.top);
        top.setBackgroundResource(R.drawable.transfor);
        logoanimt = (AnimationDrawable) top.getBackground();

        final ImageView middle = (ImageView) findViewById(R.id.middle);
        middle.setBackgroundResource(R.drawable.transfor);
        logoanimm = (AnimationDrawable) middle.getBackground();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logoanimm.start();
                logoanimt.start();
                logoanimb.start();
                bottom.startAnimation(animation_bottom);
                top.startAnimation(animation_top);
            }
        });
    }
}
