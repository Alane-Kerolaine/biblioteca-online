package com.sistema.bibliotecaonline.repository;

import com.sistema.bibliotecaonline.model.ExemplarModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExemplarRepository extends JpaRepository<ExemplarModel, Long>{

}
