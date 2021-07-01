package com.example.demo.Controllet;


import com.example.demo.Intern.Intern;
import com.example.demo.Repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class InternController {

    @Autowired
    private InternRepository intRep;

    @PostMapping("/addIntern")
    public String addIntern(@RequestBody Intern intern){
        intRep.save(intern);
        return "Интерн принят на работу"+intern.getId();
    }

    @GetMapping("/findIntern")
    public List<Intern> findIntern(){
        return intRep.findAll();
    }

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
}
