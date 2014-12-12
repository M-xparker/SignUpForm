package io.bitfountain.matthewparker.signupform;

import java.io.Serializable;

/**
 * Created by matthewparker on 12/10/14.
 */
public class User implements Serializable{
    private String mUsername;
    private String mPassword;

    User(String username, String password){
        this.mUsername = username;
        this.mPassword = password;
    }

    public String getUsername(){
        return mUsername;
    }
}
