package br.DreamTeam.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Postagem")
public class PostagemModel 
{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_postagem;
	
	//CHAVES ESTRANGEIRAS
	@ManyToOne
	@NotNull
	@Column
	private UsuarioModel usuario;
	
	@ManyToOne
	@NotNull
	@Column
	private TemaModel tema;
	
	@OneToMany(mappedBy = "ComentarioModel", fetch = FetchType.EAGER)
	private List<ComentarioModel> comentarios;
	
	
	
	@Column
	@NotNull
	private String titulo;
	
	@Column
	@NotNull
	private String artigo;//VERIFICAR SE NÃO TEM NENHUM TIPO TEXT
	
	
	@Column
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date data;
	
	@Column
	private Boolean curtir;
	
	
	//GETTERS AND SETTERS

	public Long getId_postagem() {
		return Id_postagem;
	}

	public void setId_postagem(Long id_postagem) {
		Id_postagem = id_postagem;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public TemaModel getTema() {
		return tema;
	}

	public void setTema(TemaModel tema) {
		this.tema = tema;
	}

	public List<ComentarioModel> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<ComentarioModel> comentarios) {
		this.comentarios = comentarios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Boolean getCurtir() {
		return curtir;
	}

	public void setCurtir(Boolean curtir) {
		this.curtir = curtir;
	} 
	
	
	//GETTERS AND SETTERS
	
	
	
	/*
	
	`curtir` BOOLEAN NOT NULL,
	 */
}