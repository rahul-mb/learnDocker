package org.learn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/learnDocker")
public class HelloController {

    @GetMapping("/hi")
    public ResponseEntity<String> staticResponse(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }
}
