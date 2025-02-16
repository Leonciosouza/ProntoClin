package com.application.SpringProntoClin.repository;

import com.application.SpringProntoClin.domain.PlanoTratamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoTratamentoRepository extends JpaRepository<PlanoTratamento, Long>{
    
}
