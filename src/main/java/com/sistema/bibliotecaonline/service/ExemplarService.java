package com.sistema.bibliotecaonline.service;

import com.sistema.bibliotecaonline.model.ExemplarModel;
import com.sistema.bibliotecaonline.repository.ExemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExemplarService {

    @Autowired
    ExemplarRepository exemplarRepository;


    public ExemplarModel cadastrarExemplar(ExemplarModel exemplar){
        return exemplarRepository.save(exemplar);
    }

    public List<ExemplarModel> listarTodos(){
        return exemplarRepository.findAll();
    }

    public Void deletarExemplar(Long id) {
        exemplarRepository.deleteById(id);
        return null;
    }
}
