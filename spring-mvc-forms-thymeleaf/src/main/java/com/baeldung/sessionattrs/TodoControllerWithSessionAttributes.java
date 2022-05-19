package com.baeldung.sessionattrs;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("todos")
public class TodoControllerWithSessionAttributes {

    @GetMapping("/form")
    public String showForm(
            Model model,
            @ModelAttribute("todos") TodoList todos) {
        if (!todos.isEmpty()) {
            model.addAttribute("todo", todos.peekLast());
        } else {
            model.addAttribute("todo", new TodoItem());
        }
        return "sessionattributesform";
    }

    @PostMapping("/form")
    public String create(
            @ModelAttribute TodoItem todo, 
            @ModelAttribute("todos") TodoList todos) {
        todo.setCreateDate(LocalDateTime.now());
        todos.add(todo);
        return "sessionattributestodos";
    }

    @GetMapping("/todos")
    public String list(
            Model model, 
            @ModelAttribute("todos") TodoList todos) {
        model.addAttribute("todos", todos);
        return "sessionattributestodos";
    }

    @ModelAttribute("todos")
    public TodoList todos() {
        return new TodoList();
    }

    @GetMapping("/accessDenied")
    public String getAccessDeniedPage(){
        return "accessDenied";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }
}
