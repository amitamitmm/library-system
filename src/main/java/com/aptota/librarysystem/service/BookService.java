package com.aptota.librarysystem.service;

import com.aptota.librarysystem.model.Book;

public interface BookService {

    Iterable<Book> findAll();

}
