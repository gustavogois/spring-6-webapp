package goisstudy.springframework.spring6webapp.services;

import goisstudy.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
