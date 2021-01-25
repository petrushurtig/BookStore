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

@SpringBootApplication
public class BookStoreApplication {
	
	private static final Logger log = LoggerFactory.getLogger(BookStoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			log.info("save a couple of books");
			crepository.save(new Category("Sota"));
			crepository.save(new Category("Historia"));
			crepository.save(new Category("Tieto"));
			
			repository.save(new Book("Tuntematon sotilas", "Väinö Linna", 1954, "123-131313", 19.99, crepository.findByName("Sota").get(0)));
			repository.save(new Book("Leijat Helsingin yllä", "Kjell Westö", 1996, "333-333222", 15.5, crepository.findByName("Historia").get(0)));
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
		};
	}

}
