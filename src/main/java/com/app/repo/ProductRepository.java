package com.app.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("select p from Product p")
	 public List<Product>getData();  
	
	//@Query("select p.prodCost from Product p")
	//public List<Double>getCost();  
	@Query("select p.prodCost,p.prodCode from Product p")
    public List<Object[]> getInfo();
//@Query("select p from Product p where p.prodId=?1 or p.prodCost<?2")
//public List<Product> getData(Integer pid,Double cost);
//	@Query("select p from Product p where p.prodId=:a or p.prodCost<:b")
//	public List<Product> getData(Integer a,Double b);
	
/*	@Modifying
	@Transactional
	@Query("delete from Product p  where p.prodId=:id")
	public int removeData(Integer id); 
	
*/
/*	@Modifying
	@Transactional
	@Query("update Product p set p.prodCost=:cost where p.prodId=:id")
	public int updateData(Double cost,Integer id); 
*/	
	
}
