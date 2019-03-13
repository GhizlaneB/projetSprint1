package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Candidat;

public interface CandidatBusiness {
	Candidat rechercheCandidatParID(String id);
	List<Candidat> recupererTousLesCandidats();
}