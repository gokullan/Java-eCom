package model;

import java.util.HashMap;
import java.util.Map;

public class ProductSampleModel {
  public static final Map<String, Product> products = new HashMap<String, Product>() {{
         put("SM-34353974", new Product("SM-34353974", 17385.00));
         put("SM-34353975", new Product("SM-34353974", 13385.00));
         put("SM-34353976", new Product("SM-34353974", 18385.00));
      }};
}
