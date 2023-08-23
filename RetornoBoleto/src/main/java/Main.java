import org.example.LeituraRetornoBancoBrasil;
import org.example.LeituraRetornoBradesco;
import org.example.ProcessarBoletos;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        var leiuraRetorno = new LeituraRetornoBancoBrasil();
        var leituraRetornoBradesco = new LeituraRetornoBradesco();
        var processarBoletos = new ProcessarBoletos(leiuraRetorno);
        var processarBoletosBradesco = new ProcessarBoletos(leituraRetornoBradesco);
        var uriBB = Main.class.getResource("banco-brasil-1.csv").toURI();
        var uriB = Main.class.getResource("bradesco-1.csv").toURI();
        System.out.println("------------------- BANCO DO BRASIL -------------------");
        processarBoletos.processar(uriBB);
        System.out.println("------------------- BRADESCO -------------------");
        processarBoletosBradesco.processar(uriB);
        //processarBoletos.setLeituraRetorno(new LeituraRetornoBradesco());
    }
}