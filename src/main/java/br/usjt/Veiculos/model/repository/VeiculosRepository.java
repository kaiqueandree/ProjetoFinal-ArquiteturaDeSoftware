package br.usjt.Veiculos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.Veiculos.model.bean.Veiculos;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, Long>{
}
