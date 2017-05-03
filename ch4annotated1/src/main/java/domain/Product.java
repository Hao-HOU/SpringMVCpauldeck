package domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Hao on 2017/5/3.
 */
public class Product implements Serializable {
    private static final long serialVersionUID = -5521544309275815404L;
    private long id;
    private String name;
    private String description;
    private BigDecimal price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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