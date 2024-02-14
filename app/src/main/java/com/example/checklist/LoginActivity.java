package com.example.checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.net.URL;

public class LoginActivity extends AppCompatActivity {

    //9A8JW 8000056527 nAtnnie117@*

    //String URL_SERVIDOR = "http://192.168.115.4/server/servidor/login.php";
    String URL_SERVIDOR = "http://192.168.1.137/server/login/login.php";
    //EditText etUsuario, etContrasena;
    Button btnLogin, btnRegistrar;

    private static final String PREFS_NAME = "LoginPrefs";
    private static final String PREF_USERNAME = "usuario";
    private static final String PREF_PASSWORD= "contrasena";
    String usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsuario = findViewById(R.id.edituser);
        etUsuario.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        final EditText etContrasena = findViewById(R.id.editpwd);
        btnLogin = findViewById(R.id.btnInit);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usuario = etUsuario.getText().toString().trim();
                contrasena = etContrasena.getText().toString().trim();



                // Ejecutar la tarea asíncrona para realizar la conexión al servidor
                LoginTask loginTask = new LoginTask(etUsuario, etContrasena);
                loginTask.execute(usuario, contrasena);
            }
        });
        btnRegistrar = findViewById(R.id.btnReg);

        etContrasena.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        etContrasena.setTransformationMethod(PasswordTransformationMethod.getInstance());

        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        etUsuario.setText(preferences.getString(PREF_USERNAME, ""));
        etContrasena.setText(preferences.getString(PREF_PASSWORD, ""));
    }


    /*public void login(View view) {
        if (etUsuario.getText().toString().equals("")){
            Toast.makeText(this, "Ingrese RPE", Toast.LENGTH_SHORT).show();
        } else if (etContrasena.getText().toString().equals("")) {
            Toast.makeText(this, "Ingrese No. ECO", Toast.LENGTH_SHORT).show();
        } else {
            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Verificando... ");
            progressDialog.show();

            usuario = etUsuario.getText().toString().trim();
            contrasena = etContrasena.getText().toString().trim();

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_SERVIDOR, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            progressDialog.dismiss();

                            if (response.equals("Correcto")) {

                                    saveCredentials();
                                    etUsuario.setText("");
                                    etContrasena.setText("");
                                    Intent intent = new Intent(getApplicationContext(), ServerActivity.class);
                                    intent.putExtra("usuario", usuario);
                                    startActivity(intent);
                                    Toast.makeText(LoginActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                                } else if (response.equals("Incorrecto")) {
                                    Toast.makeText(LoginActivity.this, "RPE o No. ECO incorrectos", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(LoginActivity.this, "Error en la respuesta del servidor", Toast.LENGTH_SHORT).show();
                                }
                            }
                    }, 1500);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    Toast.makeText(LoginActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }){
                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params = new HashMap<>();
                    params.put("usuario", usuario);
                    params.put("contrasena", contrasena);
                    return params;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(LoginActivity.this);
            requestQueue.add(stringRequest);
        }
    }*/

    public class LoginTask extends AsyncTask<String, Void, String> {
        private final WeakReference<EditText> editTextUsuarioRef;
        private final WeakReference<EditText> editTextContrasenaRef;

        public LoginTask(EditText editTextUsuario, EditText editTextContrasena) {
            this.editTextUsuarioRef = new WeakReference<>(editTextUsuario);
            this.editTextContrasenaRef = new WeakReference<>(editTextContrasena);
        }

        @Override
        protected String doInBackground(String... params) {
            usuario = params[0];
            contrasena = params[1];

            try {

                URL url = new URL("http://192.168.115.4/server/login.php");
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("POST");
                urlConnection.setDoOutput(true);
                String data = "usuario=" + usuario + "&contrasena=" + contrasena;
                OutputStream outputStream = urlConnection.getOutputStream();
                outputStream.write(data.getBytes());
                outputStream.flush();
                outputStream.close();

                BufferedReader reader = new BufferedReader((new InputStreamReader(urlConnection.getInputStream())));
                StringBuilder stringBuilder = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
                }

                reader.close();
                return  stringBuilder.toString().trim();
            } catch (Exception e) {
                Log.e("LoginTask", "Error en la conexión: " + e.getMessage());
                return null;
            }
        }

        protected void onPostExecute(String response) {
            EditText etUsuario = editTextUsuarioRef.get();
            EditText etContrasena = editTextContrasenaRef.get();

            if (usuario.equals("")) {
                Toast.makeText(LoginActivity.this, "Ingrese RPE", Toast.LENGTH_SHORT).show();
            } else if (contrasena.equals("")) {
                Toast.makeText(LoginActivity.this, "Ingrese No. ECO", Toast.LENGTH_SHORT).show();
            } else {
                ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);
                progressDialog.setMessage("Verificando...");
                progressDialog.show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressDialog.dismiss();
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            if (jsonResponse.has("status")) {
                                String status = jsonResponse.getString("status");
                                if ("Correcto".equals(status)) {
                                    String nombreUsuario = jsonResponse.optString("nombre_empleado", "");
                                    String zona = jsonResponse.optString("clave_zona", "");
                                    saveCredentials();
                                    etUsuario.setText("");
                                    etContrasena.setText("");
                                    Intent intent = new Intent(LoginActivity.this, ServerActivity.class);
                                    intent.putExtra("usuario", usuario);
                                    intent.putExtra("contrasena", contrasena);
                                    intent.putExtra("nombreUsuario", nombreUsuario);
                                    intent.putExtra("zona", zona);
                                    startActivity(intent);
                                    Toast.makeText(LoginActivity.this, "Inicio de sesión existoso", Toast.LENGTH_SHORT).show();
                                } else if ("Incorrecto".equals(status)) {
                                    Toast.makeText(LoginActivity.this, "RPE o No. ECO incorrectos", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(LoginActivity.this, "Respuesta desconocida del servidor", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(LoginActivity.this, "Formato de respuesta incorrecto del servidor", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(LoginActivity.this, "Error al procesar la respuesta del servidor", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, 1500);
            }
        }
    }

    public void registro(View view) {
        startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
        finish();
    }

    private void saveCredentials() {
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(PREF_USERNAME, usuario);
        editor.putString(PREF_PASSWORD, contrasena);
        editor.apply();
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}