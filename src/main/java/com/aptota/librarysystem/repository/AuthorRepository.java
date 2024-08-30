package com.aptota.librarysystem.repository;

import com.aptota.librarysystem.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
