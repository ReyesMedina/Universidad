package dev.rmpedro.apirest.services;

import dev.rmpedro.apirest.models.entities.Aula;
import dev.rmpedro.apirest.enums.Pizarron;

public interface AulaDAO extends GenericoDAO<Aula>{

    Iterable<Aula> findAulaByPizarronEquals(Pizarron pizarron);
    Iterable<Aula> findAulaByPabellonNombre(String nombrePabellon);
    Iterable<Aula> findAulaByNumeroAulaEquals(Integer numeroAula);
    Aula actualizar(Aula aulaEncontrada, Aula aulaNueva);



}
