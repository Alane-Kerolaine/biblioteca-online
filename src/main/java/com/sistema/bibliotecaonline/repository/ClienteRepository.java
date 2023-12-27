package com.sistema.bibliotecaonline.repository;

import com.sistema.bibliotecaonline.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
