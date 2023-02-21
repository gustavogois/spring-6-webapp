package goisstudy.springframework.spring6webapp.services;

import goisstudy.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
