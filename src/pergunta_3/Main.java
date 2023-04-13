package pergunta_3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONException;

public class Main {
    
    public static void main(String[] args) {
        try {
            // Lê o arquivo JSON com o faturamento diário
            String json = lerArquivo("dados.json");
            JSONArray faturamento = new JSONArray(json);
            
            // Calcula o menor e o maior faturamento diário
            double menorFaturamento = faturamento.getDouble(0);
            double maiorFaturamento = faturamento.getDouble(0);
            for (int i = 1; i < faturamento.length(); i++) {
                double valor = faturamento.getDouble(i);
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
            }
            
            // Calcula a média mensal de faturamento, ignorando os dias sem faturamento
            double somaFaturamento = 0;
            int diasComFaturamento = 0;
            for (int i = 0; i < faturamento.length(); i++) {
                double valor = faturamento.getDouble(i);
                if (valor > 0) {
                    somaFaturamento += valor;
                    diasComFaturamento++;
                }
            }
            double mediaFaturamento = somaFaturamento / diasComFaturamento;
            
            // Conta o número de dias em que o faturamento foi superior à média mensal
            int diasAcimaDaMedia = 0;
            for (int i = 0; i < faturamento.length(); i++) {
                double valor = faturamento.getDouble(i);
                if (valor > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }
            
            // Exibe os resultados
            System.out.println("Menor faturamento diário: " + menorFaturamento);
            System.out.println("Maior faturamento diário: " + maiorFaturamento);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
            
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        } catch (JSONException e) {
            System.out.println("Erro ao parsear arquivo JSON: " + e.getMessage());
        }
    }
    
    private static String lerArquivo(String nomeArquivo) throws IOException {
        return new String(Files.readAllBytes(Paths.get(nomeArquivo)));
    }

}
