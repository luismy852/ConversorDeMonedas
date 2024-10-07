import com.proyecto.conversordemonedas.modelos.LeyendoDatos;
import com.proyecto.conversordemonedas.modelos.SolicitudApi;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        SolicitudApi api = new SolicitudApi();
        LeyendoDatos leyendoDatos = new LeyendoDatos();
        String respuestaDeLaApi = api.obtenerApi();
        System.out.println(respuestaDeLaApi);
        leyendoDatos.guardarDatos(respuestaDeLaApi);

    }
}
