package com.aptota.librarysystem.controller;

import com.aptota.librarysystem.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public String findAllBooks(Model model){
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

}
