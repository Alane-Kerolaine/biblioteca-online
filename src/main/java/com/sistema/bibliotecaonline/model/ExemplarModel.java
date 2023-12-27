package com.sistema.bibliotecaonline.model;

import com.sistema.bibliotecaonline.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class ExemplarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @NotBlank
    String titulo;
    @NotBlank
    String autor;
    @NotBlank
    String editora;
    String anoPublicacao;
    String edicao;
    String codigo;
    Status status;
}
