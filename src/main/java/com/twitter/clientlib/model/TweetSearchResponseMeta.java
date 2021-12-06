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
 * TweetSearchResponseMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetSearchResponseMeta {
  public static final String SERIALIZED_NAME_NEWEST_ID = "newest_id";
  @SerializedName(SERIALIZED_NAME_NEWEST_ID)
  private String newestId;

  public static final String SERIALIZED_NAME_OLDEST_ID = "oldest_id";
  @SerializedName(SERIALIZED_NAME_OLDEST_ID)
  private String oldestId;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "next_token";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_RESULT_COUNT = "result_count";
  @SerializedName(SERIALIZED_NAME_RESULT_COUNT)
  private Integer resultCount;

  public TweetSearchResponseMeta() { 
  }

  public TweetSearchResponseMeta newestId(String newestId) {
    
    this.newestId = newestId;
    return this;
  }

   /**
   * Most recent Tweet Id returned by search query
   * @return newestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Most recent Tweet Id returned by search query")

  public String getNewestId() {
    return newestId;
  }


  public void setNewestId(String newestId) {
    this.newestId = newestId;
  }


  public TweetSearchResponseMeta oldestId(String oldestId) {
    
    this.oldestId = oldestId;
    return this;
  }

   /**
   * Oldest Tweet Id returned by search query
   * @return oldestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oldest Tweet Id returned by search query")

  public String getOldestId() {
    return oldestId;
  }


  public void setOldestId(String oldestId) {
    this.oldestId = oldestId;
  }


  public TweetSearchResponseMeta nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * This value is used to get the next &#39;page&#39; of results by providing it to the next_token parameter.
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This value is used to get the next 'page' of results by providing it to the next_token parameter.")

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public TweetSearchResponseMeta resultCount(Integer resultCount) {
    
    this.resultCount = resultCount;
    return this;
  }

   /**
   * Number of search query results
   * @return resultCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of search query results")

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
    TweetSearchResponseMeta tweetSearchResponseMeta = (TweetSearchResponseMeta) o;
    return Objects.equals(this.newestId, tweetSearchResponseMeta.newestId) &&
        Objects.equals(this.oldestId, tweetSearchResponseMeta.oldestId) &&
        Objects.equals(this.nextToken, tweetSearchResponseMeta.nextToken) &&
        Objects.equals(this.resultCount, tweetSearchResponseMeta.resultCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newestId, oldestId, nextToken, resultCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetSearchResponseMeta {\n");
    sb.append("    newestId: ").append(toIndentedString(newestId)).append("\n");
    sb.append("    oldestId: ").append(toIndentedString(oldestId)).append("\n");
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
    openapiFields.add("newest_id");
    openapiFields.add("oldest_id");
    openapiFields.add("next_token");
    openapiFields.add("result_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetSearchResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetSearchResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetSearchResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetSearchResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetSearchResponseMeta>() {
           @Override
           public void write(JsonWriter out, TweetSearchResponseMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetSearchResponseMeta read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!TweetSearchResponseMeta.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `TweetSearchResponseMeta` properties");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}