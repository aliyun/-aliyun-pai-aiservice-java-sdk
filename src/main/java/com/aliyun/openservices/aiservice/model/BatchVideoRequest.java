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

import java.util.ArrayList;
import java.util.List;
/**
 * BatchVideoRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-09-01T11:22:49.224499673Z[GMT]")

public class BatchVideoRequest {
  @SerializedName("action")
  private String action = null;

  @SerializedName("videos")
  private List<VideoMeta> videos = new ArrayList<VideoMeta>();

  @SerializedName("model_name")
  private String modelName = null;

  @SerializedName("configure")
  private Object configure = null;

  public BatchVideoRequest action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(example = "ClassifyImage", required = true, description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public BatchVideoRequest videos(List<VideoMeta> videos) {
    this.videos = videos;
    return this;
  }

  public BatchVideoRequest addVideosItem(VideoMeta videosItem) {
    this.videos.add(videosItem);
    return this;
  }

   /**
   * Get videos
   * @return videos
  **/
  @Schema(example = "[{\"url\":\"https://xxx\",\"title\":\"abc\"}]", required = true, description = "")
  public List<VideoMeta> getVideos() {
    return videos;
  }

  public void setVideos(List<VideoMeta> videos) {
    this.videos = videos;
  }

  public BatchVideoRequest modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @Schema(description = "")
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public BatchVideoRequest configure(Object configure) {
    this.configure = configure;
    return this;
  }

   /**
   * Get configure
   * @return configure
  **/
  @Schema(description = "")
  public Object getConfigure() {
    return configure;
  }

  public void setConfigure(Object configure) {
    this.configure = configure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchVideoRequest batchVideoRequest = (BatchVideoRequest) o;
    return Objects.equals(this.action, batchVideoRequest.action) &&
        Objects.equals(this.videos, batchVideoRequest.videos) &&
        Objects.equals(this.modelName, batchVideoRequest.modelName) &&
        Objects.equals(this.configure, batchVideoRequest.configure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, videos, modelName, configure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchVideoRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    configure: ").append(toIndentedString(configure)).append("\n");
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
