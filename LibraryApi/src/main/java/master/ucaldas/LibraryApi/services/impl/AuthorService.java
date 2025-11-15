package master.ucaldas.LibraryApi.services.impl;

import lombok.RequiredArgsConstructor;
import master.ucaldas.LibraryApi.models.entity.Author;
import master.ucaldas.LibraryApi.repositories.IAuthorRepository;
import master.ucaldas.LibraryApi.services.IAuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorService implements IAuthorService {
    private final IAuthorRepository authorRepository;

    @Override
    public List<Author> getAuthors()  {
        return this.authorRepository.findAll();
    }

    @Override
    public Optional<Author> getAuthorById(Long id) {
        return this.authorRepository.findById(id);
    }
}
