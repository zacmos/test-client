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
import com.twitter.clientlib.model.UserEntities;
import com.twitter.clientlib.model.UserPublicMetrics;
import com.twitter.clientlib.model.UserWithheld;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;

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
 * The Twitter User object
 */
@ApiModel(description = "The Twitter User object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PROTECTED = "protected";
  @SerializedName(SERIALIZED_NAME_PROTECTED)
  private Boolean _protected;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_WITHHELD = "withheld";
  @SerializedName(SERIALIZED_NAME_WITHHELD)
  private UserWithheld withheld;

  public static final String SERIALIZED_NAME_PROFILE_IMAGE_URL = "profile_image_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_IMAGE_URL)
  private URI profileImageUrl;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private UserEntities entities;

  public static final String SERIALIZED_NAME_PINNED_TWEET_ID = "pinned_tweet_id";
  @SerializedName(SERIALIZED_NAME_PINNED_TWEET_ID)
  private String pinnedTweetId;

  public static final String SERIALIZED_NAME_PUBLIC_METRICS = "public_metrics";
  @SerializedName(SERIALIZED_NAME_PUBLIC_METRICS)
  private UserPublicMetrics publicMetrics;

  public User() { 
  }

  public User id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2244994945", required = true, value = "Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public User createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation time of this user.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creation time of this user.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public User name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The friendly name of this user, as shown on their profile.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The friendly name of this user, as shown on their profile.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public User username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The Twitter handle (screen name) of this user.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Twitter handle (screen name) of this user.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public User _protected(Boolean _protected) {
    
    this._protected = _protected;
    return this;
  }

   /**
   * Indicates if this user has chosen to protect their Tweets (in other words, if this user&#39;s Tweets are private).
   * @return _protected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if this user has chosen to protect their Tweets (in other words, if this user's Tweets are private).")

  public Boolean getProtected() {
    return _protected;
  }


  public void setProtected(Boolean _protected) {
    this._protected = _protected;
  }


  public User verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Indicate if this user is a verified Twitter User.
   * @return verified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicate if this user is a verified Twitter User.")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public User withheld(UserWithheld withheld) {
    
    this.withheld = withheld;
    return this;
  }

   /**
   * Get withheld
   * @return withheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserWithheld getWithheld() {
    return withheld;
  }


  public void setWithheld(UserWithheld withheld) {
    this.withheld = withheld;
  }


  public User profileImageUrl(URI profileImageUrl) {
    
    this.profileImageUrl = profileImageUrl;
    return this;
  }

   /**
   * The URL to the profile image for this user.
   * @return profileImageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to the profile image for this user.")

  public URI getProfileImageUrl() {
    return profileImageUrl;
  }


  public void setProfileImageUrl(URI profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
  }


  public User location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The location specified in the user&#39;s profile, if the user provided one. As this is a freeform value, it may not indicate a valid location, but it may be fuzzily evaluated when performing searches with location queries.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The location specified in the user's profile, if the user provided one. As this is a freeform value, it may not indicate a valid location, but it may be fuzzily evaluated when performing searches with location queries.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public User url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL specified in the user&#39;s profile.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL specified in the user's profile.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public User description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The text of this user&#39;s profile description (also known as bio), if the user provided one.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text of this user's profile description (also known as bio), if the user provided one.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public User entities(UserEntities entities) {
    
    this.entities = entities;
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserEntities getEntities() {
    return entities;
  }


  public void setEntities(UserEntities entities) {
    this.entities = entities;
  }


  public User pinnedTweetId(String pinnedTweetId) {
    
    this.pinnedTweetId = pinnedTweetId;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return pinnedTweetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1346889436626259968", value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getPinnedTweetId() {
    return pinnedTweetId;
  }


  public void setPinnedTweetId(String pinnedTweetId) {
    this.pinnedTweetId = pinnedTweetId;
  }


  public User publicMetrics(UserPublicMetrics publicMetrics) {
    
    this.publicMetrics = publicMetrics;
    return this;
  }

   /**
   * Get publicMetrics
   * @return publicMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserPublicMetrics getPublicMetrics() {
    return publicMetrics;
  }


  public void setPublicMetrics(UserPublicMetrics publicMetrics) {
    this.publicMetrics = publicMetrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this._protected, user._protected) &&
        Objects.equals(this.verified, user.verified) &&
        Objects.equals(this.withheld, user.withheld) &&
        Objects.equals(this.profileImageUrl, user.profileImageUrl) &&
        Objects.equals(this.location, user.location) &&
        Objects.equals(this.url, user.url) &&
        Objects.equals(this.description, user.description) &&
        Objects.equals(this.entities, user.entities) &&
        Objects.equals(this.pinnedTweetId, user.pinnedTweetId) &&
        Objects.equals(this.publicMetrics, user.publicMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, name, username, _protected, verified, withheld, profileImageUrl, location, url, description, entities, pinnedTweetId, publicMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    withheld: ").append(toIndentedString(withheld)).append("\n");
    sb.append("    profileImageUrl: ").append(toIndentedString(profileImageUrl)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pinnedTweetId: ").append(toIndentedString(pinnedTweetId)).append("\n");
    sb.append("    publicMetrics: ").append(toIndentedString(publicMetrics)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("name");
    openapiFields.add("username");
    openapiFields.add("protected");
    openapiFields.add("verified");
    openapiFields.add("withheld");
    openapiFields.add("profile_image_url");
    openapiFields.add("location");
    openapiFields.add("url");
    openapiFields.add("description");
    openapiFields.add("entities");
    openapiFields.add("pinned_tweet_id");
    openapiFields.add("public_metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("username");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!User.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `User` properties");
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : User.openapiRequiredFields) {
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
