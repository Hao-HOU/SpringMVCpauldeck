package com.acehouhao.dao;

import java.math.BigDecimal;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public interface ProductDAO {
    BigDecimal calculateDiscount();
    boolean isOnSale(int productId);
}
