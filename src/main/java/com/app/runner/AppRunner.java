package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
 @Component
public class AppRunner implements CommandLineRunner{
    @Autowired
    private ProductRepository repo;
    
	@Override
	public void run(String... args) throws Exception {
		
		List<Product> prod=Arrays.asList(
				new Product(13,"M",7.7),
                new Product(14,"A",8.8),
                new Product(15,"N",9.9),
                new Product(16,"X",10.9));

repo.saveAll(prod);
//repo.findAllById(Arrays.asList(15,13)).forEach(System.out::println);

//repo.getData().forEach(System.out::println);	
//repo.getCost().forEach(System.out::println);

repo.getInfo().forEach(p->System.out.println(p[0]+" "+ p[1]));


//problem
//repo.getData(15,9.9).forEach(System.out::println);
 // int count =repo.removeData(13);
 // System.out.println(count);
/*  repo.save(new Product(15,"A",6.6));
int count1 =repo.updateData(5.5,15);
System.out.println(count1);
*/
	}

}
