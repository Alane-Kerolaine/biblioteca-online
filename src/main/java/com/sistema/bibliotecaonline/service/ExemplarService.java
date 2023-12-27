package com.sistema.bibliotecaonline.service;

import com.sistema.bibliotecaonline.enums.Status;
import com.sistema.bibliotecaonline.model.ExemplarModel;
import com.sistema.bibliotecaonline.repository.ExemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExemplarService {

    @Autowired
    ExemplarRepository exemplarRepository;


    public ExemplarModel cadastrarExemplar(ExemplarModel exemplar){
        exemplar.setStatus(Status.DISPONIVEL);
        return exemplarRepository.save(exemplar);
    }

    public List<ExemplarModel> listarTodos(){
        return exemplarRepository.findAll();
    }

    public void deletarExemplar(Long id) {
        exemplarRepository.deleteById(id);
    }
}
