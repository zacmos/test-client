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
import com.twitter.clientlib.model.Expansions;
import com.twitter.clientlib.model.FilteredStreamingTweetOneOfMatchingRules;
import com.twitter.clientlib.model.Tweet;
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
 * The values returned with a successful streamed tweet. Includes the user provided rules that the tweet matched.
 */
@ApiModel(description = "The values returned with a successful streamed tweet. Includes the user provided rules that the tweet matched.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilteredStreamingTweetOneOf {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Tweet data;

  public static final String SERIALIZED_NAME_MATCHING_RULES = "matching_rules";
  @SerializedName(SERIALIZED_NAME_MATCHING_RULES)
  private List<FilteredStreamingTweetOneOfMatchingRules> matchingRules = new ArrayList<>();

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private Expansions includes;

  public FilteredStreamingTweetOneOf() { 
  }

  public FilteredStreamingTweetOneOf data(Tweet data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Tweet getData() {
    return data;
  }


  public void setData(Tweet data) {
    this.data = data;
  }


  public FilteredStreamingTweetOneOf matchingRules(List<FilteredStreamingTweetOneOfMatchingRules> matchingRules) {
    
    this.matchingRules = matchingRules;
    return this;
  }

  public FilteredStreamingTweetOneOf addMatchingRulesItem(FilteredStreamingTweetOneOfMatchingRules matchingRulesItem) {
    this.matchingRules.add(matchingRulesItem);
    return this;
  }

   /**
   * The list of rules which matched the tweet
   * @return matchingRules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of rules which matched the tweet")

  public List<FilteredStreamingTweetOneOfMatchingRules> getMatchingRules() {
    return matchingRules;
  }


  public void setMatchingRules(List<FilteredStreamingTweetOneOfMatchingRules> matchingRules) {
    this.matchingRules = matchingRules;
  }


  public FilteredStreamingTweetOneOf includes(Expansions includes) {
    
    this.includes = includes;
    return this;
  }

   /**
   * Get includes
   * @return includes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Expansions getIncludes() {
    return includes;
  }


  public void setIncludes(Expansions includes) {
    this.includes = includes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteredStreamingTweetOneOf filteredStreamingTweetOneOf = (FilteredStreamingTweetOneOf) o;
    return Objects.equals(this.data, filteredStreamingTweetOneOf.data) &&
        Objects.equals(this.matchingRules, filteredStreamingTweetOneOf.matchingRules) &&
        Objects.equals(this.includes, filteredStreamingTweetOneOf.includes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, matchingRules, includes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteredStreamingTweetOneOf {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    matchingRules: ").append(toIndentedString(matchingRules)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("matching_rules");
    openapiFields.add("includes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("matching_rules");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilteredStreamingTweetOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilteredStreamingTweetOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilteredStreamingTweetOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilteredStreamingTweetOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FilteredStreamingTweetOneOf>() {
           @Override
           public void write(JsonWriter out, FilteredStreamingTweetOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilteredStreamingTweetOneOf read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!FilteredStreamingTweetOneOf.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `FilteredStreamingTweetOneOf` properties");
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : FilteredStreamingTweetOneOf.openapiRequiredFields) {
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