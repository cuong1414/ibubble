package org.ibubble.controller;

import org.ibubble.util.ConstantManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: CuongNM
 * Date: 11/3/13
 * Time: 4:57 PM
 */
@Controller
@RequestMapping("")
public class HomeController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String navigateHomepage() {
        // Navigate to store information tab.
        return "redirect:/web";
    }
}
