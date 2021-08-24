package com.myapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapi.domain.Usuario;
import com.myapi.repository.UsuarioRepository;
import com.myapi.services.exeptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
public Usuario findById(Integer id) {
	Optional<Usuario> obj=repository.findById(id);
	return obj.orElseThrow(()->new ObjectNotFoundException("Objeto não encontrado! id:"+ id + ",tipo"+ Usuario.class.getName()));
	
}

public List<Usuario> findByAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}
public Usuario update (Integer id,Usuario obj) {
   Usuario newObj=findById(id);
newObj.setNome(obj.getNome());
newObj.setLogin(obj.getLogin());
newObj.setSenha(obj.getSenha());
return repository.save(newObj);
}

public Usuario create(Usuario obj) {
	// TODO Auto-generated method stub
	obj.setId(null);
	return repository.save(obj);
	
	
}
public void delete (Integer id){
	findById(id);
	repository.deleteById(id);
	
}
}