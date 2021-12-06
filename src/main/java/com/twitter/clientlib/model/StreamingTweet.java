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
import com.twitter.clientlib.model.Problem;
import com.twitter.clientlib.model.SingleTweetLookupResponse;
import com.twitter.clientlib.model.StreamingTweetOneOf;
import com.twitter.clientlib.model.Tweet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.twitter.clientlib.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StreamingTweet extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(StreamingTweet.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StreamingTweet.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StreamingTweet' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SingleTweetLookupResponse> adapterSingleTweetLookupResponse = gson.getDelegateAdapter(this, TypeToken.get(SingleTweetLookupResponse.class));
            final TypeAdapter<StreamingTweetOneOf> adapterStreamingTweetOneOf = gson.getDelegateAdapter(this, TypeToken.get(StreamingTweetOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<StreamingTweet>() {
                @Override
                public void write(JsonWriter out, StreamingTweet value) throws IOException {
                    // check if the actual instance is of the type `SingleTweetLookupResponse`
                    if (value.getActualInstance() instanceof SingleTweetLookupResponse) {
                        JsonObject obj = adapterSingleTweetLookupResponse.toJsonTree((SingleTweetLookupResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                    }

                    // check if the actual instance is of the type `StreamingTweetOneOf`
                    if (value.getActualInstance() instanceof StreamingTweetOneOf) {
                        JsonObject obj = adapterStreamingTweetOneOf.toJsonTree((StreamingTweetOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                    }

                    throw new IOException("Failed to deserialize as the type doesn't match oneOf schemas: SingleTweetLookupResponse, StreamingTweetOneOf");
                }

                @Override
                public StreamingTweet read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;

                    // deserialize SingleTweetLookupResponse
                    try {
                        deserialized = adapterSingleTweetLookupResponse.fromJsonTree(jsonObject);
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SingleTweetLookupResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SingleTweetLookupResponse'", e);
                    }

                    // deserialize StreamingTweetOneOf
                    try {
                        deserialized = adapterStreamingTweetOneOf.fromJsonTree(jsonObject);
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'StreamingTweetOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'StreamingTweetOneOf'", e);
                    }

                    if (match == 1) {
                        StreamingTweet ret = new StreamingTweet();
                        ret.setActualInstance(deserialized);
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for StreamingTweet: %d classes match result, expected 1", match));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public StreamingTweet() {
        super("oneOf", Boolean.FALSE);
    }

    public StreamingTweet(SingleTweetLookupResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public StreamingTweet(StreamingTweetOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SingleTweetLookupResponse", new GenericType<SingleTweetLookupResponse>() {
        });
        schemas.put("StreamingTweetOneOf", new GenericType<StreamingTweetOneOf>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return StreamingTweet.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SingleTweetLookupResponse, StreamingTweetOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SingleTweetLookupResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof StreamingTweetOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SingleTweetLookupResponse, StreamingTweetOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * SingleTweetLookupResponse, StreamingTweetOneOf
     *
     * @return The actual instance (SingleTweetLookupResponse, StreamingTweetOneOf)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SingleTweetLookupResponse`. If the actual instance is not `SingleTweetLookupResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SingleTweetLookupResponse`
     * @throws ClassCastException if the instance is not `SingleTweetLookupResponse`
     */
    public SingleTweetLookupResponse getSingleTweetLookupResponse() throws ClassCastException {
        return (SingleTweetLookupResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `StreamingTweetOneOf`. If the actual instance is not `StreamingTweetOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StreamingTweetOneOf`
     * @throws ClassCastException if the instance is not `StreamingTweetOneOf`
     */
    public StreamingTweetOneOf getStreamingTweetOneOf() throws ClassCastException {
        return (StreamingTweetOneOf)super.getActualInstance();
    }

}

