import org.example.LeituraRetornoBancoBrasil;
import org.example.LeituraRetornoBradesco;
import org.example.ProcessarBoletos;
import java.net.URISyntaxException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        var processarBoletos = new ProcessarBoletos();
        var uriBB = Main.class.getResource("banco-brasil-1.csv").toURI();
        var uriBradesco = Main.class.getResource("bradesco-1.csv").toURI();
        processarBoletos.processar(uriBB);
        processarBoletos.processar(uriBradesco);
    }

}