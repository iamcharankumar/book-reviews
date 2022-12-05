package net.project.bookreview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.project.bookreview.entity.Book;
import net.project.bookreview.service.BookService;

@Controller
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@GetMapping("/books")
	public String booksPage(Model model) {
		model.addAttribute("books", bookService.getAllReviews());
		return "books";
	}

	@GetMapping("/books/new")
	public String addBookReviewForm(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "new_review";
	}

	@PostMapping("/books")
	public String saveBookReview(@ModelAttribute("book") Book book) {
		bookService.saveBook(book);
		return "redirect:/books";
	}

	@GetMapping("/books/delete")
	public String deleteReviewPage(Model model) {
		model.addAttribute("books", bookService.getAllReviews());
		return "delete_books";
	}

	@GetMapping("/books/{id}")
	public String deleteBookReview(@PathVariable Long id) {
		bookService.deleteBookById(id);
		return "redirect:/books";
	}
}