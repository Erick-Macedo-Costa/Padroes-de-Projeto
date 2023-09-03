import org.example.LeituraRetornoBancoBrasil;
import org.example.LeituraRetornoBradesco;
import org.example.ProcessarBoletos;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        var processarBoletos = new LeituraRetornoBancoBrasil();
        var processarBoletosBradesco = new LeituraRetornoBradesco();
        var uriBB = Main.class.getResource("banco-brasil-1.csv").toURI();
        var uriB = Main.class.getResource("bradesco-1.csv").toURI();
        System.out.println("------------------- BANCO DO BRASIL -------------------");
        processarBoletos.processar(uriBB);
        System.out.println("------------------- BRADESCO -------------------");
        processarBoletosBradesco.processar(uriB);
    }

}