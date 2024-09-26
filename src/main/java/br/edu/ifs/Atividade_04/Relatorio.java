package br.edu.ifs.Atividade_04;

import java.io.FileWriter;
import java.io.IOException;

// Definindo o enum Formato
enum Formato {
    CSV,
    TEXTO
}

public class Relatorio {

    // Atributos (podem ser ajustados conforme a necessidade do relatório)
    private String titulo;
    private String conteudo;

    // Construtor padrão
    public Relatorio() {
        this.titulo = "Relatório de Estoque";
        this.conteudo = "Conteúdo do relatório de estoque";
    }

    // Método para exportar o relatório em um formato específico
    public boolean exportar(String caminhoArquivo, Formato formato) {
        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            // Verifica o formato para exportação
            if (formato == Formato.CSV) {
                // Exporta no formato CSV
                writer.write(gerarCSV());
            } else if (formato == Formato.TEXTO) {
                // Exporta no formato texto simples
                writer.write(gerarTexto());
            }
            return true; // Exportação bem-sucedida
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Exportação falhou
        }
    }

    // Método para gerar conteúdo em formato CSV
    private String gerarCSV() {
        // Exemplo simples de conteúdo CSV
        return "Título;Conteúdo\n" + titulo + ";" + conteudo;
    }

    // Método para gerar conteúdo em formato de texto simples
    private String gerarTexto() {
        // Exemplo simples de conteúdo em texto
        return "Título: " + titulo + "\nConteúdo: " + conteudo;
    }
}
