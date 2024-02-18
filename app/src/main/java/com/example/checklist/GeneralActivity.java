package com.example.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;

public class GeneralActivity extends AppCompatActivity {

    Button PieBueno, PieRegular, PieMalo, ManoBueno, ManoRegular, ManoMalo, SegBueno, SegRegular, SegMalo, ExtBueno, ExtRegular, ExtMalo,
            GatoBueno, GatoRegular, GatoMalo, RefBueno, RefRegular, RefMalo, SusBueno, SusRegular, SusMalo, EscBueno, EscRegular, EscMalo,
            TapiBueno, TapiRegular, TapiMalo, LimpBueno, LimpRegular, LimpMalo, siguiente;
    EditText PieObserv, ManoObserv, SegObserv, ExtObserv, GatoObserv, RefObserv, SusObserv, EscObserv, TapiObserv, LimpObserv;

    public void B (View v){
        //Bueno

    };

    public void R (View v){
        //Regular

    };

    public void M (View v){
        //Malo

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        siguiente = findViewById(R.id.siguiente);
        PieObserv = findViewById(R.id.PieObserv);
        ManoObserv = findViewById(R.id.ManoObserv);
        SegObserv = findViewById(R.id.SegObserv);
        ExtObserv = findViewById(R.id.ExtObserv);
        GatoObserv = findViewById(R.id.GatoObserv);
        RefObserv = findViewById(R.id.RefObserv);
        SusObserv = findViewById(R.id.SuspObserv);
        EscObserv = findViewById(R.id.EscObserv);
        TapiObserv = findViewById(R.id.TapiObserv);
        LimpObserv = findViewById(R.id.LimpObserv);

        siguiente.setOnClickListener(v -> {

        });

        PieBueno = findViewById(R.id.PieBueno);
        PieBueno.setOnClickListener(v -> {
            PiechangeColor(PieBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (PieObserv.getVisibility() == View.VISIBLE) {
                PieObserv.setAnimation(fadeInOut);
                PieObserv.setVisibility(View.GONE);
            }
        });
        PieRegular = findViewById(R.id.PieRegular);
        PieRegular.setOnClickListener(v -> {
            PiechangeColor(PieRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (PieObserv.getVisibility() == View.VISIBLE) {
                PieObserv.setAnimation(fadeInOut);
                PieObserv.setVisibility(View.GONE);
            }
        });
        PieMalo = findViewById(R.id.PieMalo);
        PieMalo.setOnClickListener(v -> {
            PiechangeColor(PieMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (PieObserv.getVisibility() == View.GONE) {
                PieObserv.startAnimation(fadeInOut);
                PieObserv.setVisibility(View.VISIBLE);
            }
        });

        ManoBueno = findViewById(R.id.ManoBueno);
        ManoBueno.setOnClickListener(v -> {
            ManochangeColor(ManoBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (ManoObserv.getVisibility() == View.VISIBLE) {
                ManoObserv.startAnimation(fadeInOut);
                ManoObserv.setVisibility(View.GONE);
            }
        });
        ManoRegular = findViewById(R.id.ManoRegular);
        ManoRegular.setOnClickListener(v -> {
            ManochangeColor(ManoRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (ManoObserv.getVisibility() == View.VISIBLE) {
                ManoObserv.startAnimation(fadeInOut);
                ManoObserv.setVisibility(View.GONE);
            }
        });
        ManoMalo = findViewById(R.id.ManoMalo);
        ManoMalo.setOnClickListener(v -> {
            ManochangeColor(ManoMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (ManoObserv.getVisibility() == View.GONE) {
                ManoObserv.startAnimation(fadeInOut);
                ManoObserv.setVisibility(View.VISIBLE);
            }
        });

        SegBueno = findViewById(R.id.SegBueno);
        SegBueno.setOnClickListener(v -> {
            SegchangeColor(SegBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (SegObserv.getVisibility() == View.VISIBLE) {
                SegObserv.startAnimation(fadeInOut);
                SegObserv.setVisibility(View.GONE);
            }
        });
        SegRegular = findViewById(R.id.SegRegular);
        SegRegular.setOnClickListener(v -> {
            SegchangeColor(SegRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (SegObserv.getVisibility() == View.VISIBLE) {
                SegObserv.startAnimation(fadeInOut);
                SegObserv.setVisibility(View.GONE);
            }
        });
        SegMalo = findViewById(R.id.SegMalo);
        SegMalo.setOnClickListener(v -> {
            SegchangeColor(SegMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (SegObserv.getVisibility() == View.GONE) {
                SegObserv.startAnimation(fadeInOut);
                SegObserv.setVisibility(View.VISIBLE);
            }
        });

        ExtBueno = findViewById(R.id.ExtBueno);
        ExtBueno.setOnClickListener(v -> {
            ExtchangeColor(ExtBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (ExtObserv.getVisibility() == View.VISIBLE) {
                ExtObserv.startAnimation(fadeInOut);
                ExtObserv.setVisibility(View.GONE);
            }
        });
        ExtRegular = findViewById(R.id.ExtRegular);
        ExtRegular.setOnClickListener(v -> {
            ExtchangeColor(ExtRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (ExtObserv.getVisibility() == View.VISIBLE) {
                ExtObserv.startAnimation(fadeInOut);
                ExtObserv.setVisibility(View.GONE);
            }
        });
        ExtMalo = findViewById(R.id.ExtMalo);
        ExtMalo.setOnClickListener(v -> {
            ExtchangeColor(ExtMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (ExtObserv.getVisibility() == View.GONE) {
                ExtObserv.startAnimation(fadeInOut);
                ExtObserv.setVisibility(View.VISIBLE);
            }
        });

        GatoBueno = findViewById(R.id.GatoBueno);
        GatoBueno.setOnClickListener(v -> {
            GatochangeColor(GatoBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (GatoObserv.getVisibility() == View.VISIBLE) {
                GatoObserv.startAnimation(fadeInOut);
                GatoObserv.setVisibility(View.GONE);
            }
        });
        GatoRegular = findViewById(R.id.GatoRegular);
        GatoRegular.setOnClickListener(v -> {
            GatochangeColor(GatoRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (GatoObserv.getVisibility() == View.VISIBLE) {
                GatoObserv.startAnimation(fadeInOut);
                GatoObserv.setVisibility(View.GONE);
            }
        });
        GatoMalo = findViewById(R.id.GatoMalo);
        GatoMalo.setOnClickListener(v -> {
            GatochangeColor(GatoMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (GatoObserv.getVisibility() == View.GONE) {
                GatoObserv.startAnimation(fadeInOut);
                GatoObserv.setVisibility(View.VISIBLE);
            }
        });

        RefBueno = findViewById(R.id.RefBueno);
        RefBueno.setOnClickListener(v -> {
            RefchangeColor(RefBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (RefObserv.getVisibility() == View.VISIBLE) {
                RefObserv.startAnimation(fadeInOut);
                RefObserv.setVisibility(View.GONE);
            }
        });
        RefRegular = findViewById(R.id.RefRegular);
        RefRegular.setOnClickListener(v -> {
            RefchangeColor(RefRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (RefObserv.getVisibility() == View.VISIBLE) {
                RefObserv.startAnimation(fadeInOut);
                RefObserv.setVisibility(View.GONE);
            }
        });
        RefMalo = findViewById(R.id.RefMalo);
        RefMalo.setOnClickListener(v -> {
            RefchangeColor(RefMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (RefObserv.getVisibility() == View.GONE) {
                RefObserv.startAnimation(fadeInOut);
                RefObserv.setVisibility(View.VISIBLE);
            }
        });

        SusBueno = findViewById(R.id.SuspBueno);
        SusBueno.setOnClickListener(v -> {
            SuschangeColor(SusBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (SusObserv.getVisibility() == View.VISIBLE) {
                SusObserv.startAnimation(fadeInOut);
                SusObserv.setVisibility(View.GONE);
            }
        });
        SusRegular = findViewById(R.id.SuspRegular);
        SusRegular.setOnClickListener(v -> {
            SuschangeColor(SusRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (SusObserv.getVisibility() == View.VISIBLE) {
                SusObserv.startAnimation(fadeInOut);
                SusObserv.setVisibility(View.GONE);
            }
        });
        SusMalo = findViewById(R.id.SuspMalo);
        SusMalo.setOnClickListener(v -> {
            SuschangeColor(SusMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (SusObserv.getVisibility() == View.GONE) {
                SusObserv.startAnimation(fadeInOut);
                SusObserv.setVisibility(View.VISIBLE);
            }
        });

        EscBueno = findViewById(R.id.EscBueno);
        EscBueno.setOnClickListener(v -> {
            EscchangeColor(EscBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (EscObserv.getVisibility() == View.VISIBLE) {
                EscObserv.startAnimation(fadeInOut);
                EscObserv.setVisibility(View.GONE);
            }
        });
        EscRegular = findViewById(R.id.EscRegular);
        EscRegular.setOnClickListener(v -> {
            EscchangeColor(EscRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (EscObserv.getVisibility() == View.VISIBLE) {
                EscObserv.startAnimation(fadeInOut);
                EscObserv.setVisibility(View.GONE);
            }
        });
        EscMalo = findViewById(R.id.EscMalo);
        EscMalo.setOnClickListener(v -> {
            EscchangeColor(EscMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (EscObserv.getVisibility() == View.GONE) {
                EscObserv.startAnimation(fadeInOut);
                EscObserv.setVisibility(View.VISIBLE);
            }
        });

        TapiBueno = findViewById(R.id.TapiBueno);
        TapiBueno.setOnClickListener(v -> {
            TapichangeColor(TapiBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (TapiObserv.getVisibility() == View.VISIBLE) {
                TapiObserv.startAnimation(fadeInOut);
                TapiObserv.setVisibility(View.GONE);
            }
        });
        TapiRegular = findViewById(R.id.TapiRegular);
        TapiRegular.setOnClickListener(v -> {
            TapichangeColor(TapiRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (TapiObserv.getVisibility() == View.VISIBLE) {
                TapiObserv.startAnimation(fadeInOut);
                TapiObserv.setVisibility(View.GONE);
            }
        });
        TapiMalo = findViewById(R.id.TapiMalo);
        TapiMalo.setOnClickListener(v -> {
            TapichangeColor(TapiMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (TapiObserv.getVisibility() == View.GONE) {
                TapiObserv.startAnimation(fadeInOut);
                TapiObserv.setVisibility(View.VISIBLE);
            }
        });

        LimpBueno = findViewById(R.id.LimpBueno);
        LimpBueno.setOnClickListener(v -> {
            LimpchangeColor(LimpBueno);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (LimpObserv.getVisibility() == View.VISIBLE) {
                LimpObserv.startAnimation(fadeInOut);
                LimpObserv.setVisibility(View.GONE);
            }
        });
        LimpRegular = findViewById(R.id.LimpRegular);
        LimpRegular.setOnClickListener(v -> {
            LimpchangeColor(LimpRegular);
            Animation fadeInOut = new AlphaAnimation(1, 0);
            fadeInOut.setDuration(500);
            if (LimpObserv.getVisibility() == View.VISIBLE) {
                LimpObserv.startAnimation(fadeInOut);
                LimpObserv.setVisibility(View.GONE);
            }
        });
        LimpMalo = findViewById(R.id.LimpMalo);
        LimpMalo.setOnClickListener(v -> {
            LimpchangeColor(LimpMalo);
            Animation fadeInOut = new AlphaAnimation(0, 1);
            fadeInOut.setDuration(500);
            if (LimpObserv.getVisibility() == View.GONE) {
                LimpObserv.startAnimation(fadeInOut);
                LimpObserv.setVisibility(View.VISIBLE);
            }
        });
    }

    private void PiechangeColor(Button selectedButton) {
        PieBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        PieRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        PieMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == PieBueno) {
            PieBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == PieRegular) {
            PieRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == PieMalo) {
            PieMalo.setBackgroundColor(Color.RED);
        }
    }

    private void ManochangeColor(Button selectedButton) {
        ManoBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        ManoRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        ManoMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == ManoBueno) {
            ManoBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == ManoRegular) {
            ManoRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == ManoMalo) {
            ManoMalo.setBackgroundColor(Color.RED);
        }
    }

    private void SegchangeColor(Button selectedButton) {
        SegBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        SegRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        SegMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == SegBueno) {
            SegBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == SegRegular) {
            SegRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == SegMalo) {
            SegMalo.setBackgroundColor(Color.RED);
        }
    }

    private void ExtchangeColor(Button selectedButton) {
        ExtBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        ExtRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        ExtMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == ExtBueno) {
            ExtBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == ExtRegular) {
            ExtRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == ExtMalo) {
            ExtMalo.setBackgroundColor(Color.RED);
        }
    }

    private void GatochangeColor(Button selectedButton) {
        GatoBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        GatoRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        GatoMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == GatoBueno) {
            GatoBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == GatoRegular) {
            GatoRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == GatoMalo) {
            GatoMalo.setBackgroundColor(Color.RED);
        }
    }

    private void RefchangeColor(Button selectedButton) {
        RefBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        RefRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        RefMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == RefBueno) {
            RefBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == RefRegular) {
            RefRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == RefMalo) {
            RefMalo.setBackgroundColor(Color.RED);
        }
    }

    private void SuschangeColor(Button selectedButton) {
        SusBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        SusRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        SusMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == SusBueno) {
            SusBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == SusRegular) {
            SusRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == SusMalo) {
            SusMalo.setBackgroundColor(Color.RED);
        }
    }

    private void EscchangeColor(Button selectedButton) {
        EscBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        EscRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        EscMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == EscBueno) {
            EscBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == EscRegular) {
            EscRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == EscMalo) {
            EscMalo.setBackgroundColor(Color.RED);
        }
    }

    private void TapichangeColor(Button selectedButton) {
        TapiBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        TapiRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        TapiMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == TapiBueno) {
            TapiBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == TapiRegular) {
            TapiRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == TapiMalo) {
            TapiMalo.setBackgroundColor(Color.RED);
        }
    }

    private void LimpchangeColor(Button selectedButton) {
        LimpBueno.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        LimpRegular.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        LimpMalo.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == LimpBueno) {
            LimpBueno.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == LimpRegular) {
            LimpRegular.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == LimpMalo) {
            LimpMalo.setBackgroundColor(Color.RED);
        }
    }
}