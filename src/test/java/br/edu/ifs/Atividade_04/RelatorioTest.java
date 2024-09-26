package br.edu.ifs.Atividade_04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RelatorioTest {

    @Test
    public void testExportarRelatorioCSV() {
        Relatorio relatorio = new Relatorio();
        boolean sucesso = relatorio.exportar("estoque.csv", Formato.CSV);
        assertTrue(sucesso);
    }
}
