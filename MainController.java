package com.example.springmvc.controller;

import com.example.springmvc.model.Programmer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/home")            //We can use @GetMapping//
    public String getHome(){
        return "Home.html" ;
    }
    @ModelAttribute                     //For header or text save repeatation//
    public void welcomeView (Model model){
        model.addAttribute("msg", "Welcome to Spring Learning");
    }
    /*@RequestMapping("/addCoder")       / String way /
    public String addCoders(@RequestParam int cId, @RequestParam String cName, @RequestParam String clang, Model model){


       model.addAttribute("cId",cId);
       model.addAttribute("cName",cName);
       model.addAttribute("clang",clang);
        return "CoderInfo.html" ;
    }*/

    /*@RequestMapping("/addCoder")   / Object way /
    public ModelAndView addCoders(@RequestParam int cId, @RequestParam String cName, @RequestParam String clang){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("CoderInfo.html" );
        mv.addObject("cId",cId);
        mv.addObject("cName",cName);
        mv.addObject("clang",clang);
        return mv ;
    }*/
    @PostMapping("/addCoder")   //Model create Object//
    public ModelAndView addCoders(@ModelAttribute Programmer programmer){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("CoderInfo.html" );
        return mv ;
    }
    @GetMapping("/allCoders")
    public String allCoders(Model m){

        ArrayList<Programmer> p = new ArrayList<Programmer>();
        p.add(new Programmer(1001, "Laila","java"));
        p.add(new Programmer(1002, "Labib","javascript"));
        p.add(new Programmer(1003, "Lamia","php"));

        m.addAttribute("programmers",p);

        return "AllCoders.html";
    }


}
