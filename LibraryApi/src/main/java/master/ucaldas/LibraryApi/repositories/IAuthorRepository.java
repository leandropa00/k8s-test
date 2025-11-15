package master.ucaldas.LibraryApi.repositories;

import master.ucaldas.LibraryApi.models.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepository extends JpaRepository<Author, Long> {
}
