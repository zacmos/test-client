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


package com.twitter.clientlib;


public class TwitterCredentials {
  private final static String  TWITTER_BEARER_TOKEN = "TWITTER_BEARER_TOKEN";
  private final static String  TWITTER_CONSUMER_KEY = "TWITTER_CONSUMER_KEY";
  private final static String  TWITTER_CONSUMER_SECRET = "TWITTER_CONSUMER_SECRET";
  private final static String  TWITTER_TOKEN = "TWITTER_TOKEN";
  private final static String  TWITTER_TOKEN_SECRET = "TWITTER_TOKEN_SECRET";

  private String bearerToken = System.getenv(TWITTER_BEARER_TOKEN);
  private String twitterConsumerKey = System.getenv(TWITTER_CONSUMER_KEY);
  private String twitterConsumerSecret = System.getenv(TWITTER_CONSUMER_SECRET);
  private String twitterToken = System.getenv(TWITTER_TOKEN);
  private String twitterTokenSecret = System.getenv(TWITTER_TOKEN_SECRET);

  public String getBearerToken() {
    return bearerToken;
  }

  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }

  public String getTwitterConsumerKey() {
    return twitterConsumerKey;
  }

  public void setTwitterConsumerKey(String twitterConsumerKey) {
    this.twitterConsumerKey = twitterConsumerKey;
  }

  public String getTwitterConsumerSecret() {
    return twitterConsumerSecret;
  }

  public void setTwitterConsumerSecret(String twitterConsumerSecret) {
    this.twitterConsumerSecret = twitterConsumerSecret;
  }

  public String getTwitterToken() {
    return twitterToken;
  }

  public void setTwitterToken(String twitterToken) {
    this.twitterToken = twitterToken;
  }

  public String getTwitterTokenSecret() {
    return twitterTokenSecret;
  }

  public void setTwitterTokenSecret(String twitterTokenSecret) {
    this.twitterTokenSecret = twitterTokenSecret;
  }

  public boolean isBearerToken() {
    return bearerToken != null;
  }

  public boolean isUserToken() {
    return twitterConsumerKey != null && twitterConsumerSecret != null && twitterToken != null && twitterTokenSecret != null;
  }
}