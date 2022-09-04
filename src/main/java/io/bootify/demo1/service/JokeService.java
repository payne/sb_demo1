package io.bootify.demo1.service;

import io.bootify.demo1.domain.Book;
import io.bootify.demo1.model.BookDTO;
import io.bootify.demo1.repos.BookRepository;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class JokeService {

    public String findAll() {
        return "{ \"demo\": \"this is demo.\" }";
    }

}
