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
 * Describes a choice in a Poll object.
 */
@ApiModel(description = "Describes a choice in a Poll object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PollOption {
  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_VOTES = "votes";
  @SerializedName(SERIALIZED_NAME_VOTES)
  private Integer votes;

  public PollOption() { 
  }

  public PollOption position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Position of this choice in the poll.
   * @return position
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Position of this choice in the poll.")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public PollOption label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The text of a poll choice.
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The text of a poll choice.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public PollOption votes(Integer votes) {
    
    this.votes = votes;
    return this;
  }

   /**
   * Number of users who voted for this choice.
   * @return votes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of users who voted for this choice.")

  public Integer getVotes() {
    return votes;
  }


  public void setVotes(Integer votes) {
    this.votes = votes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PollOption pollOption = (PollOption) o;
    return Objects.equals(this.position, pollOption.position) &&
        Objects.equals(this.label, pollOption.label) &&
        Objects.equals(this.votes, pollOption.votes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, label, votes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollOption {\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
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
    openapiFields.add("position");
    openapiFields.add("label");
    openapiFields.add("votes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("position");
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("votes");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PollOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PollOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PollOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PollOption.class));

       return (TypeAdapter<T>) new TypeAdapter<PollOption>() {
           @Override
           public void write(JsonWriter out, PollOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PollOption read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!PollOption.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `PollOption` properties");
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : PollOption.openapiRequiredFields) {
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
