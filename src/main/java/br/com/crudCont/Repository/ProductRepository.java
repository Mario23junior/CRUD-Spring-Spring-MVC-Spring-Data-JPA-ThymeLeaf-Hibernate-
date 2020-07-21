package br.com.crudCont.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.crudCont.Model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
