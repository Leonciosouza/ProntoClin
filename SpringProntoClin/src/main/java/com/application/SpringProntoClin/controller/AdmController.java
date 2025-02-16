package com.application.SpringProntoClin.controller;

import com.application.SpringProntoClin.DTO.RequestAdministrador;
import com.application.SpringProntoClin.domain.Administrador;
import com.application.SpringProntoClin.repository.AdmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adm")
public class AdmController {

    @Autowired
    private AdmRepository admRepository;

    @PostMapping
    public ResponseEntity<Administrador> registrarAdm(@RequestBody RequestAdministrador data){
        Administrador newAdministrador = new Administrador(data);
        admRepository.save(newAdministrador);
        System.out.println(data);
        return new ResponseEntity<>(newAdministrador,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Administrador getAdm(@PathVariable Long id) {
        return admRepository.findById(id).orElseThrow(() -> new RuntimeException("Administrador não encontrado"));
    }

    @PutMapping("/{id}")
    public Administrador updateAdm(@PathVariable Long id, @RequestBody Administrador adm) {
        Administrador administrador = admRepository.findById(id).orElseThrow(() -> new RuntimeException("Administrador não encontrado"));
        administrador.setNome(adm.getNome());
        administrador.setEmail(adm.getEmail());
        administrador.setSenha(adm.getSenha());

        return admRepository.save(administrador);

    }
}
