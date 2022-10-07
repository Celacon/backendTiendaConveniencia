package com.grupo2.tiendaConveniencia.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.tiendaConveniencia.entity.Pedido;

@Repository("pedidoRepository")

public interface PedidoRepository extends JpaRepository<Pedido, Serializable> {

}
