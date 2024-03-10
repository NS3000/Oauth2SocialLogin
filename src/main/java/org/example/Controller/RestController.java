package org.example.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Hello form App.");
    }

    @GetMapping("/user")
    public ResponseEntity<String> user(Principal principal){
        return  ResponseEntity.ok(principal.toString());
    }

}
