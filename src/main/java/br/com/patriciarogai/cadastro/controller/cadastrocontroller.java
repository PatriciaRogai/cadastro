package br.com.patriciarogai.cadastro.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController //indica que é uma controller
public class cadastrocontroller {

    @PostMapping(value = "/login", consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}) //postmapping precisa de uma rota
    public ResponseEntity cadastro(@RequestBody ControllerRequest controllerRequest) {

        return ResponseEntity.ok(controllerRequest);


    }

}
