package dev.rmpedro.apirest.services;

import dev.rmpedro.apirest.models.entities.Aula;
import dev.rmpedro.apirest.enums.Pizarron;
import dev.rmpedro.apirest.repositories.AulaRepository;
import org.springframework.stereotype.Service;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO{


	public AulaDAOImpl(AulaRepository repository) {
		super(repository);
	}

	@Override
	public Iterable<Aula> findAulaByPizarronEquals(Pizarron pizarron) {
		return repository.findAulaByPizarronEquals(pizarron);
	}

	@Override
	public Iterable<Aula> findAulaByPabellonNombre(String nombrePabellon) {
		return repository.findAulaByPabellonNombre(nombrePabellon);

	}

	@Override
	public Iterable<Aula> findAulaByNumeroAulaEquals(Integer numeroAula) {
		return repository.findAulaByNumeroAulaEquals(numeroAula);
	}


}
