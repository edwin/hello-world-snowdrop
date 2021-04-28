package com.edw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     com.edw.controller.HelloWorldController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 28 Apr 2021 12:47
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public Map index() {
        return new HashMap() {{
            put("hello", "world");
        }};
    }
}
