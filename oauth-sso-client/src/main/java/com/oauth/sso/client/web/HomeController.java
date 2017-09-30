package com.oauth.sso.client.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by david100gom on 2017. 9. 30.
 *
 * Github : https://github.com/david100gom
 */
@Controller
public class HomeController {
    //
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        //
        return "index";
    }
}