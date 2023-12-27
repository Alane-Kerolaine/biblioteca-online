package com.sistema.bibliotecaonline.controller;

import com.sistema.bibliotecaonline.model.ExemplarModel;
import com.sistema.bibliotecaonline.service.ExemplarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class ExemplarController {

    @Autowired
    ExemplarService exemplarService;

    public ResponseEntity<ExemplarModel> cadastrarExemplar(ExemplarModel exemplar){
        return ResponseEntity.status(HttpStatus.CREATED).body(exemplarService.cadastrarExemplar(exemplar));
    }

    public ResponseEntity<List<ExemplarModel>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(exemplarService.listarTodos());
    }

    public ResponseEntity<Void> deletarExemplar(Long id){
        return ResponseEntity.status(HttpStatus.OK).body(exemplarService.deletarExemplar(id));
    }
}
