package fiap.com.br.fiap.model;

import java.time.LocalDate;

public enum LivrosEnum {
    SENHOR_DOS_ANEIS(1L, "O Senhor dos Anéis", LocalDate.of(1954, 7, 29), "J.R.R. Tolkien", "Fantasia"),
    HARRY_POTTER(2L, "Harry Potter", LocalDate.of(1997, 6, 26), "J.K. Rowling", "Fantasia"),
    DOM_CASMURRO(3L, "Dom Casmurro", LocalDate.of(1899, 1, 1), "Machado de Assis", "Drama"),
    CODIGO_DA_VINCI(4L, "O Código da Vinci", LocalDate.of(2003, 3, 18), "Dan Brown", "Mistério"),
    IT_A_COISA(5L, "It: A Coisa", LocalDate.of(1986, 9, 15), "Stephen King", "Terror");

    private final Book livro;

    LivrosEnum(Long id, String nome, LocalDate data, String autor, String genero) {
        this.livro = new Book(id, nome, data, autor, genero);
    }

    public Book getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return livro.getNome() + " - " + livro.getAutor() + " (" + livro.getGeneroum() + ")";
    }
}
