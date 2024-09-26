package br.edu.ifs.Atividade_04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {

    @Test
    public void testEntradaDeProduto() {
        Produto produto = new Produto("Camiseta", "Camiseta de algodão", 50, 19.99, "2024-12-31");
        produto.adicionarEstoque(20);
        assertEquals(70, produto.getQuantidade());
    }

    @Test
    public void testSaidaDeProduto() {
        Produto produto = new Produto("Camiseta", "Camiseta de algodão", 50, 19.99, "2024-12-31");
        produto.reduzirEstoque(10);
        assertEquals(40, produto.getQuantidade());
    }
}
