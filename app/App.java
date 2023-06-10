package app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(final String[] args) throws IOException {
        final GeradorXML meuGeradorXML = new GeradorXML();
        final GeradorXMLCompactado meuXMLCompactado = new GeradorXMLCompactado();

        final Map<String, Object> propriedades = new HashMap<String, Object>();
        
        propriedades.put("porta", "8080");
        propriedades.put("banco", "mysql");
        propriedades.put("servidor1", "tomcat1");
        propriedades.put("servidor2", "tomcat2");
        propriedades.put("servidor3", "tomcat3");
        propriedades.put("servidor4", "tomcat4");
        propriedades.put("servidor5", "tomcat5");
        propriedades.put("servidor6", "tomcat6");
        propriedades.put("servidor7", "tomcat7");
        propriedades.put("servidor8", "tomcat8");
        propriedades.put("servidor9", "tomcat9");
        propriedades.put("servidor10", "tomcat10");
        
        meuGeradorXML.gerarArquivo("meuArquivoDePropriedadesNormal.xml", propriedades);
        meuXMLCompactado.gerarArquivo("meuArquivoDePropriedadesCompactado.zip", propriedades);

        System.out.println("Arquivos gerados com sucesso!");
    }
}