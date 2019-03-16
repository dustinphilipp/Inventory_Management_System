package models;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.PagedList;
import play.data.validation.Constraints;
import play.mvc.PathBindable;
import play.mvc.QueryStringBindable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Entity
public class StockItem extends Model implements PathBindable<StockItem>, QueryStringBindable<StockItem> {

  @Id
  public Long id;
  @ManyToOne
  @Constraints.Required
  public Warehouse warehouse;
  @ManyToOne
  @Constraints.Required
  public Product product;
  @Constraints.Required
  public Long quantity;

  public Boolean active;

  @OneToMany(mappedBy="stockItem")
  public List<StockItemMovement> stockItemMovements = new ArrayList<>();

  public static final Finder<Long, StockItem> find = new Finder<>(StockItem.class);

  public StockItem() {}

  public StockItem(Long quantity) {
    this.quantity = quantity;
  }

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

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public static PagedList<StockItem> find(int page) {

    return find.query()
        .where()
        .eq("active", true)
        .orderBy("id asc")
        .setFirstRow((page * helpers.ConfigHelper.getMaxRows()))
        .setMaxRows(helpers.ConfigHelper.getMaxRows())
        .findPagedList();
  }

  public static StockItem findById(Long id) {
    return find.query()
        .where()
        .eq("id", id)
        .findOneOrEmpty()
        .orElse(null);
  }

  @Override
  public StockItem bind(String key, String value) {
    System.out.println(Long.parseLong(value));
    return findById(Long.parseLong(value));
  }

  @Override
  public Optional<StockItem> bind(String key, Map<String, String[]> data) {
    System.out.println(Optional.ofNullable(findById(Long.parseLong(data.get("id")[0]))));
    return Optional.ofNullable(findById(Long.parseLong(data.get("id")[0])));
  }

  @Override
  public String unbind(String s) {
    return String.valueOf(this.id);
  }

  @Override
  public String javascriptUnbind() {
    return String.valueOf(this.id);
  }

  public String toString() {

    return String.format("Stockitem %d - %dx product %s",
        id, quantity, product == null ? null : product.id);
  }
}
