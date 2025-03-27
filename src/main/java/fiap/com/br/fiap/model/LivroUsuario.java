// Caso a recomendação de livros não seja necessária, você pode remover a classe LivroUsuario por enquanto.
package fiap.com.br.fiap.model;

import java.util.HashSet;
import java.util.Set;

public class LivroUsuario {
    private Usuario usuario;
    private Set<LivrosEnum> livrosRecomendados;

    public LivroUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.livrosRecomendados = new HashSet<>();
    }

    // Método para recomendar livros com base nos gêneros preferidos do usuário (removido por enquanto)
    public void recomendarLivros() {
        livrosRecomendados.clear();
        for (LivrosEnum livroEnum : LivrosEnum.values()) {
            if (usuario.getGenerosPreferidos().contains(livroEnum.getLivro().getGeneroum())) {
                livrosRecomendados.add(livroEnum);
            }
        }
    }

    // Método para exibir as recomendações (removido por enquanto)
    public void exibirRecomendacoes() {
        System.out.println("Recomendações para " + usuario.getNome() + ":");
        for (LivrosEnum livroEnum : livrosRecomendados) {
            System.out.println(livroEnum.getLivro());
        }
    }
}
