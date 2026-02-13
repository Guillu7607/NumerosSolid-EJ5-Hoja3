import java.util.Scanner;
import java.io.IOException;
public class NumerosSolid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = scanner.nextInt();

        GeneradorLineas generador = new GeneradorLineas();
        EscritorArchivo escritor = new EscritorArchivo();

        try {
            escritor.escribir("salida.txt", generador.generar(n));
            System.out.println("Fichero salida.txt generado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}
