package com.oauth.sso.server.domain;

/**
 * Created by david100gom on 2017. 9. 27.
 *
 * Github : https://github.com/david100gom
 */
public class UserInfoResponse {

    private boolean result = true;

    private String message;
    private String userName;

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}