/*
 * Copyright 2020 Twitter, Inc.
 * SPDX-License-Identifier: Apache-2.0
 *
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Engagement metrics for the Media at the time of the request.
 */
@ApiModel(description = "Engagement metrics for the Media at the time of the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoAllOfPublicMetrics {
  public static final String SERIALIZED_NAME_VIEW_COUNT = "view_count";
  @SerializedName(SERIALIZED_NAME_VIEW_COUNT)
  private Integer viewCount;

  public VideoAllOfPublicMetrics() { 
  }

  public VideoAllOfPublicMetrics viewCount(Integer viewCount) {
    
    this.viewCount = viewCount;
    return this;
  }

   /**
   * Number of times this video has been viewed.
   * @return viewCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times this video has been viewed.")

  public Integer getViewCount() {
    return viewCount;
  }


  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAllOfPublicMetrics videoAllOfPublicMetrics = (VideoAllOfPublicMetrics) o;
    return Objects.equals(this.viewCount, videoAllOfPublicMetrics.viewCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAllOfPublicMetrics {\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("view_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoAllOfPublicMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoAllOfPublicMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoAllOfPublicMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoAllOfPublicMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoAllOfPublicMetrics>() {
           @Override
           public void write(JsonWriter out, VideoAllOfPublicMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VideoAllOfPublicMetrics read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!VideoAllOfPublicMetrics.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `VideoAllOfPublicMetrics` properties");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}
