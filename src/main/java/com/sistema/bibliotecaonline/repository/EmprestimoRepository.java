package com.sistema.bibliotecaonline.repository;

import com.sistema.bibliotecaonline.model.EmprestimoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<EmprestimoModel, Long> {
}
