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
import com.twitter.clientlib.model.ListMemberResponseData;
import com.twitter.clientlib.model.Problem;
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
 * ListMemberResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListMemberResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ListMemberResponseData data;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Problem> errors = null;

  public ListMemberResponse() { 
  }

  public ListMemberResponse data(ListMemberResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListMemberResponseData getData() {
    return data;
  }


  public void setData(ListMemberResponseData data) {
    this.data = data;
  }


  public ListMemberResponse errors(List<Problem> errors) {
    
    this.errors = errors;
    return this;
  }

  public ListMemberResponse addErrorsItem(Problem errorsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMemberResponse listMemberResponse = (ListMemberResponse) o;
    return Objects.equals(this.data, listMemberResponse.data) &&
        Objects.equals(this.errors, listMemberResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMemberResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListMemberResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListMemberResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListMemberResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListMemberResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListMemberResponse>() {
           @Override
           public void write(JsonWriter out, ListMemberResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListMemberResponse read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!ListMemberResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `ListMemberResponse` properties");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}
