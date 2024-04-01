package com.CRUD.Empresa.Model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empresa {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nomeFantasia;
    private String nomeSolicitante;
    private String telefoneSolicitante;
    private String razaoSocial;
    private String cnpj;
    private String inscricaoSocial;
    private String endereco;
    private String email;
    private String telefoneEmpresa;
    private String cnae;
    private String porteEmpresa;
    
    @Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(id, other.id);
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getNomeSolicitante() {
		return nomeSolicitante;
	}
	public void setNomeSolicitante(String nomeSolicitante) {
		this.nomeSolicitante = nomeSolicitante;
	}
	public String getTelefoneSolicitante() {
		return telefoneSolicitante;
	}
	public void setTelefoneSolicitante(String telefoneSolicitante) {
		this.telefoneSolicitante = telefoneSolicitante;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoSocial() {
		return inscricaoSocial;
	}
	public void setInscricaoSocial(String inscricaoSocial) {
		this.inscricaoSocial = inscricaoSocial;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}
	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}
	public String getCnae() {
		return cnae;
	}
	public void setCnae(String cnae) {
		this.cnae = cnae;
	}
	public String getPorteEmpresa() {
		return porteEmpresa;
	}
	public void setPorteEmpresa(String porteEmpresa) {
		this.porteEmpresa = porteEmpresa;
	}

    
}