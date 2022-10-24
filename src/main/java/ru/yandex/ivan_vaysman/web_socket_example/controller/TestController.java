package ru.yandex.ivan_vaysman.web_socket_example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  @GetMapping
  public ResponseEntity<String> test(){
    return ResponseEntity.ok("test passed!");
  }

  @GetMapping("/v2")
  public ResponseEntity<String> test2(){
    return ResponseEntity.ok("test 2 passed!");
  }
}
