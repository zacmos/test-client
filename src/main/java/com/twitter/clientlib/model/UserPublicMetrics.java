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
 * A list of metrics for this user
 */
@ApiModel(description = "A list of metrics for this user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserPublicMetrics {
  public static final String SERIALIZED_NAME_FOLLOWERS_COUNT = "followers_count";
  @SerializedName(SERIALIZED_NAME_FOLLOWERS_COUNT)
  private Integer followersCount;

  public static final String SERIALIZED_NAME_FOLLOWING_COUNT = "following_count";
  @SerializedName(SERIALIZED_NAME_FOLLOWING_COUNT)
  private Integer followingCount;

  public static final String SERIALIZED_NAME_TWEET_COUNT = "tweet_count";
  @SerializedName(SERIALIZED_NAME_TWEET_COUNT)
  private Integer tweetCount;

  public static final String SERIALIZED_NAME_LISTED_COUNT = "listed_count";
  @SerializedName(SERIALIZED_NAME_LISTED_COUNT)
  private Integer listedCount;

  public UserPublicMetrics() { 
  }

  public UserPublicMetrics followersCount(Integer followersCount) {
    
    this.followersCount = followersCount;
    return this;
  }

   /**
   * Number of users who are following this user.
   * @return followersCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of users who are following this user.")

  public Integer getFollowersCount() {
    return followersCount;
  }


  public void setFollowersCount(Integer followersCount) {
    this.followersCount = followersCount;
  }


  public UserPublicMetrics followingCount(Integer followingCount) {
    
    this.followingCount = followingCount;
    return this;
  }

   /**
   * Number of users this user is following.
   * @return followingCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of users this user is following.")

  public Integer getFollowingCount() {
    return followingCount;
  }


  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }


  public UserPublicMetrics tweetCount(Integer tweetCount) {
    
    this.tweetCount = tweetCount;
    return this;
  }

   /**
   * The number of Tweets (including Retweets) posted by this user.
   * @return tweetCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of Tweets (including Retweets) posted by this user.")

  public Integer getTweetCount() {
    return tweetCount;
  }


  public void setTweetCount(Integer tweetCount) {
    this.tweetCount = tweetCount;
  }


  public UserPublicMetrics listedCount(Integer listedCount) {
    
    this.listedCount = listedCount;
    return this;
  }

   /**
   * The number of lists that include this user.
   * @return listedCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of lists that include this user.")

  public Integer getListedCount() {
    return listedCount;
  }


  public void setListedCount(Integer listedCount) {
    this.listedCount = listedCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPublicMetrics userPublicMetrics = (UserPublicMetrics) o;
    return Objects.equals(this.followersCount, userPublicMetrics.followersCount) &&
        Objects.equals(this.followingCount, userPublicMetrics.followingCount) &&
        Objects.equals(this.tweetCount, userPublicMetrics.tweetCount) &&
        Objects.equals(this.listedCount, userPublicMetrics.listedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followersCount, followingCount, tweetCount, listedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPublicMetrics {\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
    sb.append("    tweetCount: ").append(toIndentedString(tweetCount)).append("\n");
    sb.append("    listedCount: ").append(toIndentedString(listedCount)).append("\n");
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
    openapiFields.add("followers_count");
    openapiFields.add("following_count");
    openapiFields.add("tweet_count");
    openapiFields.add("listed_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("followers_count");
    openapiRequiredFields.add("following_count");
    openapiRequiredFields.add("tweet_count");
    openapiRequiredFields.add("listed_count");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserPublicMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserPublicMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserPublicMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserPublicMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<UserPublicMetrics>() {
           @Override
           public void write(JsonWriter out, UserPublicMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserPublicMetrics read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!UserPublicMetrics.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `UserPublicMetrics` properties");
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : UserPublicMetrics.openapiRequiredFields) {
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
