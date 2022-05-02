package com.dia20.lectura21.Controller;

import com.dia20.lectura21.Controller.Service.AutoService;
import com.dia20.lectura21.Model.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AutoController {

    @Autowired
    private AutoService as;


    @GetMapping
    public String getAllAutos(Model model){
        model.addAttribute("autos", as.getAllAutos());
        return "index";
    }

    @GetMapping("/create")
    public String showFormAuto(Model model) {
        Auto auto = new Auto();
        model.addAttribute("auto", auto);
        return "CreateAuto";
    }

    @PostMapping("/create")
    public String saveAuto(@ModelAttribute("auto") Auto auto) {
        if(auto.getId() == 0) as.saveAuto(auto);

        return "redirect:/";
    }


}