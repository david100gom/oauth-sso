package com.oauth.sso.server.service;

import com.oauth.sso.server.domain.AccessToken;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by david100gom on 2017. 9. 27.
 *
 * Github : https://github.com/david100gom
 */
public interface AccessTokenRepository extends CrudRepository<AccessToken, String> {
    //
    AccessToken findByTokenIdAndClientId(String tokenId, String clientId);

    int deleteByUserName(String userName);

    List<AccessToken> findByUserName(String userName);
}