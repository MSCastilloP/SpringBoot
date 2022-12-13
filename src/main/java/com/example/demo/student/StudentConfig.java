package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "miriam",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "miriam.jamal@gmail.com");
            Student manuel = new Student(
                    "Manuel",
                    LocalDate.of(1999, Month.SEPTEMBER, 30),
                    "Manuel@gmail.com");
            List list = new ArrayList();
            list.add(manuel);
            list.add(mariam);
            repository.saveAll(list);

        };


    }


}
