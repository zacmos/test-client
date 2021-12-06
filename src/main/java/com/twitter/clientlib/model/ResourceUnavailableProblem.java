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
import com.twitter.clientlib.model.ClientDisconnectedProblem;
import com.twitter.clientlib.model.ClientForbiddenProblem;
import com.twitter.clientlib.model.ConflictProblem;
import com.twitter.clientlib.model.ConnectionExceptionProblem;
import com.twitter.clientlib.model.DisallowedResourceProblem;
import com.twitter.clientlib.model.DuplicateRuleProblem;
import com.twitter.clientlib.model.FieldUnauthorizedProblem;
import com.twitter.clientlib.model.GenericProblem;
import com.twitter.clientlib.model.InvalidRequestProblem;
import com.twitter.clientlib.model.InvalidRuleProblem;
import com.twitter.clientlib.model.NonCompliantRulesProblem;
import com.twitter.clientlib.model.OperationalDisconnectProblem;
import com.twitter.clientlib.model.Problem;
import com.twitter.clientlib.model.ResourceNotFoundProblem;
import com.twitter.clientlib.model.ResourceUnauthorizedProblem;
import com.twitter.clientlib.model.ResourceUnavailableProblem;
import com.twitter.clientlib.model.ResourceUnavailableProblemAllOf;
import com.twitter.clientlib.model.RulesCapProblem;
import com.twitter.clientlib.model.UnsupportedAuthenticationProblem;
import com.twitter.clientlib.model.UsageCapExceededProblem;
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
 * A problem that indicates a particular Tweet, User, etc. is not available to you.
 */
@ApiModel(description = "A problem that indicates a particular Tweet, User, etc. is not available to you.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResourceUnavailableProblem extends Problem {
  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  private String parameter;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  /**
   * Gets or Sets resourceType
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    USER("user"),
    
    TWEET("tweet"),
    
    MEDIA("media");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResourceTypeEnum fromValue(String value) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResourceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceTypeEnum resourceType;

  public ResourceUnavailableProblem() { 
    this.type = this.getClass().getSimpleName();
  }

  public ResourceUnavailableProblem parameter(String parameter) {
    
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getParameter() {
    return parameter;
  }


  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public ResourceUnavailableProblem resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public ResourceUnavailableProblem resourceType(ResourceTypeEnum resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }


  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceUnavailableProblem resourceUnavailableProblem = (ResourceUnavailableProblem) o;
    return Objects.equals(this.parameter, resourceUnavailableProblem.parameter) &&
        Objects.equals(this.resourceId, resourceUnavailableProblem.resourceId) &&
        Objects.equals(this.resourceType, resourceUnavailableProblem.resourceType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter, resourceId, resourceType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceUnavailableProblem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("detail");
    openapiFields.add("parameter");
    openapiFields.add("resource_id");
    openapiFields.add("resource_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("parameter");
    openapiRequiredFields.add("resource_id");
    openapiRequiredFields.add("resource_type");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("detail");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceUnavailableProblem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceUnavailableProblem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceUnavailableProblem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceUnavailableProblem.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceUnavailableProblem>() {
           @Override
           public void write(JsonWriter out, ResourceUnavailableProblem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceUnavailableProblem read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!ResourceUnavailableProblem.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `ResourceUnavailableProblem` properties");
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : ResourceUnavailableProblem.openapiRequiredFields) {
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
