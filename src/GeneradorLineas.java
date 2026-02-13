import java.util.ArrayList;
import java.util.List;

class GeneradorLineas {

    public List<String> generar(int n) {
        List<String> lineas = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            StringBuilder linea = new StringBuilder();

            for (int j = 1; j <= i; j++) {
                linea.append(j);
                if (j < i) {
                    linea.append(" ");
                }
            }

            lineas.add(linea.toString());
        }

        return lineas;
    }
}