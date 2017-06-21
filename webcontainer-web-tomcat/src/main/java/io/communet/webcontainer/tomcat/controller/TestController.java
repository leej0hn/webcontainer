package io.communet.webcontainer.tomcat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/01/11
 * <p>Version: 1.0
 */
@RestController
public class TestController {

    @GetMapping("/page/test")
    public ModelAndView testPage() {
        String test = "Test Page , hello world ";
        System.out.println(test);
        return new ModelAndView("testPage","test",test);
    }

}
