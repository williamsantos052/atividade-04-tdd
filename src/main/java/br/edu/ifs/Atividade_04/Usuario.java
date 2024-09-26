package br.edu.ifs.Atividade_04;

// Definição dos níveis de acesso
enum NivelAcesso {
    ADMIN,
    USUARIO
}

public class Usuario {

    // Atributos
    private String nome;
    private String senha;
    private NivelAcesso nivelAcesso;

    // Construtor
    public Usuario(String nome, String senha, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    // Método para verificar se o usuário pode modificar o estoque
    public boolean podeModificarEstoque() {
        return this.nivelAcesso == NivelAcesso.ADMIN;
    }

    // Métodos getters e setters (se necessário)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
