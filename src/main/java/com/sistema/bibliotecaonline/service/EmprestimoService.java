package com.sistema.bibliotecaonline.service;

import com.sistema.bibliotecaonline.model.EmprestimoModel;
import com.sistema.bibliotecaonline.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    @Autowired
    EmprestimoRepository emprestimoRepository;

    public EmprestimoModel registrarEmprestimo(EmprestimoModel emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }
}
