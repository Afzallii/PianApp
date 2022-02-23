package com.example.mypiano;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    View d1,d2,d3,d4,d5,d6,d7,d8;
    View t1,t2,t3,t4,t5,t6,t7,t8,t9;
    ImageButton bSetting,bPlay,bRecord,bExit,bStop;
    Switch adSwitch;
    private MediaPlayer md1,md2,md3,md4,md5,md6,md7,md8;
    private MediaPlayer mt1,mt2,mt3,mt4,mt5,mt6,mt7,mt8,mt9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adSwitch=findViewById(R.id.adSwitch);
        bSetting=findViewById(R.id.bSetting);
        bPlay=findViewById(R.id.bPlay);
        bRecord=findViewById(R.id.bRecord);
        bExit=findViewById(R.id.bExit);
        bStop=findViewById(R.id.bStop);

        d1=findViewById(R.id.d1);
        d2=findViewById(R.id.d2);
        d3=findViewById(R.id.d3);
        d4=findViewById(R.id.d4);
        d5=findViewById(R.id.d5);
        d6=findViewById(R.id.d6);
        d7=findViewById(R.id.d7);
        d8=findViewById(R.id.d8);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        t9=findViewById(R.id.t9);

        md1=MediaPlayer.create(this,R.raw.k1);
        md2=MediaPlayer.create(this,R.raw.key03);
        md3=MediaPlayer.create(this,R.raw.key04);
        md4=MediaPlayer.create(this,R.raw.key05);
        md5=MediaPlayer.create(this,R.raw.key06);
        md6=MediaPlayer.create(this,R.raw.key07);
        md7=MediaPlayer.create(this,R.raw.key08);
        md8=MediaPlayer.create(this,R.raw.key09);
        mt1=MediaPlayer.create(this,R.raw.key10);
        mt2=MediaPlayer.create(this,R.raw.key11);
        mt3=MediaPlayer.create(this,R.raw.key12);
        mt4=MediaPlayer.create(this,R.raw.key13);
        mt5=MediaPlayer.create(this,R.raw.key14);
        mt6=MediaPlayer.create(this,R.raw.key15);
        mt7=MediaPlayer.create(this,R.raw.key16);
        mt8=MediaPlayer.create(this,R.raw.key17);
        mt9=MediaPlayer.create(this,R.raw.key18);

        d1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                md1.start();
                d1.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d1.setBackgroundColor(getColor(R.color.returned));
                    }
                }.start();
                return false;
            }
        });
        d2.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                md2.start();
                d2.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d2.setBackgroundColor(getColor(R.color.returned));
                    }
                }.start();
                return false;
            }
        });
        d3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                md3.start();
                d3.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d3.setBackgroundColor(getColor(R.color.returned));
                    }
                }.start();
                return false;
            }
        });
        d4.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                md4.start();
                d4.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d4.setBackgroundColor(getColor(R.color.returned));
                    }
                }.start();
                return false;
            }
        });
        d5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                md5.start();
                d5.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d5.setBackgroundColor(getColor(R.color.returned));
                    }
                }.start();
                return false;
            }
        });
        d6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                md6.start();
                d6.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d6.setBackgroundColor(getColor(R.color.returned));
                    }
                }.start();
                return false;
            }
        });
        d7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                md7.start();
                d7.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d7.setBackgroundColor(getColor(R.color.returned));
                    }
                }.start();
                return false;
            }
        });
        d8.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                md8.start();
                d8.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d8.setBackgroundColor(getColor(R.color.returned));
                    }
                }.start();
                return false;
            }
        });
        t1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt1.start();
                d1.setEnabled(false);
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d1.setEnabled(true);
                    }
                }.start();
                return false;
            }
        });
        t2.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt2.start();
                d2.setEnabled(false);
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d2.setEnabled(true);
                    }
                }.start();
                return false;
            }
        });
        t3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt3.start();
                d3.setEnabled(false);
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d3.setEnabled(true);
                    }
                }.start();
                return false;
            }
        });
        t4.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt4.start();
                d4.setEnabled(false);
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {d4.setEnabled(true);
                    }
                }.start();
                return false;
            }
        });
        t5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt5.start();
                d5.setEnabled(false);
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d5.setEnabled(true);
                    }
                }.start();
                return false;
            }
        });
        t6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt6.start();
                d6.setEnabled(false);
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d6.setEnabled(true);
                    }
                }.start();
                return false;
            }
        });
        t7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt7.start();
                d7.setEnabled(false);
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d7.setEnabled(true);
                    }
                }.start();
                return false;
            }
        });
        t8.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt8.start();
                d8.setEnabled(false);
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                        d8.setEnabled(true);
                    }
                }.start();
                return false;
            }
        });
        t9.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt9.start();
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                    }
                }.start();
                return false;
            }
        });
        t1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("New API")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mt1.start();
                new CountDownTimer(1*100,100){
                    @Override
                    public void onTick(long millisUntilFinished){
                        String.valueOf(millisUntilFinished/100);
                    }
                    @SuppressLint("New API")
                    @Override
                    public void onFinish() {
                    }
                }.start();
                return false;
            }
        });







    }
}