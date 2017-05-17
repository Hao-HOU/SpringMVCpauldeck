package com.acehouhao.dummy;

import com.acehouhao.dao.ProductDAO;

import java.math.BigDecimal;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class ProductDAODummy implements ProductDAO {
    public BigDecimal calculateDiscount() {
        return null;
    }
    public boolean isOnSale(int productId) {
        return false;
    }
}
