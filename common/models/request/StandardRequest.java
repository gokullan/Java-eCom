package common.models.request;

import common.enums.RequestNameEnum;
import common.enums.RequestTypeEnum;

public class StandardRequest {
  public RequestTypeEnum requestType;
  public RequestNameEnum requestName;

  public StandardRequest() {};

  public StandardRequest(RequestTypeEnum requestType, RequestNameEnum requestName) {
    this.requestType = requestType;
    this.requestName = requestName;
  }
}
