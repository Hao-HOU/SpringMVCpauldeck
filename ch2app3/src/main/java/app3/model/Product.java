package app3.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Hao on 2017/4/28.
 */
public class Product implements Serializable{

    private static final long serialVersionUID = 7311296804217245722L;
    private String name;
    private String description;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
