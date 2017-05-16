package service;

import domain.Product;

/**
 * Created by Hao HOU on 2017/5/3.
 */
public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
