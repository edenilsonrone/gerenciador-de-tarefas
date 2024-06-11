package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Tarefa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TarefaController {

    @GetMapping("/listaTarefas")
    public String listaTarefas(Model model) {
        List<Tarefa> tarefas = Arrays.asList(
                new Tarefa(1, "Estudar Thymeleaf", true),
                new Tarefa(2, "Desenvolver aplicação Spring Boot", false),
                new Tarefa(3, "Revisar código", false)
        );
        model.addAttribute("tarefas", tarefas);
        return "listaTarefas";
    }
}
