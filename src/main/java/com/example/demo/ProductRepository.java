package com.example.demo;

import com.example.demo.Product;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {

    List<Product> productList = new ArrayList<>(Arrays.asList());

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void addToRepo(Product product) {
        productList.add(product);
        System.out.println(product);
        getAllFromRepo();
    }

    public void getAllFromRepo() {
        System.out.println(Arrays.toString(productList.toArray()));
    }

    public Product getProductById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }
}
