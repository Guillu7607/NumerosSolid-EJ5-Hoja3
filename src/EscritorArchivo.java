import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class EscritorArchivo {

    public void escribir(String nombreArchivo, List<String> lineas) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));

        for (String linea : lineas) {
            writer.write(linea);
            writer.newLine();
        }

        writer.close();
    }
}