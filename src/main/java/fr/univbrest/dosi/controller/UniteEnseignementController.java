package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.business.UniteEnseignementBusiness;

@RestController
@RequestMapping("/uniteEnseignement")
public class UniteEnseignementController {
	
	private UniteEnseignementBusiness uniteEnseignementBusiness;
	
	public UniteEnseignementController(UniteEnseignementBusiness business){
		this.uniteEnseignementBusiness = business;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<UniteEnseignement> recupererTousLesUniteEnseignement(){
		return uniteEnseignementBusiness.recupererTousLesUniteEnseignement();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{semestre}")
	public List<UniteEnseignement> rechercheUniteEnseignementParSemestre(@PathVariable String semestre){
		return uniteEnseignementBusiness.rechercheUniteEnseignementParSemestre(semestre);
	}
    
	@RequestMapping(method=RequestMethod.GET, value="/Enseignant/{noEnseignant}")
	public List<UniteEnseignement> rechercheUniteEnseignementParNoEnseignant(@PathVariable("noEnseignant") long noEnseignant){
		return uniteEnseignementBusiness.rechercheUniteEnseignementParNoEnseignant(noEnseignant);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/Formation/{codeFormation}")
	public List<UniteEnseignement> rechercheUniteEnseignementParNoEnseignant(@PathVariable("codeFormation") String codeFormation){
		return uniteEnseignementBusiness.rechercheUniteEnseignementParCodeFormation(codeFormation);
	}
}
