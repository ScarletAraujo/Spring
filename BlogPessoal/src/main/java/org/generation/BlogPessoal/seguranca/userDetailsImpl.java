package org.generation.BlogPessoal.seguranca;

import java.util.Collection;
import java.util.List;

import org.generation.BlogPessoal.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class userDetailsImpl implements UserDetails{

	private static final long serialVersionUID=1L;
	
	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;
	
	public userDetailsImpl (Usuario user) {
		this.userName= user.getUsuario();
		this.password= user.getSenha();
	}
	
	public userDetailsImpl() {} 
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
