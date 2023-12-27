package com.sistema.bibliotecaonline.controller;

import com.sistema.bibliotecaonline.model.ExemplarModel;
import com.sistema.bibliotecaonline.service.ExemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exemplares")
public class ExemplarController {

    @Autowired
    ExemplarService exemplarService;

    @PostMapping("/cadastrar-exemplar")
    public ResponseEntity<ExemplarModel> cadastrarExemplar(@RequestBody ExemplarModel exemplar){
        return ResponseEntity.status(HttpStatus.CREATED).body(exemplarService.cadastrarExemplar(exemplar));
    }

    @GetMapping("listar-exemplares")
    public ResponseEntity<List<ExemplarModel>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(exemplarService.listarTodos());
    }

    @DeleteMapping("deletar-exemplar")
    public ResponseEntity<Void> deletarExemplar(@RequestParam Long id){
        exemplarService.deletarExemplar(id);
        return ResponseEntity.noContent().build();
    }
}
