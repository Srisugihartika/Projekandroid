package com.ssugihartika.projek;

import android.content.Intent;
import android.media.ImageWriter;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class HijaiyahActivity extends AppCompatActivity {

    ImageView TampilGambar;
    ImageButton show, hide, back, help;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_hijaiyah);
        show = (ImageButton) findViewById(R.id.aalif);
        hide = (ImageButton) findViewById(R.id.aba);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        //Untuk menambah button suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.alif);//memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);
        final MediaPlayer SuaraTsa = MediaPlayer.create(this, R.raw.tsa );
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.jim );
        final MediaPlayer SuaraKha = MediaPlayer.create(this, R.raw.kha );
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kho );
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.dal );
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dza );
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.ro );
        final MediaPlayer SuaraZa = MediaPlayer.create(this, R.raw.za );
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.sa );
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.sya );
        final MediaPlayer SuaraShod = MediaPlayer.create(this, R.raw.sho );
        //final MediaPlayer SuaraDhod = MediaPlayer.create(this, R.raw.dho );
        //final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.sho );
       // final MediaPlayer SuaraGhoin = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraFa = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraQof = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraLamalif = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraHamzah = MediaPlayer.create(this, R.raw.sho );
//        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.sho );



        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.aalif); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.aba);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.ata);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.atsa);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.ajim);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.akha);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.akho);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.adal);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.adzal);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.ara);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.aza);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.asin);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.asyin);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.ashod);

        //menghidupkan suara
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_a);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
                SuaraAlif.pause();
            }
        });
        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ba);
                TampilGambar.startAnimation(animScale);
                SuaraBa.isLooping();
                SuaraBa.start();

            }
        });
        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ta);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
                SuaraTa.stop();
            }
        });
        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_tsa);
                TampilGambar.startAnimation(animScale);
                SuaraTsa.isPlaying();
                SuaraTsa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_jim);
                TampilGambar.startAnimation(animScale);

                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_kha);
                TampilGambar.startAnimation(animScale);
                SuaraKha.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_kho);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });
        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_dal);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });
        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_dzal);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ra);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_za);
                TampilGambar.startAnimation(animScale);
                SuaraZa.start();
            }
        });
        ButtonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_sin);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_syin);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_shod);
                TampilGambar.startAnimation(animScale);
                SuaraShod.start();
            }
        });


        help = (ImageButton) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast,
                        (ViewGroup) findViewById(R.id.custom_toast_container));

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText("\"Klik gambar alif ankan memuncukan gambar penjelasan\"");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });

        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HijaiyahActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
