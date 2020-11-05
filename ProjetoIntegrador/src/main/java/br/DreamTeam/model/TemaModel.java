package br.DreamTeam.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tema")
public class TemaModel 
{
	//ID
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_tema;
	
	//CHAVE ESTRANGEIRA
	@OneToMany(mappedBy = "PostagemModel", fetch = FetchType.EAGER)
	private List<PostagemModel> postagem;
	
	@Column
	private Integer quantidade;
	@Column
	private String nome;
	@Column
	private String descricao;
	
	//GETTERS AND SETTERS
	public Long getId_tema() {
		return Id_tema;
	}
	
	public void setId_tema(Long id_tema) {
		Id_tema = id_tema;
	}
	public List<PostagemModel> getPostagem() {
		return postagem;
	}
	public void setPostagem(List<PostagemModel> postagem) {
		this.postagem = postagem;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
	
}
