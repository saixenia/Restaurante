package com.juanp.restaurante;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DB_Restaurante extends SQLiteOpenHelper {

    public static final String TABLE_MESEROS = "usu_meseros";
    public static final String TABLE_COCINEROS = "usu_cocineros";
    public static final String TABLE_PEDIDOS = "pedidos";
    public static final String TABLE_PEDIDOS_PRODUCTOS = "pedidos_productos";
    public static final String TABLE_PRODUCTOS = "productos";


    public DB_Restaurante(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "Restaurante.db", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB_R) {

        DB_R.execSQL("CREATE TABLE usu_meseros" +
                "(id_usu_mesero integer PRIMARY KEY," +
                "mese_nombre varchar(50)," +
                "mese_apellido varchar(50)," +
                "mese_email varchar(80)," +
                "mese_contra varchar(50)"+")");

        DB_R.execSQL("CREATE TABLE usu_cocineros" +
                "(id_usu_cocinero integer PRIMARY KEY," +
                "coci_nombre varchar(50)," +
                "coci_apellido varchar(50)," +
                "coci_email varchar(80)," +
                "coci_contra varchar(50)"+")");

        DB_R.execSQL("CREATE TABLE pedidos" +
                "(id_pedido integer PRIMARY KEY AUTOINCREMENT," +
                "id_usu_mesero varchar(50)," +
                "pedi_fecha date," +
                "pedi_estado varchar(20)"+")");

        DB_R.execSQL("CREATE TABLE pedidos_productos" +
                "(id_pedido_productos integer PRIMARY KEY AUTOINCREMENT," +
                "id_pedido integer," +
                "id_producto integer"+")");

        DB_R.execSQL("CREATE TABLE productos" +
                "(id_producto integer PRIMARY KEY AUTOINCREMENT," +
                "prod_nombre integer," +
                "prod_categoria"+")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB_R, int Version_Antigua, int Version_Nueva) {

        Log.w(DB_Restaurante.class.getName(),
                "UPGRADING DATABASE FROM VERSION " + Version_Antigua + " TO "
                        + Version_Nueva + ", WHICH WILL DESTROY ALL OLD DATA");
        DB_R.execSQL("DROP TABLE IF EXISTS " + TABLE_MESEROS);
        DB_R.execSQL("DROP TABLE IF EXISTS " + TABLE_COCINEROS);
        DB_R.execSQL("DROP TABLE IF EXISTS " + TABLE_PEDIDOS);
        DB_R.execSQL("DROP TABLE IF EXISTS " + TABLE_PEDIDOS_PRODUCTOS);
        DB_R.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCTOS);
        onCreate(DB_R);

    }
}
