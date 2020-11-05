package br.DreamTeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.DreamTeam.model.TemaModel;

public interface TemaRepository extends JpaRepository<TemaModel, Long> {

}
