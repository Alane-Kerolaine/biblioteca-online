package com.sistema.bibliotecaonline.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class EmprestimoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmprestimo;

    private Date dataEmprestimo;
    private Date dataDevolucao;
    @OneToMany
    private List<ExemplarModel> exemplar;
    @OneToOne
    private ClienteModel cliente;
}
