package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Livre;
import com.example.demo.repository.LivreRepository;


@Service
public class LivreService {
	
	@Autowired
	LivreRepository repo;
	
 	public List<Livre> listAll(){
		return repo.findAll();
	}
	public void save(Livre lvr) {
		repo.save(lvr);
	}
    public Livre get (long id) {
    	return repo.findById(id).get();

    }
    public void delete(long id) {
    	repo.deleteById(id);
    }
    public Livre create(Livre livre) {
    	return repo.save(livre);
    }
    public Livre edit(long id,Livre livre) {
    	
    	livre =repo.findById(id).get();
      if(livre!=null)
       {
      	livre.setId(id);
      	return repo.save(livre);
    	}
      return  null;
    }
    
    
}