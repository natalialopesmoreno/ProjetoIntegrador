package br.DreamTeam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.DreamTeam.model.PostagemModel;
import br.DreamTeam.model.TemaModel;
import br.DreamTeam.model.UsuarioModel;

public interface PostagemRepository extends JpaRepository<PostagemModel, Long> 
{

	List<PostagemModel> findByTema(TemaModel tema);

	List<PostagemModel> findByTitulo(String titulo);

	List<PostagemModel> findByUsuario(UsuarioModel usuario);

}
