package hurtig.BookStore;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



import hurtig.BookStore.domain.Book;
import hurtig.BookStore.domain.BookRepository;
import hurtig.BookStore.domain.Category;
import hurtig.BookStore.domain.CategoryRepository;
import hurtig.BookStore.domain.Users;
import hurtig.BookStore.domain.UserRepository;

@SpringBootApplication
public class BookStoreApplication {
	
	private static final Logger log = LoggerFactory.getLogger(BookStoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository crepository, UserRepository urepository) {
		return (args) -> {
	log.info("save a couple of books");
	crepository.save(new Category("History"));
	repository.save(new Book("Da Vinci -koodi", "Dan Brown", 2003, "123-21321", 20.00, crepository.findByName("History").get(0)));
	
	Users user1 = new Users("user", "$2a$10$ikpsGY/lLQ/QmLijqYgAVO1iiS9E6HRkZ6OGeGXNevxlW.ad/O0Qa", "USER");
	Users user2 = new Users("admin", "$2a$10$z1J4xi1EA2ttoROyyzjpjOn4Mia8AHercTgjHionZVTjXy7HopoQO", "ADMIN");
	urepository.save(user1);
	urepository.save(user2);
		};
	}

}
