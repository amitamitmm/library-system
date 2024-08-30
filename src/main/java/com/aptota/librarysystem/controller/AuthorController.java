package com.aptota.librarysystem.controller;


import com.aptota.librarysystem.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @GetMapping("/authors")
    public String findAllAuthors(Model model){
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }

}
