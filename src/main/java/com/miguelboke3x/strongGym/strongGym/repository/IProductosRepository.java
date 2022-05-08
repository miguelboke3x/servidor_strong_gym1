package com.miguelboke3x.strongGym.strongGym.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.miguelboke3x.strongGym.strongGym.entities.Productos;

//Creación del repositorio//

public interface IProductosRepository extends
JpaRepositoryImplementation<Productos, Integer>{

}
