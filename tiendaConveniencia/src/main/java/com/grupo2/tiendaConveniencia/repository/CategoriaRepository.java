package com.grupo2.tiendaConveniencia.repository;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.grupo2.tiendaConveniencia.entity.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("categoriaRepository")
public interface CategoriaRepository extends JpaRepository <Categoria, Serializable> {

}