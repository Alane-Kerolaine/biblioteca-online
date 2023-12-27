package com.sistema.bibliotecaonline.service;

import com.sistema.bibliotecaonline.enums.Status;
import com.sistema.bibliotecaonline.model.ClienteModel;
import com.sistema.bibliotecaonline.model.ExemplarModel;
import com.sistema.bibliotecaonline.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    public ClienteModel cadastrarCliente(ClienteModel cliente){
        cliente.setIdade(calculaIdade(cliente.getDataNascimento()));
        clienteRepository.save(cliente);
        return cliente;
    }

    public List<ClienteModel> listarTodos(){
        return clienteRepository.findAll();
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public int calculaIdade(LocalDate dataNascimento){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
}
