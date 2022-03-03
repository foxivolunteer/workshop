package com.example.testservice.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@AllArgsConstructor
@RestController
@Slf4j
public class Controller {

  @GetMapping("/v1/test")
  public ResponseEntity<String> placeOrder(
    @RequestHeader Map<String, String> headers) {
    headers.forEach((key, value) -> {
      log.debug("secured endpoint worked!");
      log.info(String.format("Header '%s' = %s", key, value));
    });
    return ResponseEntity.ok("Ok");
  }

  @GetMapping("/v1/test2")
  public ResponseEntity<String> test2(
    @RequestHeader Map<String, String> headers) {
    headers.forEach((key, value) -> {
      log.info(String.format("Header '%s' = %s", key, value));
    });
    return ResponseEntity.ok("Ok2");
  }
}

