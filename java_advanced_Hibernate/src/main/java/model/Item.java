package model;

import java.util.HashSet;
import java.util.Set;

public class Item {
    private Integer id;
    private Integer total;
    private Set<Cart> cartSet = new HashSet<>();

    public Item() {
    }

    public Item(Integer total) {
        this.total = total;
    }

    public Item(Integer id, Integer total, Set<Cart> cartSet) {
        this.id = id;
        this.total = total;
        this.cartSet = cartSet;
    }

    public Item(Integer total, Set<Cart> cartSet) {
        this.total = total;
        this.cartSet = cartSet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Set<Cart> getCartSet() {
        return cartSet;
    }

    public void setCartSet(Set<Cart> cartSet) {
        this.cartSet = cartSet;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", total=" + total +
                ", cartSet=" + cartSet +
                '}';
    }
}
