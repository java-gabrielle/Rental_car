package com.senai.infoa.rental_eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.senai.infoa.rental_eventos.models.Equipamento;

@Repository 
public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer> {
        List<Equipamento> findByMarcaContainingIgnoreCaseOrModeloContainingIgnoreCase(
            String marca,
            String modelo
    );
    
}
