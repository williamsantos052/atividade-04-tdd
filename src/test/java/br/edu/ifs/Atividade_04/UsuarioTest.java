package br.edu.ifs.Atividade_04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testUsuarioComAcessoAdministrador() {
        Usuario admin = new Usuario("Admin", "admin123", NivelAcesso.ADMIN);
        assertTrue(admin.podeModificarEstoque());
    }

    @Test
    public void testUsuarioSemAcesso() {
        Usuario usuario = new Usuario("Usuario", "user123", NivelAcesso.USUARIO);
        assertFalse(usuario.podeModificarEstoque());
    }
}
