package common.models.request.shoppingCart;

import common.models.request.StandardRequest;
import common.enums.RequestNameEnum;
import common.enums.RequestTypeEnum;

public class AddToCartRequest extends StandardRequest {
  String productCode;
  Integer quantity;

  public AddToCartRequest(String productCode, Integer quantity) {
    super(RequestTypeEnum.CART, RequestNameEnum.ADD_TO_CART);
    this.productCode = productCode;
    this.quantity = quantity;
  }

}

