package com.example.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;

public class electrico extends AppCompatActivity {

    Button LBrisasB, LBrisasR, LBrisasM, FarosB, FarosR, FarosM, LFrenoB, LFrenoR, LFrenoM,
            LInteriorB, LInteriorR, LInteriorM, InterB, InterR, InterM, DirecB, DirecR, DirecM,
            ClaxonB, ClaxonR, ClaxonM, RadioB, RadioR, RadioM, siguiente;
    EditText LBrisaObs, FarosObs, LFrenoObs, LInteriorObs, InterObs, DirecObs, ClaxonObs, RadioObs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrico);
        siguiente = findViewById(R.id.siguiente2);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        LBrisaObs = findViewById(R.id.LPObserv);
        FarosObs = findViewById(R.id.FarosObs);
        LFrenoObs = findViewById(R.id.LFrenoObs);
        LInteriorObs = findViewById(R.id.LInterioresObs);
        InterObs = findViewById(R.id.InterObs);
        DirecObs = findViewById(R.id.DirecObs);
        ClaxonObs = findViewById(R.id.ClaxonObs);
        RadioObs = findViewById(R.id.RadioObs);

        LBrisasB = findViewById(R.id.LPBtnB);
        LBrisasB.setOnClickListener(v -> {
            LBrisasColor(LBrisasB);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (LBrisaObs.getVisibility() == View.VISIBLE) {
                LBrisaObs.setAnimation(animation);
                LBrisaObs.setVisibility(View.GONE);
            }
            if (LBrisasB.isPressed()) {
                LBrisaObs.setEnabled(false);
            }
        });
        LBrisasR = findViewById(R.id.LPBtnR);
        LBrisasR.setOnClickListener(v -> {
            LBrisasColor(LBrisasR);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (LBrisaObs.getVisibility() == View.VISIBLE) {
                LBrisaObs.setAnimation(animation);
                LBrisaObs.setVisibility(View.GONE);
            }
            if (LBrisasR.isPressed()) {
                LBrisaObs.setEnabled(false);
            }
        });
        LBrisasM = findViewById(R.id.LPBtnM);
        LBrisasM.setOnClickListener(v -> {
            LBrisasColor(LBrisasM);
            Animation animation = new AlphaAnimation(0, 1);
            animation.setDuration(500);
            if (LBrisaObs.getVisibility() == View.GONE) {
                LBrisaObs.setAnimation(animation);
                LBrisaObs.setVisibility(View.VISIBLE);
            }
            if (LBrisasR.isPressed()) {
                LBrisaObs.setEnabled(true);
            }
        });
        FarosB = findViewById(R.id.FarosB);
        FarosB.setOnClickListener(v -> {
            FarosColor(FarosB);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (FarosObs.getVisibility() == View.VISIBLE) {
                FarosObs.setAnimation(animation);
                FarosObs.setVisibility(View.GONE);
            }
            if (FarosB.isPressed()) {
                FarosObs.setEnabled(false);
            }
        });
        FarosR = findViewById(R.id.FarosR);
        FarosR.setOnClickListener(v -> {
            FarosColor(FarosR);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (FarosObs.getVisibility() == View.VISIBLE) {
                FarosObs.setAnimation(animation);
                FarosObs.setVisibility(View.GONE);
            }
            if (FarosR.isPressed()) {
                FarosObs.setEnabled(false);
            }
        });
        FarosM = findViewById(R.id.FarosM);
        FarosM.setOnClickListener(v -> {
            FarosColor(FarosM);
            Animation animation = new AlphaAnimation(0, 1);
            animation.setDuration(500);
            if (FarosObs.getVisibility() == View.GONE) {
                FarosObs.setAnimation(animation);
                FarosObs.setVisibility(View.VISIBLE);
            }
            if (FarosR.isPressed()) {
                FarosObs.setEnabled(true);
            }
        });
        LFrenoB = findViewById(R.id.LFrenoB);
        LFrenoB.setOnClickListener(v -> {
            LFrenoColor(LFrenoB);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (LFrenoObs.getVisibility() == View.VISIBLE) {
                LFrenoObs.setAnimation(animation);
                LFrenoObs.setVisibility(View.GONE);
            }
            if (LFrenoB.isPressed()) {
                LFrenoObs.setEnabled(false);
            }
        });
        LFrenoR = findViewById(R.id.LFrenoR);
        LFrenoR.setOnClickListener(v -> {
            LFrenoColor(LFrenoR);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (LFrenoObs.getVisibility() == View.VISIBLE) {
                LFrenoObs.setAnimation(animation);
                LFrenoObs.setVisibility(View.GONE);
            }
            if (LFrenoR.isPressed()) {
                LFrenoObs.setEnabled(false);
            }
        });
        LFrenoM = findViewById(R.id.LFrenoM);
        LFrenoM.setOnClickListener(v -> {
            LFrenoColor(LFrenoM);
            Animation animation = new AlphaAnimation(0, 1);
            animation.setDuration(500);
            if (LFrenoObs.getVisibility() == View.GONE) {
                LFrenoObs.setAnimation(animation);
                LFrenoObs.setVisibility(View.VISIBLE);
            }
            if (LFrenoM.isPressed()) {
                LFrenoObs.setEnabled(true);
            }
        });
        LInteriorB = findViewById(R.id.LInterioresB);
        LInteriorB.setOnClickListener(v -> {
            LInteriorColor(LInteriorB);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (LInteriorObs.getVisibility() == View.VISIBLE) {
                LInteriorObs.setAnimation(animation);
                LInteriorObs.setVisibility(View.GONE);
            }
            if (LInteriorB.isPressed()) {
                LInteriorObs.setEnabled(false);
            }
        });
        LInteriorR = findViewById(R.id.LInterioresR);
        LInteriorR.setOnClickListener(v -> {
            LInteriorColor(LInteriorR);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (LInteriorObs.getVisibility() == View.VISIBLE) {
                LInteriorObs.setAnimation(animation);
                LInteriorObs.setVisibility(View.GONE);
            }
            if (LInteriorR.isPressed()) {
                LInteriorObs.setEnabled(false);
            }
        });
        LInteriorM = findViewById(R.id.LInterioresM);
        LInteriorM.setOnClickListener(v -> {
            LInteriorColor(LInteriorM);
            Animation animation = new AlphaAnimation(0, 1);
            animation.setDuration(500);
            if (LInteriorObs.getVisibility() == View.GONE) {
                LInteriorObs.setAnimation(animation);
                LInteriorObs.setVisibility(View.VISIBLE);
            }
            if (LInteriorM.isPressed()) {
                LInteriorObs.setEnabled(true);
            }
        });
        InterB = findViewById(R.id.InterB);
        InterB.setOnClickListener(v -> {
            InterColor(InterB);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (InterObs.getVisibility() == View.VISIBLE) {
                InterObs.setAnimation(animation);
                InterObs.setVisibility(View.GONE);
            }
            if (InterB.isPressed()) {
                InterObs.setEnabled(false);
            }
        });
        InterR = findViewById(R.id.InterR);
        InterR.setOnClickListener(v -> {
            InterColor(InterR);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (InterObs.getVisibility() == View.VISIBLE) {
                InterObs.setAnimation(animation);
                InterObs.setVisibility(View.GONE);
            }
            if (InterR.isPressed()) {
                InterObs.setEnabled(false);
            }
        });
        InterM = findViewById(R.id.InterM);
        InterM.setOnClickListener(v -> {
            InterColor(InterM);
            Animation animation = new AlphaAnimation(0, 1);
            animation.setDuration(500);
            if (InterObs.getVisibility() == View.GONE) {
                InterObs.setAnimation(animation);
                InterObs.setVisibility(View.VISIBLE);
            }
            if (InterM.isPressed()) {
                InterObs.setEnabled(true);
            }
        });
        DirecB = findViewById(R.id.DirecB);
        DirecB.setOnClickListener(v -> {
            DirecColor(DirecB);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (DirecObs.getVisibility() == View.VISIBLE) {
                DirecObs.setAnimation(animation);
                DirecObs.setVisibility(View.GONE);
            }
            if (DirecB.isPressed()) {
                DirecObs.setEnabled(false);
            }
        });
        DirecR = findViewById(R.id.DirecR);
        DirecR.setOnClickListener(v -> {
            DirecColor(DirecR);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (DirecObs.getVisibility() == View.VISIBLE) {
                DirecObs.setAnimation(animation);
                DirecObs.setVisibility(View.GONE);
            }
            if (DirecR.isPressed()) {
                DirecObs.setEnabled(false);
            }
        });
        DirecM = findViewById(R.id.DirecM);
        DirecM.setOnClickListener(v -> {
            DirecColor(DirecM);
            Animation animation = new AlphaAnimation(0, 1);
            animation.setDuration(500);
            if (DirecObs.getVisibility() == View.GONE) {
                DirecObs.setAnimation(animation);
                DirecObs.setVisibility(View.VISIBLE);
            }
            if (DirecM.isPressed()) {
                DirecObs.setEnabled(true);
            }
        });
        ClaxonB = findViewById(R.id.ClaxonB);
        ClaxonB.setOnClickListener(v -> {
            ClaxonColor(ClaxonB);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (ClaxonObs.getVisibility() == View.VISIBLE) {
                ClaxonObs.setAnimation(animation);
                ClaxonObs.setVisibility(View.GONE);
            }
            if (ClaxonB.isPressed()) {
                ClaxonObs.setEnabled(false);
            }
        });
        ClaxonR = findViewById(R.id.ClaxonR);
        ClaxonR.setOnClickListener(v -> {
            ClaxonColor(ClaxonR);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (ClaxonObs.getVisibility() == View.VISIBLE) {
                ClaxonObs.setAnimation(animation);
                ClaxonObs.setVisibility(View.GONE);
            }
            if (ClaxonR.isPressed()) {
                ClaxonObs.setEnabled(false);
            }
        });
        ClaxonM = findViewById(R.id.ClaxonM);
        ClaxonM.setOnClickListener(v -> {
            ClaxonColor(ClaxonM);
            Animation animation = new AlphaAnimation(0, 1);
            animation.setDuration(500);
            if (ClaxonObs.getVisibility() == View.GONE) {
                ClaxonObs.setAnimation(animation);
                ClaxonObs.setVisibility(View.VISIBLE);
            }
            if (ClaxonM.isPressed()) {
                ClaxonObs.setEnabled(true);
            }
        });
        RadioB = findViewById(R.id.RadioB);
        RadioB.setOnClickListener(v -> {
            RadioColor(RadioB);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (RadioObs.getVisibility() == View.VISIBLE) {
                RadioObs.setAnimation(animation);
                RadioObs.setVisibility(View.GONE);
            }
            if (RadioB.isPressed()) {
                RadioObs.setEnabled(false);
            }
        });
        RadioR = findViewById(R.id.RadioR);
        RadioR.setOnClickListener(v -> {
            RadioColor(RadioR);
            Animation animation = new AlphaAnimation(1, 0);
            animation.setDuration(500);
            if (RadioObs.getVisibility() == View.VISIBLE) {
                RadioObs.setAnimation(animation);
                RadioObs.setVisibility(View.GONE);
            }
            if (RadioR.isPressed()) {
                RadioObs.setEnabled(false);
            }
        });
        RadioM = findViewById(R.id.RadioM);
        RadioM.setOnClickListener(v -> {
            RadioColor(RadioM);
            Animation animation = new AlphaAnimation(0, 1);
            animation.setDuration(500);
            if (RadioObs.getVisibility() == View.GONE) {
                RadioObs.setAnimation(animation);
                RadioObs.setVisibility(View.VISIBLE);
            }
            if (RadioM.isPressed()) {
                RadioObs.setEnabled(true);
            }
        });
    }

    private void LBrisasColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        LBrisasB.setBackground(drawable);
        LBrisasR.setBackground(drawable);
        LBrisasM.setBackground(drawable);

        if (selectedButton == LBrisasB) {
            LBrisasB.setBackground(drawGreen);
        } else if (selectedButton == LBrisasR) {
            LBrisasR.setBackground(drawYellow);
        } else if (selectedButton == LBrisasM) {
            LBrisasM.setBackground(drawRed);
        }
    }

    private void FarosColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        FarosB.setBackground(drawable);
        FarosR.setBackground(drawable);
        FarosM.setBackground(drawable);

        if (selectedButton == FarosB) {
            FarosB.setBackground(drawGreen);
        } else if (selectedButton == FarosR) {
            FarosR.setBackground(drawYellow);
        } else if (selectedButton == FarosM) {
            FarosM.setBackground(drawRed);
        }
    }

    private void LFrenoColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        LFrenoB.setBackground(drawable);
        LFrenoR.setBackground(drawable);
        LFrenoM.setBackground(drawable);

        if (selectedButton == LFrenoB) {
            LFrenoB.setBackground(drawGreen);
        } else if (selectedButton == LFrenoR) {
            LFrenoR.setBackground(drawYellow);
        } else if (selectedButton == LFrenoM) {
            LFrenoM.setBackground(drawRed);
        }
    }

    private void LInteriorColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        LInteriorB.setBackground(drawable);
        LInteriorR.setBackground(drawable);
        LInteriorM.setBackground(drawable);

        if (selectedButton == LInteriorB) {
            LInteriorB.setBackground(drawGreen);
        } else if (selectedButton == LInteriorR) {
            LInteriorR.setBackground(drawYellow);
        } else if (selectedButton == LInteriorM) {
            LInteriorM.setBackground(drawRed);
        }
    }

    private void InterColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        InterB.setBackground(drawable);
        InterR.setBackground(drawable);
        InterM.setBackground(drawable);

        if (selectedButton == InterB) {
            InterB.setBackground(drawGreen);
        } else if (selectedButton == InterR) {
            InterR.setBackground(drawYellow);
        } else if (selectedButton == InterM) {
            InterM.setBackground(drawRed);
        }
    }

    private void DirecColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        DirecB.setBackground(drawable);
        DirecR.setBackground(drawable);
        DirecM.setBackground(drawable);

        if (selectedButton == DirecB) {
            DirecB.setBackground(drawGreen);
        } else if (selectedButton == DirecR) {
            DirecR.setBackground(drawYellow);
        } else if (selectedButton == DirecM) {
            DirecM.setBackground(drawRed);
        }
    }

    private void ClaxonColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        ClaxonB.setBackground(drawable);
        ClaxonR.setBackground(drawable);
        ClaxonM.setBackground(drawable);

        if (selectedButton == ClaxonB) {
            ClaxonB.setBackground(drawGreen);
        } else if (selectedButton == ClaxonR) {
            ClaxonR.setBackground(drawYellow);
        } else if (selectedButton == ClaxonM) {
            ClaxonM.setBackground(drawRed);
        }
    }

    private void RadioColor(Button selectedButton) {
        Drawable drawable = getResources().getDrawable(R.drawable.btn_colored);
        Drawable drawGreen = getResources().getDrawable(R.drawable.btn_green);
        Drawable drawYellow = getResources().getDrawable(R.drawable.btn_yellow);
        Drawable drawRed = getResources().getDrawable(R.drawable.btn_red);
        RadioB.setBackground(drawable);
        RadioR.setBackground(drawable);
        RadioM.setBackground(drawable);

        if (selectedButton == RadioB) {
            RadioB.setBackground(drawGreen);
        } else if (selectedButton == RadioR) {
            RadioR.setBackground(drawYellow);
        } else if (selectedButton == RadioM) {
            RadioM.setBackground(drawRed);
        }
    }

    public void B (View v){
        //Bueno

    };

    public void R (View v){
        //Regular

    };

    public void M (View v){
        //Malo

    }

}