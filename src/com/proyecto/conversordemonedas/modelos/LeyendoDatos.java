package com.proyecto.conversordemonedas.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class LeyendoDatos {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void guardarDatos (String datos){
        DatosMoneda datosMoneda = gson.fromJson(datos, DatosMoneda.class);
        System.out.println(datosMoneda);
    }

}
