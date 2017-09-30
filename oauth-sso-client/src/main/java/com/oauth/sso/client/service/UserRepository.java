package com.oauth.sso.client.service;

import com.oauth.sso.client.domain.User;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by david100gom on 2017. 9. 28.
 *
 * Github : https://github.com/david100gom
 */
public interface UserRepository extends CrudRepository<User, String> {

}