import common.models.request.shoppingCart.AddToCartRequest;
import common.models.response.shoppingCart.AddToCartResponse;
import controllers.ShoppingCartController;

class Start {

  public static void main(String[] args) {
    AddToCartRequest request = new AddToCartRequest("SM-S928BZKC", 1);
    AddToCartResponse response = ShoppingCartController.getInstance().serveRequest(request);
  }
}
