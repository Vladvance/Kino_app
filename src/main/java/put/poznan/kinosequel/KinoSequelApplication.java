package put.poznan.kinosequel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import put.poznan.kinosequel.model.Director;
import put.poznan.kinosequel.model.Film;
import put.poznan.kinosequel.model.FilmPK;
import put.poznan.kinosequel.repository.DirectorRepository;
import put.poznan.kinosequel.repository.FilmRepository;

import java.util.Optional;

@SpringBootApplication
public class KinoSequelApplication {

    private static final Logger log = LoggerFactory.getLogger(KinoSequelApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(KinoSequelApplication.class, args);
    }

    @Configuration
    @EnableJpaRepositories({"put.poznan.kinosequel.repository"})
    public class JPAConfig {}


    @Bean
    public CommandLineRunner clr(FilmRepository filmrep, DirectorRepository dirrep) {
        return (args) -> {

//            filmrep.save(new Film("Best sesja ever3", "2020", "H23M23", d));
//            filmrep.save(new Film("Best sesja ever4", "2020", "H23M23", new Director("Some", "Body")));

            log.info("Films found with findAll():");
            log.info("-----------------------------");
            for(Film film : filmrep.findAll()) {
                log.info(film.toString());
            }
            log.info("");

            log.info("Film found with findById():");
            log.info("-----------------------------");
            Optional<Film> film = filmrep.findById(new FilmPK("Best sesja ever", "2020"));
            log.info(film.toString());
            log.info("");

            log.info("Film found with findByProductionYear():");
            log.info("-----------------------------");
            filmrep.findByProductionYear("2020").forEach(movie -> log.info(movie.toString()));
            log.info("");
        };
    }

}
