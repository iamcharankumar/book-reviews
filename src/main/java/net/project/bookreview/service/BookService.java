package net.project.bookreview.service;

import java.util.List;

import net.project.bookreview.entity.Book;

public interface BookService {

	List<Book> getAllReviews();

	Book saveBook(Book book);

	void deleteBookById(Long id);
}