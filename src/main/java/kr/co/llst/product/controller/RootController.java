package kr.co.llst.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class RootController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(){

        return "index";
    }

}
