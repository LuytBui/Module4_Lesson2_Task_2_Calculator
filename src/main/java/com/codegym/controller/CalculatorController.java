package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @GetMapping("/cal")
    public String showIndex(){
        return "index";
    }

    public ModelAndView displayCalculateResult(String expression) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("expression", expression);
        return modelAndView;
    }

    @PostMapping(value="/cal", params = "addition")
    public ModelAndView doAddition(@RequestParam double firstOperand,
                                   @RequestParam double secondOperand){
        String operator = " + ";
        double result = firstOperand + secondOperand;
        String expression = "" + firstOperand + operator + secondOperand + " = " + result;
        return displayCalculateResult(expression);
    }

    @PostMapping(value="/cal", params = "subtraction")
    public ModelAndView doSubtraction(@RequestParam double firstOperand,
                                   @RequestParam double secondOperand){
        String operator = " - ";
        double result = firstOperand - secondOperand;
        String expression = "" + firstOperand + operator + secondOperand + " = " + result;
        return displayCalculateResult(expression);
    }
    @PostMapping(value="/cal", params = "multiplication")
    public ModelAndView doMultiplication(@RequestParam double firstOperand,
                                   @RequestParam double secondOperand){
        String operator = " * ";
        double result = firstOperand * secondOperand;
        String expression = "" + firstOperand + operator + secondOperand + " = " + result;
        return displayCalculateResult(expression);
    }
    @PostMapping(value="/cal", params = "division")
    public ModelAndView doDivision(@RequestParam double firstOperand,
                                   @RequestParam double secondOperand){
        String operator = " / ";
        double result = firstOperand / secondOperand;
        String expression = "" + firstOperand + operator + secondOperand + " = " + result;
        return displayCalculateResult(expression);
    }
}
