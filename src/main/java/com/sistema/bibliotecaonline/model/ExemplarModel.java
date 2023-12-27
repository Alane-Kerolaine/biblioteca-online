package com.sistema.bibliotecaonline.model;

import com.sistema.bibliotecaonline.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class ExemplarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExemplar;

    private String titulo;
    private String autor;
    private String editora;
    private String anoPublicacao;
    private String edicao;
    private String codigo;
    @Enumerated(EnumType.STRING)
    private Status status;
}
