package com.oauth.sso.server.service;

import com.oauth.sso.server.domain.AccessToken;

/**
 * Created by david100gom on 2017. 9. 27.
 *
 * Github : https://github.com/david100gom
 */
public interface SsoService {
    //
    AccessToken getAccessToken(String token, String clientId);

    String logoutAllClients(String clientId, String userName);
}