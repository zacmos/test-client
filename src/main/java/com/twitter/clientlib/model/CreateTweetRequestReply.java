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
import java.util.ArrayList;
import java.util.List;

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
 * Tweet information of the Tweet being replied to.
 */
@ApiModel(description = "Tweet information of the Tweet being replied to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTweetRequestReply {
  public static final String SERIALIZED_NAME_IN_REPLY_TO_TWEET_ID = "in_reply_to_tweet_id";
  @SerializedName(SERIALIZED_NAME_IN_REPLY_TO_TWEET_ID)
  private String inReplyToTweetId;

  public static final String SERIALIZED_NAME_EXCLUDE_REPLY_USER_IDS = "exclude_reply_user_ids";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_REPLY_USER_IDS)
  private List<String> excludeReplyUserIds = null;

  public CreateTweetRequestReply() { 
  }

  public CreateTweetRequestReply inReplyToTweetId(String inReplyToTweetId) {
    
    this.inReplyToTweetId = inReplyToTweetId;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return inReplyToTweetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1346889436626259968", value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getInReplyToTweetId() {
    return inReplyToTweetId;
  }


  public void setInReplyToTweetId(String inReplyToTweetId) {
    this.inReplyToTweetId = inReplyToTweetId;
  }


  public CreateTweetRequestReply excludeReplyUserIds(List<String> excludeReplyUserIds) {
    
    this.excludeReplyUserIds = excludeReplyUserIds;
    return this;
  }

  public CreateTweetRequestReply addExcludeReplyUserIdsItem(String excludeReplyUserIdsItem) {
    if (this.excludeReplyUserIds == null) {
      this.excludeReplyUserIds = new ArrayList<>();
    }
    this.excludeReplyUserIds.add(excludeReplyUserIdsItem);
    return this;
  }

   /**
   * A list of User Ids to be excluded from the reply Tweet.
   * @return excludeReplyUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of User Ids to be excluded from the reply Tweet.")

  public List<String> getExcludeReplyUserIds() {
    return excludeReplyUserIds;
  }


  public void setExcludeReplyUserIds(List<String> excludeReplyUserIds) {
    this.excludeReplyUserIds = excludeReplyUserIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTweetRequestReply createTweetRequestReply = (CreateTweetRequestReply) o;
    return Objects.equals(this.inReplyToTweetId, createTweetRequestReply.inReplyToTweetId) &&
        Objects.equals(this.excludeReplyUserIds, createTweetRequestReply.excludeReplyUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inReplyToTweetId, excludeReplyUserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTweetRequestReply {\n");
    sb.append("    inReplyToTweetId: ").append(toIndentedString(inReplyToTweetId)).append("\n");
    sb.append("    excludeReplyUserIds: ").append(toIndentedString(excludeReplyUserIds)).append("\n");
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
    openapiFields.add("in_reply_to_tweet_id");
    openapiFields.add("exclude_reply_user_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTweetRequestReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTweetRequestReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTweetRequestReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTweetRequestReply.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTweetRequestReply>() {
           @Override
           public void write(JsonWriter out, CreateTweetRequestReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTweetRequestReply read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!CreateTweetRequestReply.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `CreateTweetRequestReply` properties");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}