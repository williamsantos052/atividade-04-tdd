package br.edu.ifs.Atividade_04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testCadastrarProduto() {
        Produto produto = new Produto("Camiseta", "Camiseta de algodão", 50, 19.99, "2024-12-31");
        assertNotNull(produto);
        assertEquals("Camiseta", produto.getNome());
        assertEquals(50, produto.getQuantidade());
    }
}
