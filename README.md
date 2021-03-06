# Twitter API Client Library for Java.

**Note: This SDK is a preview and is not ready for production**

You can find examples of using the SDK under the [src/](src/test/java/com/twitter/clientlib/) directory

**Note: Only Twitter API V2 is supported, Twitter API V2 is in early access**


- API version: latest

Twitter API v2 available endpoints

  For more information, please visit [https://developer.twitter.com/](https://developer.twitter.com/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.twitter</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>latest</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.twitter:openapi-java-client:latest"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-latest.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.api.TwitterApi;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class TwitterApiExample {

    public static void main(String[] args) {
        // Credentials are used from:
        // 1. Environment variables:
        //       TWITTER_BEARER_TOKEN, TWITTER_CONSUMER_KEY, TWITTER_CONSUMER_SECRET, TWITTER_TOKEN, TWITTER_TOKEN_SECRET
        // 2. Can sent to TwitterApi constructor as TwitterCredentials.

        TwitterApi apiInstance = new TwitterApi(); 
        AddOrDeleteRulesRequest addOrDeleteRulesRequest = new AddOrDeleteRulesRequest(); // AddOrDeleteRulesRequest | 
        Boolean dryRun = true; // Boolean | Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes.
        try {
            AddOrDeleteRulesResponse result = apiInstance.addOrDeleteRules(addOrDeleteRulesRequest, dryRun);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TwitterApi#addOrDeleteRules");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.twitter.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TwitterApi* | [**addOrDeleteRules**](docs/TwitterApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules
*TwitterApi* | [**createBatchComplianceJob**](docs/TwitterApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job
*TwitterApi* | [**createTweet**](docs/TwitterApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet
*TwitterApi* | [**deleteTweetById**](docs/TwitterApi.md#deleteTweetById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID
*TwitterApi* | [**findMyUser**](docs/TwitterApi.md#findMyUser) | **GET** /2/users/me | User lookup me
*TwitterApi* | [**findSpaceById**](docs/TwitterApi.md#findSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID
*TwitterApi* | [**findSpacesByCreatorIds**](docs/TwitterApi.md#findSpacesByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators
*TwitterApi* | [**findSpacesByIds**](docs/TwitterApi.md#findSpacesByIds) | **GET** /2/spaces | Space lookup up Space IDs
*TwitterApi* | [**findTweetById**](docs/TwitterApi.md#findTweetById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID
*TwitterApi* | [**findTweetsById**](docs/TwitterApi.md#findTweetsById) | **GET** /2/tweets | Tweet lookup by Tweet IDs
*TwitterApi* | [**findUserById**](docs/TwitterApi.md#findUserById) | **GET** /2/users/{id} | User lookup by ID
*TwitterApi* | [**findUserByUsername**](docs/TwitterApi.md#findUserByUsername) | **GET** /2/users/by/username/{username} | User lookup by username
*TwitterApi* | [**findUsersById**](docs/TwitterApi.md#findUsersById) | **GET** /2/users | User lookup by IDs
*TwitterApi* | [**findUsersByUsername**](docs/TwitterApi.md#findUsersByUsername) | **GET** /2/users/by | User lookup by usernames
*TwitterApi* | [**getBatchComplianceJob**](docs/TwitterApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get compliance job
*TwitterApi* | [**getOpenApiSpec**](docs/TwitterApi.md#getOpenApiSpec) | **GET** /2/openapi.json | Returns the open api spec document.
*TwitterApi* | [**getRules**](docs/TwitterApi.md#getRules) | **GET** /2/tweets/search/stream/rules | Rules lookup
*TwitterApi* | [**getUserListMemberships**](docs/TwitterApi.md#getUserListMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships
*TwitterApi* | [**hideReplyById**](docs/TwitterApi.md#hideReplyById) | **PUT** /2/tweets/{id}/hidden | Hide replies
*TwitterApi* | [**listAddMember**](docs/TwitterApi.md#listAddMember) | **POST** /2/lists/{id}/members | Add a List member
*TwitterApi* | [**listBatchComplianceJobs**](docs/TwitterApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List compliance jobs
*TwitterApi* | [**listGetFollowers**](docs/TwitterApi.md#listGetFollowers) | **GET** /2/lists/{id}/followers | Returns user objects that follow a List by the provided List ID
*TwitterApi* | [**listGetMembers**](docs/TwitterApi.md#listGetMembers) | **GET** /2/lists/{id}/members | Returns user objects that are members of a List by the provided List ID
*TwitterApi* | [**listIdCreate**](docs/TwitterApi.md#listIdCreate) | **POST** /2/lists | Create List
*TwitterApi* | [**listIdDelete**](docs/TwitterApi.md#listIdDelete) | **DELETE** /2/lists/{id} | Delete List
*TwitterApi* | [**listIdGet**](docs/TwitterApi.md#listIdGet) | **GET** /2/lists/{id} | List lookup by List ID
*TwitterApi* | [**listIdUpdate**](docs/TwitterApi.md#listIdUpdate) | **PUT** /2/lists/{id} | Update List
*TwitterApi* | [**listRemoveMember**](docs/TwitterApi.md#listRemoveMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member
*TwitterApi* | [**listUserFollow**](docs/TwitterApi.md#listUserFollow) | **POST** /2/users/{id}/followed_lists | Follow a List
*TwitterApi* | [**listUserOwnedLists**](docs/TwitterApi.md#listUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists
*TwitterApi* | [**listUserPin**](docs/TwitterApi.md#listUserPin) | **POST** /2/users/{id}/pinned_lists | Pin a List
*TwitterApi* | [**listUserPinnedLists**](docs/TwitterApi.md#listUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists
*TwitterApi* | [**listUserUnfollow**](docs/TwitterApi.md#listUserUnfollow) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List
*TwitterApi* | [**listUserUnpin**](docs/TwitterApi.md#listUserUnpin) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List
*TwitterApi* | [**listsIdTweets**](docs/TwitterApi.md#listsIdTweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID
*TwitterApi* | [**sampleStream**](docs/TwitterApi.md#sampleStream) | **GET** /2/tweets/sample/stream | Sample stream
*TwitterApi* | [**searchSpaces**](docs/TwitterApi.md#searchSpaces) | **GET** /2/spaces/search | Search for Spaces
*TwitterApi* | [**searchStream**](docs/TwitterApi.md#searchStream) | **GET** /2/tweets/search/stream | Filtered stream
*TwitterApi* | [**spaceBuyers**](docs/TwitterApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
*TwitterApi* | [**spaceTweets**](docs/TwitterApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space
*TwitterApi* | [**tweetCountsFullArchiveSearch**](docs/TwitterApi.md#tweetCountsFullArchiveSearch) | **GET** /2/tweets/counts/all | Full archive search counts
*TwitterApi* | [**tweetCountsRecentSearch**](docs/TwitterApi.md#tweetCountsRecentSearch) | **GET** /2/tweets/counts/recent | Recent search counts
*TwitterApi* | [**tweetsFullarchiveSearch**](docs/TwitterApi.md#tweetsFullarchiveSearch) | **GET** /2/tweets/search/all | Full-archive search
*TwitterApi* | [**tweetsIdLikingUsers**](docs/TwitterApi.md#tweetsIdLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns user objects that have liked the provided Tweet ID
*TwitterApi* | [**tweetsIdRetweetingUsers**](docs/TwitterApi.md#tweetsIdRetweetingUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns user objects that have retweeted the provided Tweet ID
*TwitterApi* | [**tweetsRecentSearch**](docs/TwitterApi.md#tweetsRecentSearch) | **GET** /2/tweets/search/recent | Recent search
*TwitterApi* | [**userFollowedLists**](docs/TwitterApi.md#userFollowedLists) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists
*TwitterApi* | [**usernameFollowers**](docs/TwitterApi.md#usernameFollowers) | **GET** /2/users/by/username/{username}/followers | Returns user objects that follow the provided username
*TwitterApi* | [**usernameFollowing**](docs/TwitterApi.md#usernameFollowing) | **GET** /2/users/by/username/{username}/following | Following by username
*TwitterApi* | [**usersByUsernameMentions**](docs/TwitterApi.md#usersByUsernameMentions) | **GET** /2/users/by/username/{username}/mentions | User mention timeline by username
*TwitterApi* | [**usersByUsernameTweets**](docs/TwitterApi.md#usersByUsernameTweets) | **GET** /2/users/by/username/{username}/tweets | User Tweets timeline by username
*TwitterApi* | [**usersIdBlock**](docs/TwitterApi.md#usersIdBlock) | **POST** /2/users/{id}/blocking | Block User by User ID
*TwitterApi* | [**usersIdBlocking**](docs/TwitterApi.md#usersIdBlocking) | **GET** /2/users/{id}/blocking | Returns user objects that are blocked by provided user ID
*TwitterApi* | [**usersIdFollow**](docs/TwitterApi.md#usersIdFollow) | **POST** /2/users/{id}/following | Follow User
*TwitterApi* | [**usersIdFollowers**](docs/TwitterApi.md#usersIdFollowers) | **GET** /2/users/{id}/followers | Returns user objects that follow the provided user ID
*TwitterApi* | [**usersIdFollowing**](docs/TwitterApi.md#usersIdFollowing) | **GET** /2/users/{id}/following | Following by User ID
*TwitterApi* | [**usersIdLike**](docs/TwitterApi.md#usersIdLike) | **POST** /2/users/{id}/likes | Causes the user (in the path) to like the specified tweet
*TwitterApi* | [**usersIdLikedTweets**](docs/TwitterApi.md#usersIdLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID
*TwitterApi* | [**usersIdMentions**](docs/TwitterApi.md#usersIdMentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID
*TwitterApi* | [**usersIdMute**](docs/TwitterApi.md#usersIdMute) | **POST** /2/users/{id}/muting | Mute User by User ID
*TwitterApi* | [**usersIdMuting**](docs/TwitterApi.md#usersIdMuting) | **GET** /2/users/{id}/muting | Returns user objects that are muted by the provided user ID
*TwitterApi* | [**usersIdRetweets**](docs/TwitterApi.md#usersIdRetweets) | **POST** /2/users/{id}/retweets | Causes the user (in the path) to retweet the specified tweet
*TwitterApi* | [**usersIdTweets**](docs/TwitterApi.md#usersIdTweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID
*TwitterApi* | [**usersIdUnblock**](docs/TwitterApi.md#usersIdUnblock) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID
*TwitterApi* | [**usersIdUnfollow**](docs/TwitterApi.md#usersIdUnfollow) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User
*TwitterApi* | [**usersIdUnlike**](docs/TwitterApi.md#usersIdUnlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the user (in the path) to unlike the specified tweet
*TwitterApi* | [**usersIdUnmute**](docs/TwitterApi.md#usersIdUnmute) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID
*TwitterApi* | [**usersIdUnretweets**](docs/TwitterApi.md#usersIdUnretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the user (in the path) to unretweet the specified tweet


## Documentation for Models

 - [AddOrDeleteRulesRequest](docs/AddOrDeleteRulesRequest.md)
 - [AddOrDeleteRulesResponse](docs/AddOrDeleteRulesResponse.md)
 - [AddRulesRequest](docs/AddRulesRequest.md)
 - [AddRulesResponse](docs/AddRulesResponse.md)
 - [AnimatedGif](docs/AnimatedGif.md)
 - [AnimatedGifAllOf](docs/AnimatedGifAllOf.md)
 - [CashtagEntity](docs/CashtagEntity.md)
 - [CashtagFields](docs/CashtagFields.md)
 - [ClientDisconnectedProblem](docs/ClientDisconnectedProblem.md)
 - [ClientForbiddenProblem](docs/ClientForbiddenProblem.md)
 - [ClientForbiddenProblemAllOf](docs/ClientForbiddenProblemAllOf.md)
 - [ComplianceJob](docs/ComplianceJob.md)
 - [ComplianceJobStatus](docs/ComplianceJobStatus.md)
 - [ComplianceJobType](docs/ComplianceJobType.md)
 - [ConflictProblem](docs/ConflictProblem.md)
 - [ConnectionExceptionProblem](docs/ConnectionExceptionProblem.md)
 - [ConnectionExceptionProblemAllOf](docs/ConnectionExceptionProblemAllOf.md)
 - [ContextAnnotation](docs/ContextAnnotation.md)
 - [ContextAnnotationDomainFields](docs/ContextAnnotationDomainFields.md)
 - [ContextAnnotationEntityFields](docs/ContextAnnotationEntityFields.md)
 - [CreateBatchComplianceJobRequest](docs/CreateBatchComplianceJobRequest.md)
 - [CreateTweetRequest](docs/CreateTweetRequest.md)
 - [CreateTweetRequestGeo](docs/CreateTweetRequestGeo.md)
 - [CreateTweetRequestMedia](docs/CreateTweetRequestMedia.md)
 - [CreateTweetRequestPoll](docs/CreateTweetRequestPoll.md)
 - [CreateTweetRequestReply](docs/CreateTweetRequestReply.md)
 - [DeleteRulesRequest](docs/DeleteRulesRequest.md)
 - [DeleteRulesRequestDelete](docs/DeleteRulesRequestDelete.md)
 - [DeleteRulesResponse](docs/DeleteRulesResponse.md)
 - [DisallowedResourceProblem](docs/DisallowedResourceProblem.md)
 - [DisallowedResourceProblemAllOf](docs/DisallowedResourceProblemAllOf.md)
 - [DuplicateRuleProblem](docs/DuplicateRuleProblem.md)
 - [EntityIndicesInclusiveExclusive](docs/EntityIndicesInclusiveExclusive.md)
 - [EntityIndicesInclusiveInclusive](docs/EntityIndicesInclusiveInclusive.md)
 - [Error](docs/Error.md)
 - [Expansions](docs/Expansions.md)
 - [FieldUnauthorizedProblem](docs/FieldUnauthorizedProblem.md)
 - [FieldUnauthorizedProblemAllOf](docs/FieldUnauthorizedProblemAllOf.md)
 - [FilteredStreamingTweet](docs/FilteredStreamingTweet.md)
 - [FilteredStreamingTweetOneOf](docs/FilteredStreamingTweetOneOf.md)
 - [FilteredStreamingTweetOneOfMatchingRules](docs/FilteredStreamingTweetOneOfMatchingRules.md)
 - [FullTextEntities](docs/FullTextEntities.md)
 - [GenericMultipleUsersLookupResponse](docs/GenericMultipleUsersLookupResponse.md)
 - [GenericMultipleUsersLookupResponseMeta](docs/GenericMultipleUsersLookupResponseMeta.md)
 - [GenericProblem](docs/GenericProblem.md)
 - [GenericProblemAllOf](docs/GenericProblemAllOf.md)
 - [GenericTweetsTimelineResponse](docs/GenericTweetsTimelineResponse.md)
 - [GenericTweetsTimelineResponseMeta](docs/GenericTweetsTimelineResponseMeta.md)
 - [Geo](docs/Geo.md)
 - [GetRulesResponse](docs/GetRulesResponse.md)
 - [Granularity](docs/Granularity.md)
 - [HashtagEntity](docs/HashtagEntity.md)
 - [HashtagFields](docs/HashtagFields.md)
 - [HideReplyByIdRequest](docs/HideReplyByIdRequest.md)
 - [HideReplyByIdResponse](docs/HideReplyByIdResponse.md)
 - [HideReplyByIdResponseData](docs/HideReplyByIdResponseData.md)
 - [InvalidRequestProblem](docs/InvalidRequestProblem.md)
 - [InvalidRequestProblemAllOf](docs/InvalidRequestProblemAllOf.md)
 - [InvalidRequestProblemAllOfErrors](docs/InvalidRequestProblemAllOfErrors.md)
 - [InvalidRuleProblem](docs/InvalidRuleProblem.md)
 - [ListAddMemberRequest](docs/ListAddMemberRequest.md)
 - [ListCreateRequest](docs/ListCreateRequest.md)
 - [ListCreateResponse](docs/ListCreateResponse.md)
 - [ListDeleteResponse](docs/ListDeleteResponse.md)
 - [ListDeleteResponseData](docs/ListDeleteResponseData.md)
 - [ListFollowRequest](docs/ListFollowRequest.md)
 - [ListFollowedResponse](docs/ListFollowedResponse.md)
 - [ListFollowedResponseData](docs/ListFollowedResponseData.md)
 - [ListLookupMultipleUsersLookupResponse](docs/ListLookupMultipleUsersLookupResponse.md)
 - [ListLookupMultipleUsersLookupResponseMeta](docs/ListLookupMultipleUsersLookupResponseMeta.md)
 - [ListMemberResponse](docs/ListMemberResponse.md)
 - [ListMemberResponseData](docs/ListMemberResponseData.md)
 - [ListPinRequest](docs/ListPinRequest.md)
 - [ListPinnedResponse](docs/ListPinnedResponse.md)
 - [ListPinnedResponseData](docs/ListPinnedResponseData.md)
 - [ListUpdateRequest](docs/ListUpdateRequest.md)
 - [ListUpdateResponse](docs/ListUpdateResponse.md)
 - [ListUpdateResponseData](docs/ListUpdateResponseData.md)
 - [ListsIdTweetsResponse](docs/ListsIdTweetsResponse.md)
 - [Media](docs/Media.md)
 - [MentionEntity](docs/MentionEntity.md)
 - [MentionFields](docs/MentionFields.md)
 - [MultiComplianceJobResponse](docs/MultiComplianceJobResponse.md)
 - [MultiListNoPaginationResponse](docs/MultiListNoPaginationResponse.md)
 - [MultiListNoPaginationResponseMeta](docs/MultiListNoPaginationResponseMeta.md)
 - [MultiListResponse](docs/MultiListResponse.md)
 - [MultiListResponseMeta](docs/MultiListResponseMeta.md)
 - [MultiSpaceLookupResponse](docs/MultiSpaceLookupResponse.md)
 - [MultiTweetLookupResponse](docs/MultiTweetLookupResponse.md)
 - [MultiUserLookupResponse](docs/MultiUserLookupResponse.md)
 - [NonCompliantRulesProblem](docs/NonCompliantRulesProblem.md)
 - [OperationalDisconnectProblem](docs/OperationalDisconnectProblem.md)
 - [OperationalDisconnectProblemAllOf](docs/OperationalDisconnectProblemAllOf.md)
 - [Photo](docs/Photo.md)
 - [PhotoAllOf](docs/PhotoAllOf.md)
 - [Place](docs/Place.md)
 - [PlaceType](docs/PlaceType.md)
 - [Point](docs/Point.md)
 - [Poll](docs/Poll.md)
 - [PollOption](docs/PollOption.md)
 - [Problem](docs/Problem.md)
 - [ProblemOrError](docs/ProblemOrError.md)
 - [ReplySettings](docs/ReplySettings.md)
 - [ResourceNotFoundProblem](docs/ResourceNotFoundProblem.md)
 - [ResourceNotFoundProblemAllOf](docs/ResourceNotFoundProblemAllOf.md)
 - [ResourceUnauthorizedProblem](docs/ResourceUnauthorizedProblem.md)
 - [ResourceUnauthorizedProblemAllOf](docs/ResourceUnauthorizedProblemAllOf.md)
 - [ResourceUnavailableProblem](docs/ResourceUnavailableProblem.md)
 - [ResourceUnavailableProblemAllOf](docs/ResourceUnavailableProblemAllOf.md)
 - [Rule](docs/Rule.md)
 - [RuleNoId](docs/RuleNoId.md)
 - [RulesCapProblem](docs/RulesCapProblem.md)
 - [RulesRequestSummary](docs/RulesRequestSummary.md)
 - [RulesRequestSummaryOneOf](docs/RulesRequestSummaryOneOf.md)
 - [RulesRequestSummaryOneOf1](docs/RulesRequestSummaryOneOf1.md)
 - [RulesResponseMetadata](docs/RulesResponseMetadata.md)
 - [SearchCount](docs/SearchCount.md)
 - [SingleComplianceJobResponse](docs/SingleComplianceJobResponse.md)
 - [SingleListLookupResponse](docs/SingleListLookupResponse.md)
 - [SingleSpaceLookupResponse](docs/SingleSpaceLookupResponse.md)
 - [SingleTweetLookupResponse](docs/SingleTweetLookupResponse.md)
 - [SingleUserLookupResponse](docs/SingleUserLookupResponse.md)
 - [Space](docs/Space.md)
 - [SpaceTopics](docs/SpaceTopics.md)
 - [StreamingTweet](docs/StreamingTweet.md)
 - [StreamingTweetOneOf](docs/StreamingTweetOneOf.md)
 - [Tweet](docs/Tweet.md)
 - [TweetAttachments](docs/TweetAttachments.md)
 - [TweetCountsResponse](docs/TweetCountsResponse.md)
 - [TweetCountsResponseMeta](docs/TweetCountsResponseMeta.md)
 - [TweetCreateResponse](docs/TweetCreateResponse.md)
 - [TweetCreateResponseData](docs/TweetCreateResponseData.md)
 - [TweetDeleteResponse](docs/TweetDeleteResponse.md)
 - [TweetDeleteResponseData](docs/TweetDeleteResponseData.md)
 - [TweetGeo](docs/TweetGeo.md)
 - [TweetNonPublicMetrics](docs/TweetNonPublicMetrics.md)
 - [TweetOrganicMetrics](docs/TweetOrganicMetrics.md)
 - [TweetPromotedMetrics](docs/TweetPromotedMetrics.md)
 - [TweetPublicMetrics](docs/TweetPublicMetrics.md)
 - [TweetReferencedTweets](docs/TweetReferencedTweets.md)
 - [TweetSearchResponse](docs/TweetSearchResponse.md)
 - [TweetSearchResponseMeta](docs/TweetSearchResponseMeta.md)
 - [TweetWithheld](docs/TweetWithheld.md)
 - [URLFields](docs/URLFields.md)
 - [URLImage](docs/URLImage.md)
 - [UnsupportedAuthenticationProblem](docs/UnsupportedAuthenticationProblem.md)
 - [UrlEntity](docs/UrlEntity.md)
 - [UsageCapExceededProblem](docs/UsageCapExceededProblem.md)
 - [UsageCapExceededProblemAllOf](docs/UsageCapExceededProblemAllOf.md)
 - [User](docs/User.md)
 - [UserEntities](docs/UserEntities.md)
 - [UserEntitiesUrl](docs/UserEntitiesUrl.md)
 - [UserPublicMetrics](docs/UserPublicMetrics.md)
 - [UserWithheld](docs/UserWithheld.md)
 - [UsersBlockingMutationResponse](docs/UsersBlockingMutationResponse.md)
 - [UsersBlockingMutationResponseData](docs/UsersBlockingMutationResponseData.md)
 - [UsersFollowingCreateResponse](docs/UsersFollowingCreateResponse.md)
 - [UsersFollowingCreateResponseData](docs/UsersFollowingCreateResponseData.md)
 - [UsersFollowingDeleteResponse](docs/UsersFollowingDeleteResponse.md)
 - [UsersFollowingLookupResponse](docs/UsersFollowingLookupResponse.md)
 - [UsersIdBlockRequest](docs/UsersIdBlockRequest.md)
 - [UsersIdFollowRequest](docs/UsersIdFollowRequest.md)
 - [UsersIdLikedTweetsResponse](docs/UsersIdLikedTweetsResponse.md)
 - [UsersIdLikedTweetsResponseMeta](docs/UsersIdLikedTweetsResponseMeta.md)
 - [UsersIdMuteRequest](docs/UsersIdMuteRequest.md)
 - [UsersLikesCreateRequest](docs/UsersLikesCreateRequest.md)
 - [UsersLikesCreateResponse](docs/UsersLikesCreateResponse.md)
 - [UsersLikesCreateResponseData](docs/UsersLikesCreateResponseData.md)
 - [UsersLikesDeleteResponse](docs/UsersLikesDeleteResponse.md)
 - [UsersMutingMutationResponse](docs/UsersMutingMutationResponse.md)
 - [UsersMutingMutationResponseData](docs/UsersMutingMutationResponseData.md)
 - [UsersRetweetsCreateRequest](docs/UsersRetweetsCreateRequest.md)
 - [UsersRetweetsCreateResponse](docs/UsersRetweetsCreateResponse.md)
 - [UsersRetweetsCreateResponseData](docs/UsersRetweetsCreateResponseData.md)
 - [UsersRetweetsDeleteResponse](docs/UsersRetweetsDeleteResponse.md)
 - [Video](docs/Video.md)
 - [VideoAllOf](docs/VideoAllOf.md)
 - [VideoAllOfNonPublicMetrics](docs/VideoAllOfNonPublicMetrics.md)
 - [VideoAllOfOrganicMetrics](docs/VideoAllOfOrganicMetrics.md)
 - [VideoAllOfPromotedMetrics](docs/VideoAllOfPromotedMetrics.md)
 - [VideoAllOfPublicMetrics](docs/VideoAllOfPublicMetrics.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BearerToken


- **Type**: HTTP basic authentication

### UserToken


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



