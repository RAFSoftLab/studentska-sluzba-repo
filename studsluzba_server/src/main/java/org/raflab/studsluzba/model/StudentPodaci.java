package org.raflab.studsluzba.model;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class StudentPodaci{ 
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String ime;	  // not null
	 private String prezime;  // not null
	 private String srednjeIme;   // not null 
	 private String jmbg;    
	 private LocalDate datumRodjenja;  // not null
	 private String mestoRodjenja; 
	 private String mestoPrebivalista;  // not null
	 private String drzavaRodjenja;   
	 private String drzavljanstvo;   // not null
	 private String nacionalnost;   // samoizjasnjavanje, moze bilo sta  
	 private Character pol;    // not null
	 private String adresa;  // not null
	 private String brojTelefona;  // not null
	 private String slika; // putanja do slike 
	 private String email;  // not null
	 private String brojLicneKarte; 
	 private String licnuKartuIzdao;
	 private String mestoStanovanja;
	 private String adresaStanovanja;   // u toku studija
	 @OneToOne (cascade = CascadeType.ALL)
	 private PrviUpis prviUpis;
	 
	 
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getSrednjeIme() {
		return srednjeIme;
	}
	public void setSrednjeIme(String srednjeIme) {
		this.srednjeIme = srednjeIme;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(LocalDate datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public String getMestoRodjenja() {
		return mestoRodjenja;
	}
	public void setMestoRodjenja(String mestoRodjenja) {
		this.mestoRodjenja = mestoRodjenja;
	}
	public String getMestoPrebivalista() {
		return mestoPrebivalista;
	}
	public void setMestoPrebivalista(String mestoPrebivalista) {
		this.mestoPrebivalista = mestoPrebivalista;
	}
	public String getDrzavaRodjenja() {
		return drzavaRodjenja;
	}
	public void setDrzavaRodjenja(String drzavaRodjenja) {
		this.drzavaRodjenja = drzavaRodjenja;
	}
	public String getDrzavljanstvo() {
		return drzavljanstvo;
	}
	public void setDrzavljanstvo(String drzavljanstvo) {
		this.drzavljanstvo = drzavljanstvo;
	}
	public String getNacionalnost() {
		return nacionalnost;
	}
	public void setNacionalnost(String nacionalnost) {
		this.nacionalnost = nacionalnost;
	}
	public Character getPol() {
		return pol;
	}
	public void setPol(Character pol) {
		this.pol = pol;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getBrojTelefona() {
		return brojTelefona;
	}
	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	public String getSlika() {
		return slika;
	}
	public void setSlika(String slika) {
		this.slika = slika;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}
	public void setBrojLicneKarte(String brojLicneKarte) {
		this.brojLicneKarte = brojLicneKarte;
	}
	public String getLicnuKartuIzdao() {
		return licnuKartuIzdao;
	}
	public void setLicnuKartuIzdao(String licnuKartuIzdao) {
		this.licnuKartuIzdao = licnuKartuIzdao;
	}
	public String getMestoStanovanja() {
		return mestoStanovanja;
	}
	public void setMestoStanovanja(String mestoStanovanja) {
		this.mestoStanovanja = mestoStanovanja;
	}
	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}
	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}
	public PrviUpis getPrviUpis() {
		return prviUpis;
	}
	public void setPrviUpis(PrviUpis prviUpis) {
		this.prviUpis = prviUpis;
	}
	 
	
	 
	 
	
	
	
}
