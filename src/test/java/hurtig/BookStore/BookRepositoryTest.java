package hurtig.BookStore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import hurtig.BookStore.domain.Book;
import hurtig.BookStore.domain.BookRepository;
import hurtig.BookStore.domain.Category;
/*
@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

	@Autowired
	private BookRepository repository;
	
	@Test
	public void findByTitleShouldReturnBook() {
		List<Book> books = repository.findByTitle("Tuntematon sotilas");
		
		assertThat(books).hasSize(1);
		assertThat(books.get(0).getAuthor()).isEqualTo("Väinö Linna");
	}
	
	@Test
	public void createNewBook() {
		Book book = new Book("Älä käy yöhön yksin", "Kjell Westö", 2010, "145876-876", 20.99, new Category("Draama"));
		repository.save(book);
		assertThat(book.getId()).isNotNull();
	}
	
}
*/