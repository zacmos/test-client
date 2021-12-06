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
import com.twitter.clientlib.model.GenericMultipleUsersLookupResponseMeta;
import com.twitter.clientlib.model.Problem;
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
 * GenericMultipleUsersLookupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GenericMultipleUsersLookupResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<User> data = null;

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private Expansions includes;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Problem> errors = null;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private GenericMultipleUsersLookupResponseMeta meta;

  public GenericMultipleUsersLookupResponse() { 
  }

  public GenericMultipleUsersLookupResponse data(List<User> data) {
    
    this.data = data;
    return this;
  }

  public GenericMultipleUsersLookupResponse addDataItem(User dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<User> getData() {
    return data;
  }


  public void setData(List<User> data) {
    this.data = data;
  }


  public GenericMultipleUsersLookupResponse includes(Expansions includes) {
    
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


  public GenericMultipleUsersLookupResponse errors(List<Problem> errors) {
    
    this.errors = errors;
    return this;
  }

  public GenericMultipleUsersLookupResponse addErrorsItem(Problem errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Problem> getErrors() {
    return errors;
  }


  public void setErrors(List<Problem> errors) {
    this.errors = errors;
  }


  public GenericMultipleUsersLookupResponse meta(GenericMultipleUsersLookupResponseMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GenericMultipleUsersLookupResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(GenericMultipleUsersLookupResponseMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericMultipleUsersLookupResponse genericMultipleUsersLookupResponse = (GenericMultipleUsersLookupResponse) o;
    return Objects.equals(this.data, genericMultipleUsersLookupResponse.data) &&
        Objects.equals(this.includes, genericMultipleUsersLookupResponse.includes) &&
        Objects.equals(this.errors, genericMultipleUsersLookupResponse.errors) &&
        Objects.equals(this.meta, genericMultipleUsersLookupResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, includes, errors, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericMultipleUsersLookupResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("includes");
    openapiFields.add("errors");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenericMultipleUsersLookupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenericMultipleUsersLookupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenericMultipleUsersLookupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenericMultipleUsersLookupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GenericMultipleUsersLookupResponse>() {
           @Override
           public void write(JsonWriter out, GenericMultipleUsersLookupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenericMultipleUsersLookupResponse read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!GenericMultipleUsersLookupResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `GenericMultipleUsersLookupResponse` properties");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}
