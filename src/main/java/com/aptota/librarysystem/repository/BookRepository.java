package com.aptota.librarysystem.repository;

import com.aptota.librarysystem.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
