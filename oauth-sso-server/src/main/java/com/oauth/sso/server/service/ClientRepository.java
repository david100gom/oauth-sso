package com.oauth.sso.server.service;

import com.oauth.sso.server.domain.Client;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by david100gom on 2017. 9. 27.
 *
 * Github : https://github.com/david100gom
 */
public interface ClientRepository extends CrudRepository<Client, String> {
}
