package com.aptota.librarysystem.service.impl;

import com.aptota.librarysystem.model.Author;
import com.aptota.librarysystem.repository.AuthorRepository;
import com.aptota.librarysystem.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
