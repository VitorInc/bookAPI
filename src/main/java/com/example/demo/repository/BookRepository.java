package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BookEntity;

@Repository
public interface BookRepository extends PagingAndSortingRepository<BookEntity, Long> {

}
