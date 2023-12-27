package com.sistema.bibliotecaonline.controller;

import com.sistema.bibliotecaonline.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmprestimoController {

    @Autowired
    EmprestimoService emprestimoService;
}
