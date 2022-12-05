package net.project.bookreview.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.project.bookreview.entity.Book;
import net.project.bookreview.repository.BookRepository;
import net.project.bookreview.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public List<Book> getAllReviews() {
		return bookRepository.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
	}

}
