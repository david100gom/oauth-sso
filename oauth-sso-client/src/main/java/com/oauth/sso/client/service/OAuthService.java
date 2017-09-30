package com.oauth.sso.client.service;

import com.oauth.sso.client.domain.Response;
import com.oauth.sso.client.domain.TokenRequestResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by david100gom on 2017. 9. 30.
 *
 * Github : https://github.com/david100gom
 */
public interface OAuthService {
    //
    TokenRequestResult requestAccessTokenToAuthServer(String code, HttpServletRequest request);

    Response logout(String tokenId, String userName);

}
