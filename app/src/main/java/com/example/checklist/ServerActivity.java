package com.example.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ServerActivity extends AppCompatActivity {

    String URL = "http://192.168.1.137/server/logout.php";
    String Title = "Registro Vehicular";
    String[] items = {"D117", "D118", "D119", "D120", "D121", "D122", "D123", "D124", "D125", "D126", "D127"};
    ArrayAdapter<String> adapterItems;
    AutoCompleteTextView userRPE, noEco, zone;
    EditText date, area, km;
    private int nYearIni, nMonthIni, nDayIni, sYearIni, sMonthIni, sDayIni;
    static final int DATE_ID = 0;
    Calendar calendar = Calendar.getInstance();
    Button hola, hola2, hola3;
    ImageButton settings;
    Spinner spinner;
    private static final String URL_PHP_SCRIPT = "http://192.168.1.137/server/login/home.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);
        this.setTitle(Title);

        verificarFormInconcluso();

        userRPE = findViewById(R.id.rpe);
        noEco = findViewById(R.id.noEco);
        zone = findViewById(R.id.zone);
        area = findViewById(R.id.area);
        km = findViewById(R.id.km);

        Intent intent = getIntent();
        if (intent != null) {
            String usuario = getIntent().getStringExtra("usuario");
            String nombreUsuario = getIntent().getStringExtra("nombreUsuario");
            String contrasena = getIntent().getStringExtra("contrasena");
            String zona = getIntent().getStringExtra("zona");

            // Mostrar datos en los EditText
            userRPE.setText(usuario + "/" + nombreUsuario);
            noEco.setText(contrasena);
            zone.setText(zona);

            Log.d("ServerActivity", "Usuario: " + usuario);
            Log.d("ServerActivity", "contrasena: " + contrasena);
        }

        hola = findViewById(R.id.hola);
        hola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(hola);
                fetchData("B");
            }
        });
        hola2 = findViewById(R.id.hola2);
        hola2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(hola2);
                fetchData("Regular");
            }
        });
        hola3 = findViewById(R.id.hola3);
        hola3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(hola3);
                fetchData("Malo");
            }
        });

        /*settings = findViewById(R.id.settings);
        spinner = findViewById(R.id.spinner);

        List<String> opciones = new ArrayList<>();
        opciones.add("Cambiar IP");
        opciones.add("Cerrar sesión");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String opcionSeleccionada = opciones.get(position);
                if (opcionSeleccionada.equals("Cambiar IP")) {

                } else if (opcionSeleccionada.equals("Cerrar sesión")) {
                    Toast.makeText(ServerActivity.this, "Sesión finalizada", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinner.performClick();
            }
        });*/

        sYearIni = calendar.get(Calendar.YEAR);
        sMonthIni = calendar.get(Calendar.MONTH);
        sDayIni = calendar.get(Calendar.DAY_OF_MONTH);
        date = findViewById(R.id.fecha);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(DATE_ID);
            }
        });

        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, items);
        zone.setAdapter(adapterItems);
        zone.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Zona: " + item, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void changeColor(Button selectedButton) {
        hola.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        hola2.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        hola3.setBackgroundColor(getResources().getColor(android.R.color.background_light));

        if (selectedButton == hola) {
            hola.setBackgroundColor(Color.GREEN);
        } else if (selectedButton == hola2) {
            hola2.setBackgroundColor(Color.YELLOW);
        } else if (selectedButton == hola3) {
            hola3.setBackgroundColor(Color.RED);
        }
        //selectedButton.setBackgroundColor(Color.GREEN);
    }

    private void fetchData(String botonSeleccionado) {
        try {
            Connection connection = DatabaseConnection.connection();
            if (connection != null) {
                String insertQuery = "SELECT checklist.estado_llanta_1, empleados.rpe_empleado " + "FROM estado_llanta_1 " +
                        "JOIN empleados ON checklist.estado_llanta_1 = empleados.rpe_empleado " +
                        "WHERE checklist.estado_llanta_1 = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        if (resultSet.next()) {
                            String resultado = "Valor: " + resultSet.getString("estado_llanta_1") +
                                    "\nNombre: " + resultSet.getString("rpe_empleado");
                            //userNom.setText(resultado);
                        }
                    }
                    preparedStatement.setString(1, botonSeleccionado);
                    preparedStatement.executeUpdate();
                    Toast.makeText(this, "DATO INSERTADO", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    private void colocarFecha() {
        date.setText(nYearIni + "-" + (nMonthIni + 1) + "-" +  nDayIni + "");
    }

    private DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            nYearIni = year;
            nMonthIni = monthOfYear;
            nDayIni = dayOfMonth;
            colocarFecha();
        }
    };

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_ID:
                return new DatePickerDialog(this, onDateSetListener, sYearIni, sMonthIni, sDayIni);
        }
        return null;
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    public void Enviar(View view) {

        String rpe = userRPE.getText().toString().trim();
        String noEconomico = noEco.getText().toString().trim();
        String zona = zone.getText().toString().trim();
        String fecha = date.getText().toString().trim();
        String km_ = km.getText().toString().trim();

        JSONObject jsonParams = new JSONObject();
        try {
            jsonParams.put("rpe_checklist", rpe);
            jsonParams.put("no_economico", noEconomico);
            jsonParams.put("clave_zona", zona);
            jsonParams.put("fecha_checklist", fecha);
            jsonParams.put("km", km_);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        new EnviarDatosAsyncTask().execute(jsonParams);
    }

    private class EnviarDatosAsyncTask extends AsyncTask<JSONObject, Void, Void> {

        @Override
        protected Void doInBackground(JSONObject... jsonObjects) {
            HttpURLConnection httpURLConnection = null;

            try {
                URL url = new URL("http://192.168.115.4/server/dataUser.php");
                httpURLConnection = (HttpURLConnection) url.openConnection();

                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection.setDoOutput(true);

                OutputStream os = httpURLConnection.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
                writer.write(jsonObjects[0].toString());
                writer.flush();
                writer.close();
                os.close();

                // Aquí puedes leer la respuesta del servidor si es necesario
            } catch (Exception e) {
                //e.printStackTrace();
                Log.e("AsyncTaskError", "Error en AsyncTask: " + e.getMessage());
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }

            return null;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        guardarDatosEnCache();
    }

    private void guardarDatosEnCache() {
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        //editor.putString("userRPE", userRPE.getText().toString().trim());
        //editor.putString("noECO", noEco.getText().toString().trim());
        //editor.putString("zone", zone.getText().toString().trim());
        editor.putString("date", date.getText().toString().trim());
        editor.putString("km", km.getText().toString().trim());

        editor.apply();
    }

    private void verificarFormInconcluso() {
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);

        if (/*prefs.contains("userRPE") || prefs.contains("noECO") || prefs.contains("zone") || */prefs.contains("date") || prefs.contains("km")) {
            mostrarWarning();
        }
    }

    private void mostrarWarning() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Hay un formulario inconsluso. ¿Desea continuar?")
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        cargarDatos();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        limpiarDatos();
                    }
                });
        builder.create().show();
    }

    private void cargarDatos() {
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        //userRPE.setText(prefs.getString("userRPE", ""));
        //noEco.setText(prefs.getString("noECO", ""));
        //zone.setText(prefs.getString("zone", ""));
        date.setText(prefs.getString("date", ""));
        km.setText(prefs.getString("km", ""));

        limpiarDatos();
    }

    private void limpiarDatos() {
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.clear();
        editor.apply();
    }
}