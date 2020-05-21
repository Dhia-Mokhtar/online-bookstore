package in.dhiamokhtar.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dhiamokhtar.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book , Long>{
	
}


