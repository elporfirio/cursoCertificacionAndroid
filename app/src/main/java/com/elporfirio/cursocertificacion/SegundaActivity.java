package com.elporfirio.cursocertificacion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.content.Intent.ACTION_VIEW;

/**
 * Created by mookfirio on 06/05/2016.
 */
public class SegundaActivity extends AppCompatActivity {
    Button btonActividad, btnEnviarDatos, btnAbrirWeb, btnIntent;

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);

        //DEFINE EL XML DE LA ACTIVIDAD
        setContentView(R.layout.activity_segunda);

        btonActividad = (Button) findViewById(R.id.irAActividad);
        btnEnviarDatos = (Button) findViewById(R.id.irAActividadConDatos);
        btnAbrirWeb = (Button) findViewById(R.id.abrirWeb);
        btnIntent = (Button) findViewById(R.id.llamadaIntent);

        btonActividad.setOnClickListener(eventoActividad);
        btnEnviarDatos.setOnClickListener(eventoActividad);
        btnAbrirWeb.setOnClickListener(eventoActividad);
        btnIntent.setOnClickListener(eventoActividad);
    }

    private View.OnClickListener eventoActividad = new View.OnClickListener(){
      @Override
        public void onClick(View view){
          if (view == btonActividad){ // Va a otra activity
              Intent intent = new Intent(SegundaActivity.this, PrincipalActivity.class);
              startActivity(intent);
              finish();
          } else if(view == btnEnviarDatos){
              Intent intent = new Intent(SegundaActivity.this, PrincipalActivity.class);
              intent.putExtra("nombre", "Juanito");
              intent.putExtra("edad", 10);
              startActivity(intent);
          } else if(view == btnAbrirWeb){
              Intent intent = new Intent(ACTION_VIEW, Uri.parse("https://elporfirio.com"));
              startActivity(intent);
          } else if(view == btnIntent){
              Intent intent = new Intent(ACTION_VIEW, Uri.parse("tel:1234567890"));
              startActivity(intent);
          }
      }
    };

}
