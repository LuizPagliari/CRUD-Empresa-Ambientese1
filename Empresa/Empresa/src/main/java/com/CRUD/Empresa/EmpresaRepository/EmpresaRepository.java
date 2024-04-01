package com.CRUD.Empresa.EmpresaRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.Empresa.Model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	

}
