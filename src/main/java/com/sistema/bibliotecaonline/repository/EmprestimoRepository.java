package com.sistema.bibliotecaonline.repository;

import com.sistema.bibliotecaonline.model.EmprestimoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoModel, Long> {
}
