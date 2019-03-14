package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StockItem extends Model {

  @Id
  public Long id;
  @ManyToOne
  public Warehouse warehouse;
  @ManyToOne
  public Product product;
  public Long quantity;

  public static final Finder<Long, StockItem> find = new Finder<>(StockItem.class);

  public Warehouse getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public String toString() {

    return String.format("Stockitem %d - %dx product %s",
        id, quantity, product == null ? null : product.id);
  }
}
