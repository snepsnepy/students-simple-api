package com.example.StudentsProject.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student snep = new Student( "Snep", "snepysneptest@gmail.com", LocalDate.of(1996, Month.APRIL, 27));
            Student snepy  = new Student( "Snepy", "snepy@gmail.com", LocalDate.of(1994, Month.APRIL, 29));

            repository.saveAll(
                    List.of(snep, snepy)
            );
        };
    }
}
