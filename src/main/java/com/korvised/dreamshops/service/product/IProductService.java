package com.korvised.dreamshops.service.product;

import com.korvised.dreamshops.medel.Product;
import com.korvised.dreamshops.request.AddProductRequest;
import com.korvised.dreamshops.request.UpdateProductRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);

    Product getProductById(Long id);

    Product updateProduct(UpdateProductRequest request, Long productId);

    void deleteProduct(Long id);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);
}
