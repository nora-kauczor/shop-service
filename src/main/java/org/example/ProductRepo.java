package org.example;

import java.util.List;
import java.util.Objects;

public class ProductRepo {
    private List<Product> productList;

    public void addProduct(Product product){
        productList.add(product);
    }

    public void  removeProduct(int id){
        Product product = getProductById(id);
        productList.remove(product);
    }

    public Product getProductById(int id){
        Product searchedProduct = null;
        for (Product product : productList){
            if (product.id() == id){searchedProduct = product;}
        }
        if (searchedProduct == null){System.out.println("Something went wrong when trying to get product.");}
        return searchedProduct;
    };

  /////////////////////////////////boiler plate methods////////////////////////////////////////////////


    public ProductRepo(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productList);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + productList +
                '}';
    }

}
