package com.sistema.bibliotecaonline.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "emprestimo")
public class EmprestimoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmprestimo;

    private Date dataEmprestimo;
    private Date dataDevolucao;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;

    @ManyToMany
    @JoinColumn(name = "exemplar_id")
    private List<ExemplarModel> exemplares;
}
