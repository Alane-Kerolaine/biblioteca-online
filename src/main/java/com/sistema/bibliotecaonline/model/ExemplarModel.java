package com.sistema.bibliotecaonline.model;
import com.sistema.bibliotecaonline.enums.Status;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "exemplar")
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
