package model;

import java.util.HashSet;
import java.util.Set;

public class Cart {
    private Integer id;
    private Integer total;
    private String name;
    private Set<Item> itemSet = new HashSet<>();

    public Cart() {

    }

    public Cart(Integer id, Integer total, String name, Set<Item> itemSet) {
        this.id = id;
        this.total = total;
        this.name = name;
        this.itemSet = itemSet;
    }

    public Cart(Integer total, String name, Set<Item> itemSet) {
        this.total = total;
        this.name = name;
        this.itemSet = itemSet;
    }

    public Cart(Integer total, String name) {
        this.total = total;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItemSet() {
        return itemSet;
    }

    public void setItemSet(Set<Item> itemSet) {
        this.itemSet = itemSet;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", total=" + total +
                ", name='" + name + '\'' +
                ", itemSet=" + itemSet +
                '}';
    }
}
