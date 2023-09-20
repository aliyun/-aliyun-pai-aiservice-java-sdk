/*
 * AI model Service Restful API
 * This is an ai model service
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.aliyun.openservices.aiservice.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-09-01T11:22:49.224499673Z[GMT]")

public class AIGCImageTrainResponse {
  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("data")
  private InlineResponse200Data data = null;

  public AIGCImageTrainResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public AIGCImageTrainResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AIGCImageTrainResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AIGCImageTrainResponse data(InlineResponse200Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public InlineResponse200Data getData() {
    return data;
  }

  public void setData(InlineResponse200Data data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGCImageTrainResponse AIGCImageTrainResponse = (AIGCImageTrainResponse) o;
    return Objects.equals(this.requestId, AIGCImageTrainResponse.requestId) &&
        Objects.equals(this.code, AIGCImageTrainResponse.code) &&
        Objects.equals(this.message, AIGCImageTrainResponse.message) &&
        Objects.equals(this.data, AIGCImageTrainResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, code, message, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
