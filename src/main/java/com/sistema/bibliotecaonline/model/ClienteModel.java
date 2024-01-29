package com.sistema.bibliotecaonline.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;

    private String nome;
    private LocalDate dataNascimento;
    private int idade;
    private String telefone;

}
