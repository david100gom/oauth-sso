package com.oauth.sso.client.service;

import com.oauth.sso.client.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by david100gom on 2017. 9. 30.
 *
 * Github : https://github.com/david100gom
 */
@Service
public class UserServiceImpl implements UserService {
    //
    @Autowired
    private UserRepository repository;

    @Override
    public User getUser(String userName) {
        //
        return repository.findOne(userName);
    }

    @Override
    public boolean updateTokenId(String userName, String tokenId) {
        //
        User user = repository.findOne(userName);
        user.setTokenId(tokenId);

        repository.save(user);
        return true;
    }
}
