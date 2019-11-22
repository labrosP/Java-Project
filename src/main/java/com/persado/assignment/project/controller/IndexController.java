package com.persado.assignment.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author maria
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/"})
    public String root(Model model) {
        return "index";
    }

}
