package ru.itsjava.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itsjava.domain.Notebook;
import ru.itsjava.service.NotebookService;

@RestController
@RequiredArgsConstructor
public class NotebookRestController {
    private final NotebookService notebookService;

    @GetMapping("/rest")
    public Notebook get(@RequestParam(value = "id", defaultValue = "1") long id) {
        return notebookService.findById(id);
    }
}
