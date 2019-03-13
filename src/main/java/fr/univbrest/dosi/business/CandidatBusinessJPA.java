package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Candidat;
import fr.univbrest.dosi.repository.CandidatRepository;

@Service
public class CandidatBusinessJPA implements CandidatBusiness {

	CandidatRepository candidatRepo;
	@Autowired
	public CandidatBusinessJPA(CandidatRepository repos) {
		this.candidatRepo = repos;
	}
	
	@Override
	public List<Candidat> recupererTousLesCandidats() {
		return (List<Candidat>) candidatRepo.findAll();
	}

	@Override
	public Candidat rechercheCandidatParID(String id) {
		return candidatRepo.findOne(id);
	}

}
