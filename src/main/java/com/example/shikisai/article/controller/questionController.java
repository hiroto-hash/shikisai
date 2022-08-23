package com.example.shikisai.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class questionController {
  @RequestMapping(value = "/question", method = RequestMethod.GET)
  public String questionInit(Model model) {
    return "practice/question";
  }

  
}
