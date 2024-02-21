package com.example.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;

public class VidriosActivity extends AppCompatActivity {

    Button LPBtnB, LPBtnR, LPBtnM, MedB, MedR, MedM, ELBtnB, ELBtnR, ELBtnM, VLBtnB, VLBtnR, VLBtnM, siguiente;
    EditText LPObserv, MedObserv, ELObserv, VLObserv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidrios);
        LPBtnB = findViewById(R.id.LPBtnB);
        LPBtnR = findViewById(R.id.LPBtnR);
        LPBtnM = findViewById(R.id.LPBtnM);
        LPObserv = findViewById(R.id.LPObserv);
        MedB = findViewById(R.id.MedB);
        MedR = findViewById(R.id.MedR);
        MedM = findViewById(R.id.MedM);
        MedObserv= findViewById(R.id.MedObserv);
        ELBtnB = findViewById(R.id.ELBtnB);
        ELBtnR = findViewById(R.id.ELBtnR);
        ELBtnM = findViewById(R.id.ELBtnM);
        ELObserv = findViewById(R.id.ELObserv);
        VLBtnB = findViewById(R.id.VLBtnB);
        VLBtnR = findViewById(R.id.VLBtnR);
        VLBtnM = findViewById(R.id.VLBtnM);
        VLObserv = findViewById(R.id.VLObserv);

        LPBtnB.setOnClickListener(v -> {
            LPchangeColor(LPBtnB);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (LPObserv.getVisibility() == View.VISIBLE) {
                LPObserv.setAnimation(fadeInOut);
                LPObserv.setVisibility(View.GONE);
            }
        });

        LPBtnR.setOnClickListener(v -> {
            LPchangeColor(LPBtnR);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (LPObserv.getVisibility() == View.VISIBLE) {
                LPObserv.setAnimation(fadeInOut);
                LPObserv.setVisibility(View.GONE);
            }
        });

        LPBtnM.setOnClickListener(v -> {
            LPchangeColor(LPBtnM);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (LPObserv.getVisibility() == View.GONE) {
                LPObserv.setAnimation(fadeInOut);
                LPObserv.setVisibility(View.VISIBLE);
            }
        });

        MedB.setOnClickListener(v -> {
            MedchangeColor(MedB);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (MedObserv.getVisibility() == View.VISIBLE) {
                MedObserv.setAnimation(fadeInOut);
                MedObserv.setVisibility(View.GONE);
            }
        });

        MedR.setOnClickListener(v -> {
            MedchangeColor(MedR);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (MedObserv.getVisibility() == View.VISIBLE) {
                MedObserv.setAnimation(fadeInOut);
                MedObserv.setVisibility(View.GONE);
            }
        });

        MedM.setOnClickListener(v -> {
            MedchangeColor(MedM);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (MedObserv.getVisibility() == View.GONE) {
                MedObserv.setAnimation(fadeInOut);
                MedObserv.setVisibility(View.VISIBLE);
            }
        });

        ELBtnB.setOnClickListener(v -> {
            ELchangeColor(ELBtnB);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (ELObserv.getVisibility() == View.VISIBLE) {
                ELObserv.setAnimation(fadeInOut);
                ELObserv.setVisibility(View.GONE);
            }
        });

        ELBtnR.setOnClickListener(v -> {
            ELchangeColor(ELBtnR);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (ELObserv.getVisibility() == View.VISIBLE) {
                ELObserv.setAnimation(fadeInOut);
                ELObserv.setVisibility(View.GONE);
            }
        });

        ELBtnM.setOnClickListener(v -> {
            ELchangeColor(ELBtnM);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (ELObserv.getVisibility() == View.GONE) {
                ELObserv.setAnimation(fadeInOut);
                ELObserv.setVisibility(View.VISIBLE);
            }
        });

        VLBtnB.setOnClickListener(v -> {
            VLchangeColor(VLBtnB);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (VLObserv.getVisibility() == View.VISIBLE) {
                VLObserv.setAnimation(fadeInOut);
                VLObserv.setVisibility(View.GONE);
            }
        });

        VLBtnR.setOnClickListener(v -> {
            VLchangeColor(VLBtnR);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (VLObserv.getVisibility() == View.VISIBLE) {
                VLObserv.setAnimation(fadeInOut);
                VLObserv.setVisibility(View.GONE);
            }
        });

        VLBtnM.setOnClickListener(v -> {
            VLchangeColor(VLBtnM);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (VLObserv.getVisibility() == View.GONE) {
                VLObserv.setAnimation(fadeInOut);
                VLObserv.setVisibility(View.VISIBLE);
            }
        });
    }

    private void LPchangeColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        LPBtnB.setBackground(drawable);
        LPBtnR.setBackground(drawable);
        LPBtnM.setBackground(drawable);

        if (selectedButton == LPBtnB) {
            LPBtnB.setBackground(drawGreen);
        } else if (selectedButton == LPBtnR) {
            LPBtnR.setBackground(drawYellow);
        } else if (selectedButton == LPBtnM) {
            LPBtnM.setBackground(drawRed);
        }
    }

    private void MedchangeColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        MedB.setBackground(drawable);
        MedR.setBackground(drawable);
        MedM.setBackground(drawable);

        if (selectedButton == MedB) {
            MedB.setBackground(drawGreen);
        } else if (selectedButton == MedR) {
            MedR.setBackground(drawYellow);
        } else if (selectedButton == MedM) {
            MedM.setBackground(drawRed);
        }
    }

    private void ELchangeColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        ELBtnB.setBackground(drawable);
        ELBtnR.setBackground(drawable);
        ELBtnM.setBackground(drawable);

        if (selectedButton == ELBtnB) {
            ELBtnR.setBackground(drawGreen);
        } else if (selectedButton == ELBtnR) {
            ELBtnR.setBackground(drawYellow);
        } else if (selectedButton == ELBtnM) {
            ELBtnM.setBackground(drawRed);
        }
    }

    private void VLchangeColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        VLBtnM.setBackground(drawable);
        VLBtnR.setBackground(drawable);
        VLBtnM.setBackground(drawable);

        if (selectedButton == VLBtnB) {
            VLBtnB.setBackground(drawGreen);
        } else if (selectedButton == VLBtnR) {
            VLBtnR.setBackground(drawYellow);
        } else if (selectedButton == VLBtnM) {
            VLBtnM.setBackground(drawRed);
        }
    }
}