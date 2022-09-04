package io.bootify.demo1.service;

import io.bootify.demo1.domain.Book;
import io.bootify.demo1.model.BookDTO;
import io.bootify.demo1.repos.BookRepository;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class JokeService {

    public String findAll() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream in = classLoader.getResourceAsStream("chuck_norris_jokes.json");
        String allJokes = new String(in.readAllBytes());
        in.close();
        return allJokes;
    }

    public String findAllOld() {
        return "{ \"demo\": \"this is demo.\" }";
    }

}
