package org.raflab.studsluzba.model.dtos;


/**
 * 
 * Entitet koji se koristi za prenos osnovnih podataka o studentu, 
 * mogu da budu samo licni podaci, bez indeksa, u slučaju
 * da je student unet u sistem ali mu još nije dodeljen indeks
 * ili podaci sa aktivnim indeksom. 
 * 
 * Koristi se kao rezultat pretrage studenata
 * 
 * @author bojanads
 *
 */



public class StudentDTO {
	
	private Long idIndeks;
	private Long idStudentPodaci;
	// dodati jos nesto?
	private String ime;
	private String prezime; 
	// indeks
	private int godinaUpisa;
	private String studProgram;
	private int broj;
	
	
	
	
	public Long getIdIndeks() {
		return idIndeks;
	}
	public void setIdIndeks(Long idIndeks) {
		this.idIndeks = idIndeks;
	}
	public Long getIdStudentPodaci() {
		return idStudentPodaci;
	}
	public void setIdStudentPodaci(Long idStudentPodaci) {
		this.idStudentPodaci = idStudentPodaci;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	public String getStudProgram() {
		return studProgram;
	}
	public void setStudProgram(String studProgram) {
		this.studProgram = studProgram;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	
	
	

}
