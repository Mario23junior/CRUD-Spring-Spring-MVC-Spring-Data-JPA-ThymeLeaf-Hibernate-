package br.com.crudCont.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.crudCont.Model.Product;
import br.com.crudCont.Service.ProductService;

@Controller
public class ProductController {
    
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = (List<Product>) service.listAll();
		model.addAttribute("listProducts",listProducts);
		return "index";
	}
}
