package com.acehouhao.service;

import com.acehouhao.dao.ProductDAO;

import java.math.BigDecimal;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class ProductServiceImpl implements ProductService {
    private ProductDAO productDAO;
    public ProductServiceImpl(ProductDAO productDAOArg) {
        if (productDAOArg == null) {
            throw new NullPointerException("ProductDAO cannot be null");
        }
        this.productDAO = productDAOArg;
    }

    @Override
    public BigDecimal calculateDiscount() {
        return productDAO.calculateDiscount();
    }

    @Override
    public boolean isOnSale(int productId) {
        return productDAO.isOnSale(productId);
    }

}
