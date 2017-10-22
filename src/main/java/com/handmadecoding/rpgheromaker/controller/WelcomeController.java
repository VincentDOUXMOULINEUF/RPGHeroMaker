/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handmadecoding.rpgheromaker.controller;

import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Vincent
 */
@Controller
public class WelcomeController {
    
    private final static String INDEX = "index";
    private final static Logger LOGGER = Logger.getLogger(WelcomeController.class.getName());
    
    @RequestMapping(value ="/index", method = RequestMethod.GET)
    public ModelAndView welcome(){
        LOGGER.info("Je suis rentré");
        return new ModelAndView(INDEX);
    }
    
}
