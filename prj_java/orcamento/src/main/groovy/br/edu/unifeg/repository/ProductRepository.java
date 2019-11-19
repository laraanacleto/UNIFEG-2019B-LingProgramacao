package br.edu.unifeg.entity.orcamento.repository;

import org.springframework.data.repository.CrudRepository;
import br.edu.unifeg.orcamento.repository.ProductRepository;


public interface ProductRepository extends CrudRepository<Product, Integer> {}
