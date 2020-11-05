package br.DreamTeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.DreamTeam.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> 
{

}
