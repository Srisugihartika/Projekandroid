package com.ssugihartika.projek.hijaiyah;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ssugihartika.projek.MainActivity;
import com.ssugihartika.projek.R;

public class HijaiyahActivity extends AppCompatActivity {


    private MediaPlayer player;
    ImageView TampilGambar;
    ImageButton show, hide, back, help;





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
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.adhod);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.atho);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.adzo);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.aain);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.aghin);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.afa);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.aqof);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.akaf);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.alam);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.amim);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.anun);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.awawu);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.ahaa);
//        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.alamalif);
//        ImageButton ButtonSuara29 = (ImageButton) this.findViewById(R.id.ahamzah);
        ImageButton ButtonSuara30 = (ImageButton) this.findViewById(R.id.aya);

        //menghidupkan suara
        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_a);
                TampilGambar.startAnimation(animScale);
                playSound(1);

            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ba);
                TampilGambar.startAnimation(animScale);
                playSound(2);

            }
        });
        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ta);
                TampilGambar.startAnimation(animScale);
                playSound(3);
            }
        });
        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_tsa);
                TampilGambar.startAnimation(animScale);
                playSound(4);
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_jim);
                TampilGambar.startAnimation(animScale);
                playSound(5);
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_kha);
                TampilGambar.startAnimation(animScale);
                playSound(6);
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_kho);
                TampilGambar.startAnimation(animScale);
                playSound(7);
            }
        });
        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_dal);
                TampilGambar.startAnimation(animScale);
                playSound(8);
            }
        });
        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_dzal);
                TampilGambar.startAnimation(animScale);
                playSound(9);
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ra);
                TampilGambar.startAnimation(animScale);
                playSound(10);
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_za);
                TampilGambar.startAnimation(animScale);
                playSound(11);
            }
        });
        ButtonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_sin);
                TampilGambar.startAnimation(animScale);
                playSound(12);
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_syin);
                TampilGambar.startAnimation(animScale);
                playSound(13);
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_shod);
                TampilGambar.startAnimation(animScale);
                playSound(14);
            }
        });
        ButtonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_dhod);
                TampilGambar.startAnimation(animScale);
                playSound(15);
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_tho);
                TampilGambar.startAnimation(animScale);
                playSound(16);
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_dzo);
                TampilGambar.startAnimation(animScale);
                playSound(17);
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ain1);
                TampilGambar.startAnimation(animScale);
                playSound(18);
            }
        });
        ButtonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ghoin);
                TampilGambar.startAnimation(animScale);
                playSound(19);
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_fa);
                TampilGambar.startAnimation(animScale);
                playSound(20);
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_qof);
                TampilGambar.startAnimation(animScale);
                playSound(21);
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_kaf);
                TampilGambar.startAnimation(animScale);
                playSound(22);
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_lam);
                TampilGambar.startAnimation(animScale);
                playSound(23);
            }
        });
        ButtonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_mim);
                TampilGambar.startAnimation(animScale);
                playSound(24);
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_nun);
                TampilGambar.startAnimation(animScale);
                playSound(25);
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_wawu);
                TampilGambar.startAnimation(animScale);
                playSound(26);
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ha1);
                TampilGambar.startAnimation(animScale);
                playSound(27);
            }
        });
//        ButtonSuara28.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TampilGambar.setImageResource(R.drawable.h_lamalif);
//                TampilGambar.startAnimation(animScale);
//                playSound(28);
//            }
//        });
//        ButtonSuara29.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TampilGambar.setImageResource(R.drawable.h_hamzah);
//                TampilGambar.startAnimation(animScale);
//                playSound(29);
//            }
//        });
        ButtonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TampilGambar.setImageResource(R.drawable.h_ya);
                TampilGambar.startAnimation(animScale);
                playSound(30);
            }
        });



        help = (ImageButton) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
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

    private void showDialog() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.popup_hijaiyah,null);

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
        try {
            super.onPause();
            player.pause();
        }catch (Exception e){

        }
    }

    private void playSound(int arg) {
        try {
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        } catch (Exception e) {

        }
        if (arg == 1) {
            //Toast.makeText(this, isPlaying + "Suara Alif", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.alif);
        }
        else if (arg == 2) {
            //Toast.makeText(this, isPlaying + "Suara Ba", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.ba);
        }else if (arg == 3) {
            player = MediaPlayer.create(this, R.raw.ta);
        }else if (arg == 4) {
            player = MediaPlayer.create(this, R.raw.tsa);
        }else if (arg == 5) {
            player = MediaPlayer.create(this, R.raw.jim);
        }else if (arg == 6) {
            player = MediaPlayer.create(this, R.raw.kha);
        }else if (arg == 7) {
            player = MediaPlayer.create(this, R.raw.kho);
        }else if (arg == 8) {
            player = MediaPlayer.create(this, R.raw.dal);
        }else if (arg == 9) {
            player = MediaPlayer.create(this, R.raw.dzal);
        }else if (arg == 10) {
            player = MediaPlayer.create(this, R.raw.ro);
        }else if (arg == 11) {
            player = MediaPlayer.create(this, R.raw.za);
        }else if (arg == 12) {
            player = MediaPlayer.create(this, R.raw.sya);
        }else if (arg == 13) {
            player = MediaPlayer.create(this, R.raw.syin);
        }else if (arg == 14) {
            player = MediaPlayer.create(this, R.raw.sho);
        }else if (arg == 15) {
            player = MediaPlayer.create(this, R.raw.dhod);
        }else if (arg == 16) {
            player = MediaPlayer.create(this, R.raw.tho);
        }else if (arg == 17) {
            player = MediaPlayer.create(this, R.raw.dzo);
        }else if (arg == 18) {
            player = MediaPlayer.create(this, R.raw.ain);
        }else if (arg == 19) {
            player = MediaPlayer.create(this, R.raw.gho);
        }else if (arg == 20) {
            player = MediaPlayer.create(this, R.raw.fa);
        }else if (arg == 21) {
            player = MediaPlayer.create(this, R.raw.qo);
        }else if (arg == 22) {
            player = MediaPlayer.create(this, R.raw.ka);
        }else if (arg == 23) {
            player = MediaPlayer.create(this, R.raw.lam);
        }else if (arg == 24) {
            player = MediaPlayer.create(this, R.raw.mim);
        }else if (arg == 25) {
            player = MediaPlayer.create(this, R.raw.na);
        }else if (arg == 26) {
            player = MediaPlayer.create(this, R.raw.wawu);
        }else if (arg == 27) {
            player = MediaPlayer.create(this, R.raw.ha);
        }else if (arg == 28) {
            //player = MediaPlayer.create(this, R.raw.lamalif);
        }else if (arg == 29) {
           // player = MediaPlayer.create(this, R.raw.hamzah);
        }else if (arg == 30) {
            player = MediaPlayer.create(this, R.raw.ya);
        }
        player.setLooping(false);
        player.start();
    }


}
