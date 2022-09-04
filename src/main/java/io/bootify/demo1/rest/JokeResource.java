package io.bootify.demo1.rest;

import io.bootify.demo1.model.BookDTO;
import io.bootify.demo1.service.BookService;
import io.bootify.demo1.service.JokeService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping(value = "/api/jokes", produces = MediaType.APPLICATION_JSON_VALUE)
public class JokeResource {

    private final JokeService bookService;

    public JokeResource(final JokeService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<String> getAllJokes() {
        try {
            return ResponseEntity.ok(bookService.findAll());
        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}
