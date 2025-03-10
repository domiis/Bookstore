package fiap.com.br.fiap.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fiap.com.br.fiap.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> repository = new ArrayList<>();

    // Listar todos os livros
    @GetMapping
    public List<Book> index() {
        return repository;
    }

    // Add um novo livro
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Book> create(@RequestBody Book book) {
        System.out.println("Cadastrando Livro: " + book.getNome());
        repository.add(book);
        return ResponseEntity.status(201).body(book);
    }
    //buscar livro por id
    @GetMapping("/books/{id}")
	public ResponseEntity<Book> get(@PathVariable Long id){
		System.out.println("Buscando livro "+id);
		var book =repository.stream()
			.filter(c->c.getId().equals(id))
			.findFirst();
		if(book.isEmpty()){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(book.get());
	}
}