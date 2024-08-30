package com.aptota.librarysystem.bootstrap;

import com.aptota.librarysystem.model.Author;
import com.aptota.librarysystem.model.Book;
import com.aptota.librarysystem.model.Publisher;
import com.aptota.librarysystem.repository.AuthorRepository;
import com.aptota.librarysystem.repository.BookRepository;
import com.aptota.librarysystem.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootstrapApplication implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------Bootstrap Application--------------");
        Book java = Book.builder()
                .title("Java Complete Reference")
                .isbn("IS19202345")
                .build();
        Author amit = Author.builder()
                .firstName("Amit")
                .lastName("Choudhary")
                .build();
        Book javaSaveBook = bookRepository.save(java);
        Author authorAmit = authorRepository.save(amit);
        authorAmit.getBooks().add(javaSaveBook);


        Book react = Book.builder()
                .title("React programming")
                .isbn("IS02487545")
                .build();


        Author ajeet = Author.builder()
                .firstName("Ajeet")
                .lastName("Kumar")
                .build();

        Book reactSavedBook = bookRepository.save(react);
        Author ajeetSavedAuthor = authorRepository.save(ajeet);
        ajeetSavedAuthor.getBooks().add(reactSavedBook);


        Publisher alephBookCompany = Publisher.builder()
                .name("Aleph Book Company")
                .address("New Delhi 110042")
                .build();
        Publisher savePublisher = publisherRepository.save(alephBookCompany);

        javaSaveBook.setPublisher(savePublisher);
        reactSavedBook.setPublisher(savePublisher);

        authorRepository.save(authorAmit);
        authorRepository.save(ajeetSavedAuthor);
        bookRepository.save(javaSaveBook);
        bookRepository.save(reactSavedBook);

        System.out.println("Book count : "+bookRepository.count());
        System.out.println("Author count : "+authorRepository.count());
        System.out.println("Publisher count : "+publisherRepository.count());

    }
}
