package com.ssugihartika.projek;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.ImageButton;

import com.ssugihartika.projek.hijaiyah.HijaiyahActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton hijaiyah, tajwid,  tentang, keluar;

    MediaPlayer mp, mpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mp = MediaPlayer.create(MainActivity.this, R.raw.opening);
        mp.setLooping(true);
        mp.start();
        mp.setVolume(50, 50);

        //final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);

        hijaiyah = (ImageButton) findViewById(R.id.btnhijaiyah);
        tajwid = (ImageButton) findViewById(R.id.btntajwid);
        keluar = (ImageButton) findViewById(R.id.btnexit);
        
        hijaiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, HijaiyahActivity.class);
                startActivity(i);
                // suaraButton.start();
                //mp.stop();
            }
        });
        startbtnhijaiyahAnimation();
    }

    private void startbtnhijaiyahAnimation() {
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(hijaiyah, "scaleY", 0.8f);
        scaleY.setDuration(200);
        ObjectAnimator scaleYBack = ObjectAnimator.ofFloat(hijaiyah, "scaleY", 1f);
        scaleYBack.setDuration(500);
        scaleYBack.setInterpolator(new BounceInterpolator());
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(1000);
        animatorSet.playSequentially(scaleY, scaleYBack);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                animatorSet.setStartDelay(2000);
                animatorSet.start();
            }
        });
        hijaiyah.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        animatorSet.start();
        
        tajwid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });
        startbtntajwidAnimation();
    }

    private void startbtntajwidAnimation() {
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(tajwid, "scaleY", 0.8f);
        scaleY.setDuration(200);
        ObjectAnimator scaleYBack = ObjectAnimator.ofFloat(tajwid, "scaleY", 1f);
        scaleYBack.setDuration(500);
        scaleYBack.setInterpolator(new BounceInterpolator());
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(1000);
        animatorSet.playSequentially(scaleY, scaleYBack);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                animatorSet.setStartDelay(2000);
                animatorSet.start();
            }
        });
        tajwid.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        animatorSet.start();

        ImageButton showDialogButton = findViewById(R.id.btnabout);
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

    keluar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(0);
            finish();
        }
    });

    }



    private void showDialog() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.popup_about,null);

        Button cancelButton= view.findViewById(R.id.cancelButton1);

        final AlertDialog alertDialog = new AlertDialog.Builder(this).setView(view).create();

        alertDialog.show();

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.release();
        finish();
    }
    @Override
    public boolean onKeyDown ( int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_MEDIA_CLOSE) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}