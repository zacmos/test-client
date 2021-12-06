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
 * GenericMultipleUsersLookupResponseMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GenericMultipleUsersLookupResponseMeta {
  public static final String SERIALIZED_NAME_PREVIOUS_TOKEN = "previous_token";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_TOKEN)
  private String previousToken;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "next_token";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_RESULT_COUNT = "result_count";
  @SerializedName(SERIALIZED_NAME_RESULT_COUNT)
  private Integer resultCount;

  public GenericMultipleUsersLookupResponseMeta() { 
  }

  public GenericMultipleUsersLookupResponseMeta previousToken(String previousToken) {
    
    this.previousToken = previousToken;
    return this;
  }

   /**
   * The previous token
   * @return previousToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The previous token")

  public String getPreviousToken() {
    return previousToken;
  }


  public void setPreviousToken(String previousToken) {
    this.previousToken = previousToken;
  }


  public GenericMultipleUsersLookupResponseMeta nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * The next token
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The next token")

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public GenericMultipleUsersLookupResponseMeta resultCount(Integer resultCount) {
    
    this.resultCount = resultCount;
    return this;
  }

   /**
   * The number of user results returned in this response
   * @return resultCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of user results returned in this response")

  public Integer getResultCount() {
    return resultCount;
  }


  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericMultipleUsersLookupResponseMeta genericMultipleUsersLookupResponseMeta = (GenericMultipleUsersLookupResponseMeta) o;
    return Objects.equals(this.previousToken, genericMultipleUsersLookupResponseMeta.previousToken) &&
        Objects.equals(this.nextToken, genericMultipleUsersLookupResponseMeta.nextToken) &&
        Objects.equals(this.resultCount, genericMultipleUsersLookupResponseMeta.resultCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousToken, nextToken, resultCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericMultipleUsersLookupResponseMeta {\n");
    sb.append("    previousToken: ").append(toIndentedString(previousToken)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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
    openapiFields.add("previous_token");
    openapiFields.add("next_token");
    openapiFields.add("result_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenericMultipleUsersLookupResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenericMultipleUsersLookupResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenericMultipleUsersLookupResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenericMultipleUsersLookupResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<GenericMultipleUsersLookupResponseMeta>() {
           @Override
           public void write(JsonWriter out, GenericMultipleUsersLookupResponseMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenericMultipleUsersLookupResponseMeta read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!GenericMultipleUsersLookupResponseMeta.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `GenericMultipleUsersLookupResponseMeta` properties");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}
