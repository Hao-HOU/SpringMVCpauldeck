package com.acehouhao.stub;

import static org.junit.Assert.assertNotNull;

import com.acehouhao.dao.ProductDAO;
import com.acehouhao.service.ProductService;
import com.acehouhao.service.ProductServiceImpl;
import org.junit.Test;

/**
 * Created by Hao HOU on 2017/5/17.
 */
public class ProductServiceImplTest {
    @Test
    public void testCalculateDiscount() {
        ProductDAO productDAO = new ProductDAOStub();
        ProductService productService = new ProductServiceImpl(productDAO);
        assertNotNull(productService);
    }
}
