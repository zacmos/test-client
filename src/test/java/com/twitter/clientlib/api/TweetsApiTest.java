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


package com.twitter.clientlib.api;

import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.model.Error;
import com.twitter.clientlib.model.MultiTweetLookupResponse;
import com.twitter.clientlib.model.MultiUserLookupResponse;
import java.util.Set;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

/**
 * API tests for TweetsApi
 */
@Ignore
public class TweetsApiTest {

    private final TweetsApi api = new TweetsApi();

    
    /**
     * Retrieve the list of users who purchased a ticket to the given space
     *
     * Retrieves the list of users who purchased a ticket to the given space
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spaceBuyersTest() throws ApiException {
        String id = null;
        Set<String> userFields = null;
                MultiUserLookupResponse response = api.spaceBuyers(id, userFields);
        // TODO: test validations
    }
    
    /**
     * Retrieve tweets from a Space
     *
     * Retrieves tweets shared in the specified space
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spaceTweetsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        Set<String> tweetFields = null;
                MultiTweetLookupResponse response = api.spaceTweets(id, maxResults, tweetFields);
        // TODO: test validations
    }
    
}
