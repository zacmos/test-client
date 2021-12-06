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


import java.util.HashSet;
import java.util.Set;
import java.io.InputStream;

import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.TweetsStreamListenersExecutor;
import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;


public class HelloWorldStreaming {

  public static void main(String[] args) {

    // Credentials are taken from environment variables:
    //   TWITTER_BEARER_TOKEN, TWITTER_CONSUMER_KEY, TWITTER_CONSUMER_SECRET, TWITTER_TOKEN, TWITTER_TOKEN_SECRET
    // else instantiate TwitterApi with TwitterCredentials
    TwitterApi apiInstance = new TwitterApi();

    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");

    try {
      InputStream streamResult = apiInstance.sampleStream(null, tweetFields, null , null, null, null, 0);
      // sampleStream with TweetsStreamListenersExecutor
      Responder responder = new Responder();
      TweetsStreamListenersExecutor tsle = new TweetsStreamListenersExecutor(streamResult);
      tsle.addListener(responder);
      tsle.executeListeners();

//      // sampleStream directly using the InputStream result
//      try{
//         JSON json = new JSON();
//         Type localVarReturnType = new TypeToken<StreamingTweet>(){}.getType();
//         BufferedReader reader = new BufferedReader(new InputStreamReader(streamResult));
//         String line = reader.readLine();
//         while (line != null) {
//           System.out.println(json.getGson().fromJson(line, localVarReturnType).toString());
//           line = reader.readLine();
//         }
//      }catch (Exception e) {
//        e.printStackTrace();
//        System.out.println(e);
//      }
    } catch (ApiException e) {
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

class Responder implements com.twitter.clientlib.TweetsStreamListener {
  @Override
  public void actionOnTweetsStream(StreamingTweet streamingTweet) {
    Object response = streamingTweet.getActualInstance();
    if(response instanceof SingleTweetLookupResponse) {
      System.out.println("New streaming tweet: " + ((SingleTweetLookupResponse) response).getData().getText());
    } else if(response instanceof StreamingTweetOneOf) {
      ((StreamingTweetOneOf) response).getErrors().forEach(System.out::println);
    }
  }
}
