package com.juanp.restaurante;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Registro extends AppCompatActivity {

    EditText Txt_Identificacion, Txt_Nombre, Txt_Apellido, Txt_Email, Txt_Contrasena;
    RadioGroup Rd_Btn_Mesero_Cocinero;
    RadioButton Rbtn_Mesero, Rbtn_Cocinero;
    Button Btn_Registro;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_registro);
            setTitle("Registro");

            Txt_Identificacion = findViewById(R.id.Txt_Identificacion);
            Txt_Nombre = findViewById(R.id.Txt_Nombre);
            Txt_Apellido = findViewById(R.id.Txt_Apellido);
            Txt_Email = findViewById(R.id.Txt_Email);
            Txt_Contrasena = findViewById(R.id.Txt_Contrasena);

            Rd_Btn_Mesero_Cocinero = findViewById(R.id.Rd_Btn_Mesero_Cocinero);
            Rbtn_Mesero = findViewById(R.id.Rbtn_Mesero);
            Rbtn_Cocinero = findViewById(R.id.Rbtn_Cocinero);

            Btn_Registro = findViewById(R.id.Btn_Registro);
            Btn_Registro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Registro(view);
                }
            });
        }


        public void Registrar_Mesero(View view) {
            DB_Restaurante Admin = new DB_Restaurante(this, "Restaurante", null, 1);
            SQLiteDatabase DB_Restaurante = Admin.getWritableDatabase();

            String Mese_Identificacion = Txt_Identificacion.getText().toString();
            String Mese_Nombre = Txt_Nombre.getText().toString();
            String Mese_Apellido = Txt_Apellido.getText().toString();
            String Mese_Email = Txt_Email.getText().toString();
            String Mese_Contrasena = Txt_Contrasena.getText().toString();

            ContentValues Values = new ContentValues();
            Values.put("id_usu_mesero", Mese_Identificacion);
            Values.put("mese_nombre", Mese_Nombre);
            Values.put("mese_apellido", Mese_Apellido);
            Values.put("mese_email", Mese_Email);
            Values.put("mese_contra", Mese_Contrasena);

            DB_Restaurante.insert("usu_meseros", null, Values);
            DB_Restaurante.close();

            Intent Main = new Intent(Registro.this, LoginActivity.class);
            Registro.this.startActivity(Main);
        }

        public void Registrar_Cocinero(View view) {
            DB_Restaurante Admin = new DB_Restaurante(this, "Restaurante", null, 1);
            SQLiteDatabase DB_Restaurante = Admin.getWritableDatabase();

            String Coci_Identificacion = Txt_Identificacion.getText().toString();
            String Coci_Nombre = Txt_Nombre.getText().toString();
            String Coci_Apellido = Txt_Apellido.getText().toString();
            String Coci_Email = Txt_Email.getText().toString();
            String Coci_Contrasena = Txt_Contrasena.getText().toString();

            ContentValues Values = new ContentValues();
            Values.put("id_usu_cocinero", Coci_Identificacion);
            Values.put("coci_nombre", Coci_Nombre);
            Values.put("coci_apellido", Coci_Apellido);
            Values.put("coci_email", Coci_Email);
            Values.put("coci_contra", Coci_Contrasena);

            DB_Restaurante.insert("usu_cocineros", null, Values);
            DB_Restaurante.close();

            Intent Main = new Intent(Registro.this, LoginActivity.class);
            Registro.this.startActivity(Main);
        }

        public void Registro (View view) {
            if (Rbtn_Mesero.isChecked()) {
                Registrar_Mesero(view);
            }
            else {
                Registrar_Cocinero(view);
            }
        }
    }
