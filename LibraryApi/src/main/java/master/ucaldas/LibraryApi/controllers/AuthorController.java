package master.ucaldas.LibraryApi.controllers;

import lombok.RequiredArgsConstructor;
import master.ucaldas.LibraryApi.models.entity.Author;
import master.ucaldas.LibraryApi.services.IAuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/authors")
public class AuthorController {
    private final IAuthorService authorService;

    @GetMapping()
    public ResponseEntity<List<Author>> getAll(){
        return ResponseEntity.ok(this.authorService.getAuthors());
    }

    @GetMapping("/{id}")
    public ResponseEntity getAuthor(@PathVariable Long id){
        Optional<Author> author = this.authorService.getAuthorById(id);
        return author.isPresent() ? ResponseEntity.ok(author.get()) : ResponseEntity.notFound().build();
    }
}
