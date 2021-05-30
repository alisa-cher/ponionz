package fr.simplon.ponionz.controllers;
import fr.simplon.ponionz.domain.dtos.LoanCreate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class LoanController {
    @PostMapping("/loans")
    public void create(@Valid @RequestBody LoanCreate dto) {
        System.out.println(dto);
    }
}
