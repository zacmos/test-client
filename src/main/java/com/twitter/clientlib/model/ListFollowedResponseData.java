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
 * ListFollowedResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListFollowedResponseData {
  public static final String SERIALIZED_NAME_FOLLOWING = "following";
  @SerializedName(SERIALIZED_NAME_FOLLOWING)
  private Boolean following;

  public ListFollowedResponseData() { 
  }

  public ListFollowedResponseData following(Boolean following) {
    
    this.following = following;
    return this;
  }

   /**
   * Get following
   * @return following
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFollowing() {
    return following;
  }


  public void setFollowing(Boolean following) {
    this.following = following;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFollowedResponseData listFollowedResponseData = (ListFollowedResponseData) o;
    return Objects.equals(this.following, listFollowedResponseData.following);
  }

  @Override
  public int hashCode() {
    return Objects.hash(following);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFollowedResponseData {\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
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
    openapiFields.add("following");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListFollowedResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListFollowedResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListFollowedResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListFollowedResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ListFollowedResponseData>() {
           @Override
           public void write(JsonWriter out, ListFollowedResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListFollowedResponseData read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!ListFollowedResponseData.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `ListFollowedResponseData` properties");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}
