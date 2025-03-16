package model;

public class ShoppingCartItem {
  public Product item;
  public Integer quantity;

  ShoppingCartItem(Product item, Integer quantity) {
    this.item = item;
    this.quantity = quantity;
  }
}
