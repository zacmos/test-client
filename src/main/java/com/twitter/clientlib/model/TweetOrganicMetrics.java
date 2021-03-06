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
 * Organic nonpublic engagement metrics for the Tweet at the time of the request.
 */
@ApiModel(description = "Organic nonpublic engagement metrics for the Tweet at the time of the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetOrganicMetrics {
  public static final String SERIALIZED_NAME_IMPRESSION_COUNT = "impression_count";
  @SerializedName(SERIALIZED_NAME_IMPRESSION_COUNT)
  private Integer impressionCount;

  public static final String SERIALIZED_NAME_RETWEET_COUNT = "retweet_count";
  @SerializedName(SERIALIZED_NAME_RETWEET_COUNT)
  private Integer retweetCount;

  public static final String SERIALIZED_NAME_REPLY_COUNT = "reply_count";
  @SerializedName(SERIALIZED_NAME_REPLY_COUNT)
  private Integer replyCount;

  public static final String SERIALIZED_NAME_LIKE_COUNT = "like_count";
  @SerializedName(SERIALIZED_NAME_LIKE_COUNT)
  private Integer likeCount;

  public TweetOrganicMetrics() { 
  }

  public TweetOrganicMetrics impressionCount(Integer impressionCount) {
    
    this.impressionCount = impressionCount;
    return this;
  }

   /**
   * Number of times this Tweet has been viewed.
   * @return impressionCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of times this Tweet has been viewed.")

  public Integer getImpressionCount() {
    return impressionCount;
  }


  public void setImpressionCount(Integer impressionCount) {
    this.impressionCount = impressionCount;
  }


  public TweetOrganicMetrics retweetCount(Integer retweetCount) {
    
    this.retweetCount = retweetCount;
    return this;
  }

   /**
   * Number of times this Tweet has been Retweeted.
   * @return retweetCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of times this Tweet has been Retweeted.")

  public Integer getRetweetCount() {
    return retweetCount;
  }


  public void setRetweetCount(Integer retweetCount) {
    this.retweetCount = retweetCount;
  }


  public TweetOrganicMetrics replyCount(Integer replyCount) {
    
    this.replyCount = replyCount;
    return this;
  }

   /**
   * Number of times this Tweet has been replied to.
   * @return replyCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of times this Tweet has been replied to.")

  public Integer getReplyCount() {
    return replyCount;
  }


  public void setReplyCount(Integer replyCount) {
    this.replyCount = replyCount;
  }


  public TweetOrganicMetrics likeCount(Integer likeCount) {
    
    this.likeCount = likeCount;
    return this;
  }

   /**
   * Number of times this Tweet has been liked.
   * @return likeCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of times this Tweet has been liked.")

  public Integer getLikeCount() {
    return likeCount;
  }


  public void setLikeCount(Integer likeCount) {
    this.likeCount = likeCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetOrganicMetrics tweetOrganicMetrics = (TweetOrganicMetrics) o;
    return Objects.equals(this.impressionCount, tweetOrganicMetrics.impressionCount) &&
        Objects.equals(this.retweetCount, tweetOrganicMetrics.retweetCount) &&
        Objects.equals(this.replyCount, tweetOrganicMetrics.replyCount) &&
        Objects.equals(this.likeCount, tweetOrganicMetrics.likeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impressionCount, retweetCount, replyCount, likeCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetOrganicMetrics {\n");
    sb.append("    impressionCount: ").append(toIndentedString(impressionCount)).append("\n");
    sb.append("    retweetCount: ").append(toIndentedString(retweetCount)).append("\n");
    sb.append("    replyCount: ").append(toIndentedString(replyCount)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
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
    openapiFields.add("impression_count");
    openapiFields.add("retweet_count");
    openapiFields.add("reply_count");
    openapiFields.add("like_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("impression_count");
    openapiRequiredFields.add("retweet_count");
    openapiRequiredFields.add("reply_count");
    openapiRequiredFields.add("like_count");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetOrganicMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetOrganicMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetOrganicMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetOrganicMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetOrganicMetrics>() {
           @Override
           public void write(JsonWriter out, TweetOrganicMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetOrganicMetrics read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!TweetOrganicMetrics.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `TweetOrganicMetrics` properties");
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : TweetOrganicMetrics.openapiRequiredFields) {
               if (obj.get(requiredField) == null) {
                 throw new IllegalArgumentException("The required field `" + requiredField + "` is not found in the JSON string");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}
