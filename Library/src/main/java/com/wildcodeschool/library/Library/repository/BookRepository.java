package com.wildcodeschool.library.Library.repository;

import com.wildcodeschool.library.Library.entity.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingOrDescriptionContaining(String title, String description);
}
