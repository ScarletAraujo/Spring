package ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String nome;
	
	@NotNull
	@Size(min = 5, max = 10)
	private String usuario;
	
	@NotNull
	@Size(min = 5)
	private String senha;
	
	@NotNull
	private boolean vendedor;
	
	
	public long getId() {
	return id;
	}
	public void setId(long id) {
	this.id = id;
	}
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public String getUsuario() {
	return usuario;
	}
	public void setUsuario(String usuario) {
	this.usuario = usuario;
	}
	public String getSenha() {
	return senha;
	}

	public void setSenha(String senha) {
	this.senha = senha;
	}
	public boolean isVendedor() {
	return vendedor;
	}
	public void setVendedor(boolean vendedor) {
	this.vendedor = vendedor;
	}
	

}
