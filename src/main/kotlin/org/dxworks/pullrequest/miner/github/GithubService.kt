package org.dxworks.pullrequest.miner.github

import com.google.api.client.http.HttpRequestInitializer
import org.dxworks.utils.java.rest.client.RestClient

class GithubService(apiBaseUrl: String, httpRequestInitializer: HttpRequestInitializer) :
    RestClient(apiBaseUrl, httpRequestInitializer) {

    constructor(apiBaseUrl: String) : this(apiBaseUrl, HttpRequestInitializer {})

}
