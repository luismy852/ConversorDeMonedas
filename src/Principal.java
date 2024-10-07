import com.proyecto.conversordemonedas.modelos.*;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        SolicitudApi api = new SolicitudApi();
        LeyendoDatos leyendoDatos = new LeyendoDatos();
        BuscarMoneda buscarMoneda = new BuscarMoneda();
        CalcularCambioDivisa calcularCambioDivisa = new CalcularCambioDivisa();
        double monedaEscogida;
        int decision = 10;
        Scanner teclado = new Scanner(System.in);
        double cantidad = 0;
        double respuestaCliente = 0;


        String respuestaDeLaApi = api.obtenerApi();
        leyendoDatos.guardarDatos(respuestaDeLaApi);

        while (decision != 0){

            System.out.println("""
                **********************************************+
                
                Bienvenido/a al conversor de monedas C:
                
                A continuacion pon el numero de la opcion que desees:
                
                1. Dolar a Peso Colombiano
                2. Peso Colombiano a Dolar
                3. Dolar a Real Brasileño
                4. Real Brasileño a Dolar
                5. Dolar a Peso Argentino
                6. Peso Argentino a Dolar
                
                0. Para salir del programa
                
                *********************************************+
                """);


            decision = teclado.nextInt();
            switch (decision){
                case 1:
                    monedaEscogida = buscarMoneda.posicion(leyendoDatos.getLista(),"COP");
                    System.out.println("¿Cuantos dolares quieres convertir?");
                    cantidad = teclado.nextDouble();
                    respuestaCliente = calcularCambioDivisa.conversion(cantidad, monedaEscogida);
                    System.out.println( "Equivale a " + respuestaCliente + " pesos Colombianos");

                    break;

                case 2:
                    monedaEscogida = buscarMoneda.posicion(leyendoDatos.getLista(),"COP");
                    System.out.println("¿Cuantos Pesos quieres convertir?");
                    cantidad = teclado.nextDouble();
                    respuestaCliente = calcularCambioDivisa.conersionDolar(cantidad, monedaEscogida);
                    System.out.println("La cantidad equivale a " +  respuestaCliente + " Dolares");
                    break;

                case 3:
                    monedaEscogida = buscarMoneda.posicion(leyendoDatos.getLista(),"BRL");
                    System.out.println("¿Cuantos dolares quieres convertir?");
                    cantidad = teclado.nextDouble();
                    respuestaCliente = calcularCambioDivisa.conversion(cantidad, monedaEscogida);
                    System.out.println("Equivale a "+ respuestaCliente +" reales Brasileños");
                    break;

                case 4:
                    monedaEscogida = buscarMoneda.posicion(leyendoDatos.getLista(),"BRL");
                    System.out.println("¿Cuantos Reales quieres convertir?");
                    cantidad = teclado.nextDouble();
                    respuestaCliente = calcularCambioDivisa.conersionDolar(cantidad, monedaEscogida);
                    System.out.println("La cantidad equivale a " +  respuestaCliente + " Dolares");
                    break;

                case 5:
                    monedaEscogida = buscarMoneda.posicion(leyendoDatos.getLista(),"ARS");
                    System.out.println("¿Cuantos dolares quieres convertir?");
                    cantidad = teclado.nextDouble();
                    respuestaCliente = calcularCambioDivisa.conversion(cantidad, monedaEscogida);
                    System.out.println("Equivales a " + respuestaCliente + " pesos Argentinos");
                    break;

                case 6:
                    monedaEscogida = buscarMoneda.posicion(leyendoDatos.getLista(),"ARS");
                    System.out.println("¿Cuantos Pesos quieres convertir?");
                    cantidad = teclado.nextDouble();
                    respuestaCliente = calcularCambioDivisa.conersionDolar(cantidad, monedaEscogida);
                    System.out.println("La cantidad equivale a " +  respuestaCliente + " Dolares");
                    break;

                case 0:
                    System.out.println("Gracias por usar el programa");
            }


        }
    }
}
