package model;

import java.util.List;
import java.util.UUID;

public class ShoppingCart {
  public UUID cartId;
  public List<ShoppingCartItem> items;

  public ShoppingCart() {
    cartId = UUID.randomUUID();
  }
}
