package br.com.crudCont.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.crudCont.Model.Product;
import br.com.crudCont.Repository.ProductRepository;

@Service
@Transactional
public class ProductService {
       
	   @Autowired
	   private ProductRepository repo;
	   
	   public Iterable<Product> listAll(){
		   return repo.findAll();
	   }
	   
	   public void save(Product product) {
		   repo.save(product);
	   }
	   
	   public Product get(Long id) {
		   return repo.findById(id).get();
	   }
	   
	   public void delete(long id) {
		   repo.deleteById(id);
	   }
}
