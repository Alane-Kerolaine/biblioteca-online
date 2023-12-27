package com.sistema.bibliotecaonline.controller;

import com.sistema.bibliotecaonline.model.ClienteModel;
import com.sistema.bibliotecaonline.model.ExemplarModel;
import com.sistema.bibliotecaonline.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/cadastrar-cliente")
    public ResponseEntity<ClienteModel> cadastrarCliente(@RequestBody ClienteModel cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.cadastrarCliente(cliente));
    }

    @GetMapping("listar-clientes")
    public ResponseEntity<List<ClienteModel>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.listarTodos());
    }

    @DeleteMapping("deletar-cliente")
    public ResponseEntity<Void> deletarExemplar(@RequestParam Long id){
        clienteService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }
}
