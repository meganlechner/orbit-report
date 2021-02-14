package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model){
        String theGreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    //Handles requests of the form /hello?name=LaunchCode

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    public String helloWithQueryParam(@RequestParam String name, String language){
//        String languageHello;
//        if (language.equals("English")){ languageHello = "Hello "; }
//        else if (language.equals("German")){ languageHello = "Guten Tag "; }
//        else if (language.equals("French")){ languageHello = "Bonjour "; }
//        else if (language.equals("Spanish")){ languageHello = "¡Hola "; }
//        else if (language.equals("Swedish")){ languageHello = "Hej "; }
//        else { languageHello = "Howdy "; }
//        return languageHello + name + "!";
//    }

    //Handles requests of the form /hello/LaunchCode

    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model){
        String greeting = "Hello " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    //Handles requests with an actual form
    @GetMapping("form")
    public String helloForm(){

        return "form";
    }

    @GetMapping("languageForm")
    public String languageForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submits request to /hello
                "Your name: " +
                "<input type='text' name='name'>" +
                " Select your language: " +
                "<select name='language' id='language'>" +
                "<option value='English'>English</option>" +
                "<option value='German'>German</option>" +
                "<option value='French'>French</option>" +
                "<option value='Spanish'>Spanish</option>" +
                "<option value='Swedish'>Swedish</option>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("Megan");
        names.add("Nick");
        names.add("Skillet");
        model.addAttribute("names", names);
        return "hello-list";
    }

}
