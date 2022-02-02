package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer> {

	// Aşağıdakiler JpaRepository tarafından hazır geliyor 
	 Product getByProductName(String productName);
	  
	  Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	  
	  List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	  
	  List<Product> getByCategoryIn(List<Integer> categories);
	
	  List<Product> getByProductNameContains(String productName); //ürün ismi içeriyorsa
	
	  List<Product> getByProductNameStartsWith(String productName); // şu isimle başlayanları
	
	//java jpql
	  @Query("From Product where productName=:productName and category.categoryId=:categoryId")
	  List<Product> getByNameAndCategory(String productName, int categoryId);
	  
	  @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto"
	  		+ "(p.id, p.productName, c.categoryName) From Category c inner join "
	  		+ "c.products p")
	  List<ProductWithCategoryDto> getProductWithCategoryDetails();
	  
  // select p.product_id,p.product_name, c.category_name,p.unit_price from products p 
  //  inner join categories c on p.category_id =c.category_id
}
