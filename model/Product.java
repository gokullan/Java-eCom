package model;

import java.util.HashMap;
import java.util.Map;

public class Product {
  public String productCode;
  public Double price;

  Product(String productCode, Double price) {
    this.productCode = productCode;
    this.price = price;
  }

  Map<String, String> toMap() {
    return new HashMap<String, String>() {{
      put("productCode", productCode);
      put("price", price.toString());
    }};
  }
}
