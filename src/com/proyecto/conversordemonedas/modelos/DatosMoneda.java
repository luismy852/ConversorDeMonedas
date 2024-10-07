package com.proyecto.conversordemonedas.modelos;

import java.util.Map;

public record DatosMoneda(Map<String, Double> conversion_rates) {
}
