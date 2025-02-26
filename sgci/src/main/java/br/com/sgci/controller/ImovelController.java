package br.com.sgci.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("imoveis")
public class ImovelController {
    @GetMapping
    public ResponseEntity<String> findAll(){
        return ResponseEntity.ok("Ola mundo");
    }
}
