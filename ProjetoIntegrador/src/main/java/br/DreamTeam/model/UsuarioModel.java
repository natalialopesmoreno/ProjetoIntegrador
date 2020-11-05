package br.DreamTeam.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class UsuarioModel 
{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_usuario;
	
	private String nome;
	private String login;
	private String senha;
	
	//CHAVES ESTRANGEIRAS
	
	@OneToMany(mappedBy = "PostagemModel", fetch = FetchType.EAGER)
	private List<PostagemModel> postagens;
	
	@OneToMany(mappedBy = "ComentarioModel", fetch = FetchType.EAGER)
	private List<ComentarioModel> comentarios;
	
	
	//GETTERS AND SETTERS
	
	public Long getId_usuario() {
		return Id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		Id_usuario = id_usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<PostagemModel> getPostagens() {
		return postagens;
	}
	public void setPostagens(List<PostagemModel> postagens) {
		this.postagens = postagens;
	}
	public List<ComentarioModel> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<ComentarioModel> comentarios) {
		this.comentarios = comentarios;
	}
	
	
	
}
