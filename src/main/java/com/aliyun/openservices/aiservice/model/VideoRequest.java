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

import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * VideoRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-09-01T11:22:49.224499673Z[GMT]")

public class VideoRequest {
  @SerializedName("action")
  private String action = null;

  @SerializedName("video_url")
  private String videoUrl = null;

  @SerializedName("video_title")
  private String videoTitle = null;

  @SerializedName("model_name")
  private String modelName = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("images")
  private List<String> images = null;

  @SerializedName("configure")
  private Object configure = null;

  public VideoRequest action(String action) {
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

  public VideoRequest videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Get videoUrl
   * @return videoUrl
  **/
  @Schema(example = "http://xxx", required = true, description = "")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public VideoRequest videoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
    return this;
  }

   /**
   * Get videoTitle
   * @return videoTitle
  **/
  @Schema(description = "")
  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public VideoRequest modelName(String modelName) {
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

  public VideoRequest configure(Object configure) {
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
    VideoRequest videoRequest = (VideoRequest) o;
    return Objects.equals(this.action, videoRequest.action) &&
        Objects.equals(this.videoUrl, videoRequest.videoUrl) &&
        Objects.equals(this.videoTitle, videoRequest.videoTitle) &&
        Objects.equals(this.text, videoRequest.text) &&
        Objects.equals(this.images, videoRequest.images) &&
        Objects.equals(this.modelName, videoRequest.modelName) &&
        Objects.equals(this.configure, videoRequest.configure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, videoUrl, videoTitle, text, images, modelName, configure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
