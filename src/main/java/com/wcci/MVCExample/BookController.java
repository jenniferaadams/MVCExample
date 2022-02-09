package com.wcci.MVCExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private Book book = new Book("Maus", "Art Spiegelman", "123456789", "The holocaust with mice and cats");

    @RequestMapping("/")
    public String showBookTemplate(Model model){
        model.addAttribute("book", book);
        return "BookTemplate";
    }
}
