package br.usjt.Veiculos.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.Veiculos.model.bean.Veiculos;
import br.usjt.Veiculos.model.repository.VeiculosRepository;

@Service
public class VeiculosService {
	@Autowired
	private VeiculosRepository veiculosRepo;
		public void salvar (Veiculos veiculos) {
			veiculosRepo.save(veiculos);
	}
	public List <Veiculos> listarTodos (){
		return veiculosRepo.findAll();
	}
}

