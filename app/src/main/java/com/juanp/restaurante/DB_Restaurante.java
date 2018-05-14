package com.juanp.restaurante;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class    DB_Restaurante extends SQLiteOpenHelper {

    public static final String TABLE_MESEROS = "usu_meseros";
    public static final String TABLE_COCINEROS = "usu_cocineros";
    public static final String TABLE_PEDIDOS = "pedidos";
    public static final String TABLE_PEDIDOS_PRODUCTOS = "pedidos_productos";
    public static final String TABLE_PRODUCTOS = "productos";


    public DB_Restaurante(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "Restaurante.db", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE usu_meseros" +
                "(id_usu_mesero integer PRIMARY KEY," +
                "mese_nombre varchar(50)," +
                "mese_apellido varchar(50)," +
                "mese_email varchar(80)," +
                "mese_contra varchar(50)"+")");

        sqLiteDatabase.execSQL("CREATE TABLE usu_cocineros" +
                "(id_usu_cocinero integer PRIMARY KEY," +
                "coci_nombre varchar(50)," +
                "coci_apellido varchar(50)," +
                "coci_email varchar(80)," +
                "coci_contra varchar(50)"+")");

        sqLiteDatabase.execSQL("CREATE TABLE pedidos" +
                "(id_pedido integer PRIMARY KEY AUTOINCREMENT," +
                "id_usu_mesero varchar(50)," +
                "pedi_fecha date," +
                "pedi_estado varchar(20)"+")");

        sqLiteDatabase.execSQL("CREATE TABLE pedidos_productos" +
                "(id_pedido_productos integer PRIMARY KEY AUTOINCREMENT," +
                "id_pedido integer," +
                "id_producto integer"+")");

        sqLiteDatabase.execSQL("CREATE TABLE productos" +
                "(id_producto integer PRIMARY KEY AUTOINCREMENT," +
                "prod_nombre integer," +
                "prod_categoria"+")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
