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
	
	
		};
	}

}
