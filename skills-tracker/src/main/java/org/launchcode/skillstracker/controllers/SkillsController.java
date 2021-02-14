package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String possibleSkills(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list: </h1>" +
                "<ol><li>Javascript</li><li>Java</li><li>Python</li>" +
                "</body>" +
                "</html>";
    }

    @GetMapping ("form")
    public String form(){
        return "<html>" +
                "<body>" +
                "<form action='/form' method='post'>" +
                "Name: " +
                "<input type='text' name='name'>" + "<br>" +

                "My favorite language: " + "<br>" +
                "<select name='favorite' id='favorite'>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "My second favorite language: " + "<br>" +
                "<select name='secondFavorite' id='secondFavorite'>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "My third favorite language: " + "<br>" +
                "<select name='thirdFavorite' id='thirdFavorite'>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>"+
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String formReturn(@RequestParam String name, String favorite, String secondFavorite, String thirdFavorite){
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol";
    }

}
