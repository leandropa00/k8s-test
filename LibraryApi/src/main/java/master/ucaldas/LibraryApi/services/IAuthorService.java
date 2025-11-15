package master.ucaldas.LibraryApi.services;

import master.ucaldas.LibraryApi.models.entity.Author;

import java.util.List;
import java.util.Optional;

public interface IAuthorService {
    List<Author> getAuthors();
    Optional<Author> getAuthorById(Long id);
}
