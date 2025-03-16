package common.models.response.shoppingCart;

import common.models.response.StandardResponse;
import model.ShoppingCart;

public class AddToCartResponse extends StandardResponse {
  public ShoppingCart cart;

  AddToCartResponse(Integer statusCode, String message, ShoppingCart cart) {
    super(message, statusCode);
    this.cart = cart;
  }
}
