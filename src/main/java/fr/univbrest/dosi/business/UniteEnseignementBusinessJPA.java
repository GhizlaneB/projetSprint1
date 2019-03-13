package fr.univbrest.dosi.business;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.repository.UniteEnseignementRepository;

@Service
public class UniteEnseignementBusinessJPA implements UniteEnseignementBusiness{

	UniteEnseignementRepository uniteEnseignementRepository;
	
	@Autowired
	public UniteEnseignementBusinessJPA(UniteEnseignementRepository repo){
		
		this.uniteEnseignementRepository = repo;
	}
	
	@Override
	public List<UniteEnseignement> recupererTousLesUniteEnseignement(){
		return (List<UniteEnseignement>) uniteEnseignementRepository.findAll();
	}
	@Override
	public List<UniteEnseignement> rechercheUniteEnseignementParSemestre(String semestre){
		return uniteEnseignementRepository.findBySemestre(semestre);
	}
	@Override
	public List<UniteEnseignement> rechercheUniteEnseignementParNoEnseignant(long noEnseignant){
		return uniteEnseignementRepository.findByEnseignant(noEnseignant);
	}
	
	@Override
	public List<UniteEnseignement> rechercheUniteEnseignementParCodeFormation(String codeFormation){
		return uniteEnseignementRepository.findByFormation(codeFormation);
	}
	
}
