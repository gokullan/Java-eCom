package common.models.response;

public class StandardResponse {
  public String message;
  public Integer statusCode;

  public StandardResponse(String message, Integer statusCode) {
    this.message = message;
    this.statusCode = statusCode;
  }

}
