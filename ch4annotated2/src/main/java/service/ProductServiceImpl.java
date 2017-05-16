package service;

import domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Hao HOU on 2017/5/3.
 */
@Service
public class ProductServiceImpl implements ProductService {
    private Map<Long, Product> products = new HashMap<Long, Product>();
    private AtomicLong generator = new AtomicLong();

    public ProductServiceImpl(){
        Product product = new Product();
        product.setName("JX1 Power Drill");
        product.setDescription("Powerful hand drill, made to perfection");
        product.setPrice(new BigDecimal(129.99));
        add(product);
    }

    @Override
    public Product add(Product product){
        long newID = generator.incrementAndGet();
        product.setId(newID);
        products.put(newID, product);
        return product;
    }

    @Override
    public Product get(long id){
        return products.get(id);
    }
}
