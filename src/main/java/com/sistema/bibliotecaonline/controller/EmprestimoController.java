package com.sistema.bibliotecaonline.controller;

import com.sistema.bibliotecaonline.model.EmprestimoModel;
import com.sistema.bibliotecaonline.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @Autowired
    EmprestimoService emprestimoService;

    @PostMapping("/registrar-emprestimo")
    public ResponseEntity<EmprestimoModel> registrarEmprestimo(@RequestBody EmprestimoModel emprestimo){
        return ResponseEntity.status(HttpStatus.CREATED).body(emprestimoService.registrarEmprestimo(emprestimo));
    }
}
