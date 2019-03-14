package models;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.PagedList;
import play.data.validation.Constraints;
import play.mvc.PathBindable;
import play.mvc.QueryStringBindable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Entity
public class Warehouse extends Model implements PathBindable<Warehouse>, QueryStringBindable<Warehouse> {

  @Id
  public Long id;

  @Constraints.Required
  public String name;
  @Constraints.Required
  @OneToOne
  public Address address;

  public Boolean active;

  @OneToMany(mappedBy="warehouse")
  public List<StockItem> stock = new ArrayList<>();

  public static final Finder<Long, Warehouse> find = new Finder<>(Warehouse.class);

  public Warehouse() {}

  public Warehouse(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    if(address != null) this.address = address;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public List<StockItem> getStock() {
    return stock;
  }

  public void setStock(List<StockItem> stock) {
    this.stock = stock;
  }

  public static PagedList<Warehouse> find(int page) {

    return find.query()
        .where()
        .eq("active", true)
        .orderBy("id asc")
        .setFirstRow((page * helpers.ConfigHelper.getMaxRows()))
        .setMaxRows(helpers.ConfigHelper.getMaxRows())
        .findPagedList();
  }

  public static Warehouse findById(Long id) {
    return find.query()
        .where()
        .eq("id", id)
        .findOneOrEmpty()
        .orElse(null);
  }

  @Override
  public Warehouse bind(String key, String value) {
    System.out.println(Long.parseLong(value));
    return findById(Long.parseLong(value));
  }

  @Override
  public Optional<Warehouse> bind(String key, Map<String, String[]> data) {
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

  public String toString(){
    return name;
  }
}
