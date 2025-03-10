package fiap.com.br.fiap.model;

import java.time.LocalDate;

public class Book {
    private Long id;
    private String nome; 
    private LocalDate data;
    private String autor;
    private String generoum;

    public Book(Long id, String nome, LocalDate data, String autor, String generoum) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.autor = autor;
        this.generoum = generoum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGeneroum() {
        return generoum;
    }

    public void setGeneroum(String generoum) {
        this.generoum = generoum;
    }

    


    
}
