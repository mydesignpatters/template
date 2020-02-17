package app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(final String[] args) throws IOException {
        final GeradorXML meuGeradorXML = new GeradorXML();

        final Map<String, Object> propriedades = new HashMap<String, Object>();
        propriedades.put("porta", "8080");
        propriedades.put("banco", "mysql");
        propriedades.put("servidor", "tomcat");
        meuGeradorXML.gerarArquivo("meuArquivoDePropriedadesNormal.xml", propriedades);

        System.out.println("Arquivo gerado com sucesso!");
    }
}