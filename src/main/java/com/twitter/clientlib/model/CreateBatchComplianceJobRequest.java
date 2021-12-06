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
import com.twitter.clientlib.model.ComplianceJobType;
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
 * A request to create a new batch compliance job.
 */
@ApiModel(description = "A request to create a new batch compliance job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateBatchComplianceJobRequest {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ComplianceJobType type;

  public static final String SERIALIZED_NAME_RESUMABLE = "resumable";
  @SerializedName(SERIALIZED_NAME_RESUMABLE)
  private Boolean resumable;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public CreateBatchComplianceJobRequest() { 
  }

  public CreateBatchComplianceJobRequest type(ComplianceJobType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ComplianceJobType getType() {
    return type;
  }


  public void setType(ComplianceJobType type) {
    this.type = type;
  }


  public CreateBatchComplianceJobRequest resumable(Boolean resumable) {
    
    this.resumable = resumable;
    return this;
  }

   /**
   * If true, this endpoint will return a pre-signed URL with resumable uploads enabled
   * @return resumable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this endpoint will return a pre-signed URL with resumable uploads enabled")

  public Boolean getResumable() {
    return resumable;
  }


  public void setResumable(Boolean resumable) {
    this.resumable = resumable;
  }


  public CreateBatchComplianceJobRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * User-provided name for a compliance job
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-job", value = "User-provided name for a compliance job")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBatchComplianceJobRequest createBatchComplianceJobRequest = (CreateBatchComplianceJobRequest) o;
    return Objects.equals(this.type, createBatchComplianceJobRequest.type) &&
        Objects.equals(this.resumable, createBatchComplianceJobRequest.resumable) &&
        Objects.equals(this.name, createBatchComplianceJobRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, resumable, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBatchComplianceJobRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    resumable: ").append(toIndentedString(resumable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("resumable");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBatchComplianceJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBatchComplianceJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBatchComplianceJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBatchComplianceJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBatchComplianceJobRequest>() {
           @Override
           public void write(JsonWriter out, CreateBatchComplianceJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBatchComplianceJobRequest read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!CreateBatchComplianceJobRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `CreateBatchComplianceJobRequest` properties");
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : CreateBatchComplianceJobRequest.openapiRequiredFields) {
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