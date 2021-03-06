package com.myapi.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


@Entity(name= "db_usuario") //INFORMA AO JPA PARA CRIAR UMA TABELA NO DB,renomear é opciona
public class Usuario implements Serializable {//daqui gera serialVersionUID
//seriazable economizar memoria na rede e quando abrir vai voltar ao formato normal

	//isso e gerado do seriazable
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message="campo NOME é mandatório")
	@Length(min=3, max= 100,message = "o nome deve ter entre 3 e 100 caracteres")//max e minimo e contem mensagem
 private String nome;
 
	@NotEmpty(message="campo LOGIN é mandatório")
	@Length(min=3, max= 100,message = "o nome deve ter entre 3 e 100 caracteres")
 private String login;
 
	@NotEmpty(message="campo SENHA é mandatório") //nao pode ser vazio e tem uma mensagem
	@Length(min=3, max= 100,message = "o nome deve ter entre 3 e 100 caracteres")
 private String senha;

//constructor da superclasse
public Usuario() {
	super();
	
}
//constructor ,serve para ser instanciado
public Usuario(Integer id, String nome, String login, String senha) {
	super();
	this.id = id;
	this.nome = nome;//se mudar aqui fica fixo,nao podera mais ser alterado e o banco de dados sempre vai gerar o mesmo nome
	this.login = login;
	this.senha = senha;
}
//getter e setter - da seriazable
//getter mostra a informaçao,o setter insere
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
//hashcode do id
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}
@Override//nao ter informaçao repetida
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Usuario other = (Usuario) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

	
	
}
