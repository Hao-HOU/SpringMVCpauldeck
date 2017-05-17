package com.acehouhao.service;

import java.math.BigDecimal;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public interface ProductService {
    BigDecimal calculateDiscount();
    boolean isOnSale(int productId);
}
