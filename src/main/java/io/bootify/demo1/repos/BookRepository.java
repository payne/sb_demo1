package io.bootify.demo1.repos;

import io.bootify.demo1.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
