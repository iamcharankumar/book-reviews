package net.project.bookreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.project.bookreview.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
