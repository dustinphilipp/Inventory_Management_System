package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address extends Model {

  @Id
  public Long id;

  @OneToOne(mappedBy = "address")
  public Warehouse warehouse;

  @Constraints.Required
  public String street;
  @Constraints.Required
  public String number;
  @Constraints.Required
  public String postalCode;
  @Constraints.Required
  public String city;
  @Constraints.Required
  public String country;

  public static final Finder<Long, Address> find = new Finder<>(Address.class);

  public Address() {
    // left empty
  }

  public Address(Long id, String street, String number, String postalCode, String city, String country, Warehouse warehouse) {
    this.id = id;
    this.street = street;
    this.number = number;
    this.postalCode = postalCode;
    this.city = city;
    this.country = country;
    this.warehouse = warehouse;
    warehouse.address = this;
  }

  public String toString() {
    return String.format("%s %s, %s %s, %s", street, number, postalCode, city, country);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Warehouse getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public static Address findById(Long id) {
    return find.query()
        .where()
        .eq("id", id)
        .findOneOrEmpty()
        .orElse(null);
  }
}
