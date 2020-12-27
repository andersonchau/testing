package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {
    @RequestMapping(value = "/testing", method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    @ResponseBody
    public String testing2() {
        return "Success Helloworld!";
    }
}
