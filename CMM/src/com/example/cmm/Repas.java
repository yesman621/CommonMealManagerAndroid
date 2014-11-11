package com.example.cmm;

import java.util.ArrayList;

public class Repas {
	
	private String jour,plat,heure;
	private boolean partic;
	private ArrayList<Participant> ListPart;
	
	public Repas(String jour, String plat, String heure, boolean partic,
			ArrayList<Participant> listPart) {
		super();
		this.jour = jour;
		this.plat = plat;
		this.heure = heure;
		this.partic = partic;
		ListPart = listPart;
	}
	
	public Repas(String jour, String plat, String heure, boolean partic,
			Participant Part) {
		super();
		this.jour = jour;
		this.plat = plat;
		this.heure = heure;
		this.partic = partic;
		ListPart.add(Part);
	}
	
	public Repas(String jour, String plat, String heure, boolean partic) {
		super();
		this.jour = jour;
		this.plat = plat;
		this.heure = heure;
		this.partic = partic;
		ListPart = new ArrayList<Participant>();
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public String getPlat() {
		return plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public boolean isPartic() {
		return partic;
	}

	public void setPartic(boolean partic) {
		this.partic = partic;
	}

	public ArrayList<Participant> getListPart() {
		return ListPart;
	}
	
	public void addListPart(Participant Part) {
		ListPart.add(Part);
	}
	

	public void setListPart(ArrayList<Participant> listPart) {
		ListPart = listPart;
	}

	@Override
	public String toString() {
		String pres="JOUR "+jour+"       Heure: "+heure;
		
		pres+="\n"+plat+"      "+((partic==true)?"Je participe":"Pas inscrit");
		pres+="\n"+"Qui participe?"+"\n";
		for(int i=0;i<ListPart.size();i++)
			pres+=(i==(ListPart.size()-1))?ListPart.get(i).getPrenom():ListPart.get(i).getPrenom()+", ";
			
		return pres;
	}
	
	
	
	

}
