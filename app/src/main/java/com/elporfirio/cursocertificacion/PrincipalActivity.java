package com.elporfirio.cursocertificacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by mookfirio on 06/05/2016.
 */
public class PrincipalActivity extends AppCompatActivity {
    Button boton, miBoton;

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);

        /* Diseño desde programa */
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        miBoton = new Button(this);
        miBoton.setText("Botón desde código");

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        miBoton.setLayoutParams(layoutParams);
        miBoton.setOnClickListener(eventoOnClick);

        linearLayout.addView(miBoton);

        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        linearLayout.setLayoutParams(layoutParams);
        setContentView(linearLayout);

        /* DISEÑO desde XML */
        //setContentView(R.layout.activity_principal); // acceso a la vista
        //boton = (Button) findViewById(R.id.boton);
    }

    private View.OnClickListener eventoOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view == miBoton) {
                Intent intent = new Intent(PrincipalActivity.this, SegundaActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };
}