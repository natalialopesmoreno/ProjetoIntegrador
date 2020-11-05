package br.DreamTeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.DreamTeam.model.PostagemModel;

public interface PostagemRepository extends JpaRepository<PostagemModel, Long> 
{

}
