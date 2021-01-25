package hurtig.BookStore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hurtig.BookStore.domain.Book;
import hurtig.BookStore.domain.BookRepository;
import hurtig.BookStore.domain.CategoryRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repository;
	@Autowired
	private CategoryRepository crepository;
	
	@RequestMapping("/booklist")
	public String bookslist(Model model) {
		model.addAttribute("books", repository.findAll());
		return "booklist";
	}
	
	@GetMapping("/index")
	public String bookForm(Model model) {
		model.addAttribute("book", new Book());
		return "books";
	}
	
	@RequestMapping(value="/add")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("categorys", crepository.findAll());
		return "addBook";
	}
	@RequestMapping(value="/edit/{id}", method= RequestMethod.GET)
	public String editBook(@PathVariable("id") Long Id, Model model) {
		model.addAttribute("book", repository.findById(Id));
		return "editBook";
	}
	@RequestMapping(value="/save", method= RequestMethod.POST)
	public String save(Book book) {
		repository.save(book);
		return "redirect:booklist";
	}
	@RequestMapping(value= "/delete/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long Id, Model model) {
		repository.deleteById(Id);
		return "redirect:/booklist";
	}
	
}
