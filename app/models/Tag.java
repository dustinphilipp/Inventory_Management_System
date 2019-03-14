package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Tag extends Model {

  /* static data storage, no longer necessary with persistence layer
  private static List<Tag> tags;
  static {
    tags = new LinkedList<Tag>();
    tags.add(new Tag(1L, "lightweight", Product.findByName("paperclips 1")));
    tags.add(new Tag(2L, "metal", Product.findByName("paperclips")));
    tags.add(new Tag(3L, "plastic", Product.findByName("paperclips")));
  }
  */

  @Id
  public Long id;
  @Constraints.Required
  public String name;

  @ManyToMany(mappedBy = "tags")
  public List<Product> products;

  public static final Finder<Long, Tag> find = new Finder<>(Tag.class);

  public Tag() {
    // Left empty
  }

  public Tag(Long id, String name, Collection<Product> products) {
    this.id = id;
    this.name = name;
    this.products = new LinkedList<>(products);
    for(Product product : products) {
      product.tags.add(this);
    }
  }

  public static Tag findById(Long id) {

    return find.query()
        .where()
        .eq("id", id)
        .findOneOrEmpty()
        .orElse(null);
    /*
    for(Tag tag : tags) {
      if(tag.id == id) return tag;
    }
    return null;
    */
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

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public String toString() {
    return String.format("%s %s", id, name);
  }
}
