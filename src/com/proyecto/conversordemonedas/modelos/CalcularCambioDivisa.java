package com.proyecto.conversordemonedas.modelos;

public class CalcularCambioDivisa {
    public double conversion (double cantidad, double monedaEscogida){
        return cantidad * monedaEscogida;
    }

    public double conersionDolar (double cantidad, double monedaEscogida){
        return cantidad/monedaEscogida;
    }
}
