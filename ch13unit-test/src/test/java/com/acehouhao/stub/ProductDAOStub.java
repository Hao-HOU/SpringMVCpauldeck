package com.acehouhao.stub;

import com.acehouhao.dao.ProductDAO;

import java.math.BigDecimal;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class ProductDAOStub implements ProductDAO {
    public BigDecimal calculateDiscount() {
        return new BigDecimal(14);
    }
    public boolean isOnSale(int productId) {
        return false;
    }
}
