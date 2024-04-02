package com.CRUD.Empresa.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.Empresa.EmpresaRepository.EmpresaRepository;
import com.CRUD.Empresa.Model.Empresa;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
	@Autowired
	private EmpresaRepository empresaRepository;

	@GetMapping
	public List<Empresa> listarEmpresa(){
		return empresaRepository.findAll();
		
	}
	
	@PostMapping
	public Empresa criarEmpresa(@RequestBody Empresa empresa) {
		return empresaRepository.save(empresa);
	}
	
	@PutMapping("/{id}")
	public Empresa atualizarEmpresa(@PathVariable Long id, @RequestBody Empresa empresaAtualizada) {
	    return empresaRepository.findById(id)
	            .map(empresa -> {
	            		empresa.setNomeFantasia(empresaAtualizada.getNomeFantasia());
	            			empresa.setNomeSolicitante(empresaAtualizada.getNomeSolicitante());
	            				empresa.setTelefoneSolicitante(empresaAtualizada.getTelefoneSolicitante());
	            					empresa.setRazaoSocial(empresaAtualizada.getRazaoSocial());
	            						empresa.setCnpj(empresaAtualizada.getCnpj());
	            							empresa.setInscricaoSocial(empresaAtualizada.getInscricaoSocial());
	            								empresa.setEndereco(empresaAtualizada.getEndereco());
	            									empresa.setEmail(empresaAtualizada.getEmail());
	            										empresa.setTelefoneEmpresa(empresaAtualizada.getTelefoneEmpresa());
	            											empresa.setCnae(empresaAtualizada.getCnae());
	            												empresa.setPorteEmpresa(empresaAtualizada.getPorteEmpresa());
	                return empresaRepository.save(empresa);
	            })
	            .orElseThrow(() -> new RuntimeException("Empresa não encontrada com o ID: " + id));
	}

	
	@DeleteMapping("/{id}")
	public void deletarEmpresa(@PathVariable Long id) {
		empresaRepository.deleteById(id);
		
	}
}
