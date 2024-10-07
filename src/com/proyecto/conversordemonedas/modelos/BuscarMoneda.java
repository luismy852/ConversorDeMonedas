package com.proyecto.conversordemonedas.modelos;

import java.util.List;
import java.util.Objects;

public class BuscarMoneda {
    public double posicion (List<Moneda> lista, String codigo){
        for (int i = 0; i <lista.size(); i++) {
            Moneda moneda = lista.get(i);
            if (moneda.getCodigoMoneda().equals(codigo)){
                return moneda.getValor();
            }

        }
        return 0;
    }
}
