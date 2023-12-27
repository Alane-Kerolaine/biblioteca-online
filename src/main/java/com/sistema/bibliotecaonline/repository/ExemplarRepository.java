package com.sistema.bibliotecaonline.repository;

import com.sistema.bibliotecaonline.model.ExemplarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExemplarRepository extends JpaRepository<ExemplarModel, Long>{

}
