package in.dhiamokhtar.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.dhiamokhtar.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCategory" ,path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
