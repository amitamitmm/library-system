package com.aptota.librarysystem.service.impl;

import com.aptota.librarysystem.model.Book;
import com.aptota.librarysystem.repository.BookRepository;
import com.aptota.librarysystem.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
