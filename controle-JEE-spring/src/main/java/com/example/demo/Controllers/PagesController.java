package com.example.demo.Controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Livre;
import com.example.demo.service.LivreService;
 
@RestController
@RequestMapping("/emsi_api/livres")
public class PagesController {
@Autowired
    private LivreService service;
 
    @GetMapping("/List")
    public List<Livre> getAll(){
        return service.listAll();
    }
 
   @GetMapping("/{id}")
    public Livre getLivre(@PathVariable(name = "id") long id) {
    	return service.get(id);
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveLivre(@ModelAttribute("Livre") Livre lvr) {
        service.save(lvr);
        return "redirect:/";
    }
 
    @PutMapping("/edit/{id}")
    public Livre edit(@PathVariable(name = "id") long id,@RequestBody Livre l) {
        return service.edit(id,l);
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteLivre(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
    
    @PostMapping
    public Livre create(@RequestBody Livre livre) {
    	return service.create(livre);
    }
}