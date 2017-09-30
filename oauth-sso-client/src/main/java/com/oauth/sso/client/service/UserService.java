package com.oauth.sso.client.service;

import com.oauth.sso.client.domain.User;

/**
 * Created by david100gom on 2017. 9. 30.
 *
 * Github : https://github.com/david100gom
 */
public interface UserService {

    User getUser(String userName);

    boolean updateTokenId(String userName, String token);

}
