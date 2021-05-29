package com.lib.repository;

import org.springframework.data.repository.CrudRepository;

import com.lib.model.Books;

public interface BooksRepository extends CrudRepository<Books,Integer> {

}
