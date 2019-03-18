package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;
import play.mvc.PathBindable;
import play.mvc.QueryStringBindable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Entity
public class StockItemMovement extends Model implements PathBindable<StockItemMovement>, QueryStringBindable<StockItemMovement> {

  @Id
  public Long id;
  @Constraints.Required
  public Long movementQuantity;
  @Constraints.Required
  public Date movementDate;

  @ManyToOne
  @Constraints.Required
  public StockItem stockItem;

  public static final Finder<Long, StockItemMovement> find = new Finder<>(StockItemMovement.class);

  public StockItemMovement() {}

  public StockItemMovement(StockItem stockItem, Long movementQuantity, Date movementDate) {
    this.stockItem = stockItem;
    this.movementQuantity = movementQuantity;
    this.movementDate = movementDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StockItem getStockItem() {
    return stockItem;
  }

  public void setStockItem(StockItem stockItem) {
    this.stockItem = stockItem;
  }

  public Long getMovementQuantity() {
    return movementQuantity;
  }

  public void setMovementQuantity(Long movementQuantity) {
    this.movementQuantity = movementQuantity;
  }

  public Date getMovementDate() {
    return movementDate;
  }

  public void setMovementDate(Date movementDate) {
    this.movementDate = movementDate;
  }

  public static StockItemMovement findById(Long id) {
    return find.query()
        .where()
        .eq("id", id)
        .findOneOrEmpty()
        .orElse(null);
  }

  public static List<StockItemMovement> findForStockItem(StockItem stockItem) {
    return find.query()
        .where()
        .eq("stock_item_id", stockItem.getId())
        .orderBy("id asc")
        .findList();
  }

  @Override
  public StockItemMovement bind(String key, String value) {
    System.out.println(Long.parseLong(value));
    return findById(Long.parseLong(value));
  }

  @Override
  public Optional<StockItemMovement> bind(String key, Map<String, String[]> data) {
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
    return String.format("Stockitem movement %d, %d units on %s",
                         this.id, this.movementQuantity, this.movementDate.toString());
  }
}
