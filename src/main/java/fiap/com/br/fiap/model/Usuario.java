package fiap.com.br.fiap.model;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nome;
    private Set<String> generosPreferidos;

    public Usuario(String nome) {
        this.nome = nome;
        this.generosPreferidos = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarGeneroPreferido(String genero) {
        generosPreferidos.add(genero);
    }

    public Set<String> getGenerosPreferidos() {
        return generosPreferidos;
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + ", Gêneros Preferidos: " + generosPreferidos;
    }
}
