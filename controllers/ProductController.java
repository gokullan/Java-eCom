package controllers;

import model.Product;
import model.ProductSampleModel;
import util.MockDB;
import util.MockDBBase;

public class ProductController {
  public static ProductController controllerInstance;
  static MockDBBase<String, Product> dbRef;

  // lazy-instantiation
  public static ProductController getInstance() {
    if (controllerInstance == null) {
      controllerInstance = new ProductController();
    }
    return controllerInstance;
  }

  // use singleton pattern
  private ProductController() {
    dbRef = new MockDB<String, Product>(
        ProductSampleModel.products
      );
  }

  public Product getProductInfo(String productCode) {
    return dbRef.get(productCode);
  }

}
