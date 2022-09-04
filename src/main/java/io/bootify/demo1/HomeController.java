package io.bootify.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "<a href='swagger-ui/index.html#/joke-resource/getAllJokes'>Swagger: Get All Jokes</a>";
    }

}
