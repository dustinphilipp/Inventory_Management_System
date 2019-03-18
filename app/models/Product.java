package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.PagedList;
import play.data.validation.Constraints;
import play.libs.F;
import play.mvc.PathBindable;
import play.mvc.QueryStringBindable;

import io.ebean.Model;
import io.ebean.Finder;

@Entity
public class Product extends Model implements PathBindable<Product>, QueryStringBindable<Product> {

  public static class EanValidator extends Constraints.Validator<String> {

    @Override
    public boolean isValid(String value) {
      String pattern = "^[0-9]{13}$";
      return value != null && value.matches(pattern);
    }

    @Override
    public F.Tuple<String, Object[]> getErrorMessageKey() {
      return new F.Tuple<String, Object[]>("Must be 13 digits.",
          new String[]{});
    }
  }
  private static final int rowCount = 10;

  /* Static storage was used for initial data population, no longer needed with persistence layer
  //
  private static List<Product> products;
  static {
    products = new ArrayList<Product>();
    products.add(new Product("1111111111111", "Paperclips 1", "Paperclips description 1"));
    products.add(new Product("2222222222222", "Paperclips 2", "Paperclips description 2"));
    products.add(new Product("3333333333333", "Paperclips 3", "Paperclips description 3"));
    products.add(new Product("4444444444444", "Paperclips 4", "Paperclips description 4"));
    products.add(new Product("5555555555555", "Paperclips 5", "Paperclips description 5"));
  }
  */

  @Id
  public Long id;

  @Constraints.Required
  @Constraints.ValidateWith(EanValidator.class)
  @Column(unique = true)
  public String ean;
  @Constraints.Required
  public String name;
  public String description;
  public String pictureFileName;

  public Boolean active;

  @ManyToMany
  public List<Tag> tags = new LinkedList<>();

  @OneToMany(mappedBy="product")
  public List<StockItem> stockItems;

  public static final Finder<Long, Product> find = new Finder<>(Product.class);

  public Product() {}

  public Product(String ean, String name, String description) {
    this.ean = ean;
    this.name = name;
    this.description = description;
  }

  public static PagedList<Product> find(int page) {

    return find.query()
        .where()
        .eq("active", true)
        .orderBy("id asc")
        .setFirstRow((page*rowCount))
        .setMaxRows(rowCount)
        .findPagedList();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public String getEan() {
    return ean;
  }

  public String getDescription() {
    return description;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Long> ids) {
    for(Long id : ids) {
      if(id != null)
        this.tags.add(Tag.findById(id));
    }
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPictureFileName() {
    return pictureFileName;
  }

  public void setPictureFileName(String pictureFileName) {
    this.pictureFileName = pictureFileName;
  }

  public String toString() {
    return String.format("%s - %s", ean, name);
  }

  public static List<Product> findAll() {
    return find.query().findList();
    /*
    return new ArrayList<Product>(products);
    */
  }

  public static Product findByEan(String ean) {
    return find.query()
        .where()
        .eq("ean", ean)
        .findOneOrEmpty()
        .orElse(null);
    /*
    for (Product candidate : products) {
      if (candidate.ean.equals(ean)) {
        return candidate;
      }
    }
    return null;
    */
  }

  public static List<Product> findByName(String term) {

    return find.query()
        .where()
        .eq("name", term)
        .findList();

    /*
    final List<Product> results = new ArrayList<Product>();
    for (Product candidate : products) {
      if (candidate.name.toLowerCase().contains(term.toLowerCase())) {
        results.add(candidate);
      }
    }
    return results;
    */
  }

  public static boolean remove(Product product) {
    /*
    return products.remove(product);
    */
    return true;
  }

  public static Product findById(Long id) {
    return find.query()
        .where()
        .eq("id", id)
        .findOneOrEmpty()
        .orElse(null);
  }

  @Override
  public Product bind(String key, String value) {
    return findByEan(value);
  }

  @Override
  public Optional<Product> bind(String key, Map<String, String[]> data) {
    return Optional.ofNullable(findByEan(data.get("ean")[0]));
  }

  @Override
  public String unbind(String s) {
    return this.ean;
  }

  @Override
  public String javascriptUnbind() {
    return this.ean;
  }

}
