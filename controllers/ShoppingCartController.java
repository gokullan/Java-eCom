package controllers;

import common.models.request.shoppingCart.AddToCartRequest;
import common.models.response.shoppingCart.AddToCartResponse;
import model.ShoppingCart;
import util.MockDB;
import util.MockDBBase;

public class ShoppingCartController { 
  static MockDBBase<String, ShoppingCart> dbRef;
  public static ShoppingCartController controllerInstance;

  public static ShoppingCartController getInstance() {
    if (controllerInstance == null) {
      controllerInstance = new ShoppingCartController();
    }
    return controllerInstance;
  }

  private ShoppingCartController() {
    dbRef = new MockDB<String, ShoppingCart>();
  }

  public AddToCartResponse serveRequest(AddToCartRequest request) {
    System.out.println("HERE!!!");
    System.out.println(request.requestName);
    return null;
  }

}
