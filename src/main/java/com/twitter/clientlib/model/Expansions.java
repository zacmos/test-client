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
import com.twitter.clientlib.model.Media;
import com.twitter.clientlib.model.Place;
import com.twitter.clientlib.model.Poll;
import com.twitter.clientlib.model.Tweet;
import com.twitter.clientlib.model.User;
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
 * Expansions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Expansions {
  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<User> users = null;

  public static final String SERIALIZED_NAME_TWEETS = "tweets";
  @SerializedName(SERIALIZED_NAME_TWEETS)
  private List<Tweet> tweets = null;

  public static final String SERIALIZED_NAME_PLACES = "places";
  @SerializedName(SERIALIZED_NAME_PLACES)
  private List<Place> places = null;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private List<Media> media = null;

  public static final String SERIALIZED_NAME_POLLS = "polls";
  @SerializedName(SERIALIZED_NAME_POLLS)
  private List<Poll> polls = null;

  public Expansions() { 
  }

  public Expansions users(List<User> users) {
    
    this.users = users;
    return this;
  }

  public Expansions addUsersItem(User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<User> getUsers() {
    return users;
  }


  public void setUsers(List<User> users) {
    this.users = users;
  }


  public Expansions tweets(List<Tweet> tweets) {
    
    this.tweets = tweets;
    return this;
  }

  public Expansions addTweetsItem(Tweet tweetsItem) {
    if (this.tweets == null) {
      this.tweets = new ArrayList<>();
    }
    this.tweets.add(tweetsItem);
    return this;
  }

   /**
   * Get tweets
   * @return tweets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Tweet> getTweets() {
    return tweets;
  }


  public void setTweets(List<Tweet> tweets) {
    this.tweets = tweets;
  }


  public Expansions places(List<Place> places) {
    
    this.places = places;
    return this;
  }

  public Expansions addPlacesItem(Place placesItem) {
    if (this.places == null) {
      this.places = new ArrayList<>();
    }
    this.places.add(placesItem);
    return this;
  }

   /**
   * Get places
   * @return places
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Place> getPlaces() {
    return places;
  }


  public void setPlaces(List<Place> places) {
    this.places = places;
  }


  public Expansions media(List<Media> media) {
    
    this.media = media;
    return this;
  }

  public Expansions addMediaItem(Media mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Media> getMedia() {
    return media;
  }


  public void setMedia(List<Media> media) {
    this.media = media;
  }


  public Expansions polls(List<Poll> polls) {
    
    this.polls = polls;
    return this;
  }

  public Expansions addPollsItem(Poll pollsItem) {
    if (this.polls == null) {
      this.polls = new ArrayList<>();
    }
    this.polls.add(pollsItem);
    return this;
  }

   /**
   * Get polls
   * @return polls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Poll> getPolls() {
    return polls;
  }


  public void setPolls(List<Poll> polls) {
    this.polls = polls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expansions expansions = (Expansions) o;
    return Objects.equals(this.users, expansions.users) &&
        Objects.equals(this.tweets, expansions.tweets) &&
        Objects.equals(this.places, expansions.places) &&
        Objects.equals(this.media, expansions.media) &&
        Objects.equals(this.polls, expansions.polls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, tweets, places, media, polls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expansions {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    tweets: ").append(toIndentedString(tweets)).append("\n");
    sb.append("    places: ").append(toIndentedString(places)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    polls: ").append(toIndentedString(polls)).append("\n");
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
    openapiFields.add("users");
    openapiFields.add("tweets");
    openapiFields.add("places");
    openapiFields.add("media");
    openapiFields.add("polls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Expansions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Expansions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Expansions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Expansions.class));

       return (TypeAdapter<T>) new TypeAdapter<Expansions>() {
           @Override
           public void write(JsonWriter out, Expansions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Expansions read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!Expansions.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `Expansions` properties");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}
