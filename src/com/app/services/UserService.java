/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.services;

import com.app.entity.Users;
import com.app.entity.PageResult;
import com.app.entity.Result;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import org.json.JSONObject;

/**
 *
 * @author ahza0
 */
public class UserService extends BaseService {

    public UserService() {
        baseUrl = "users";
    }
    
    public PageResult<Users> getPage(String search, int page, int pageSize, String sort, boolean asc)
            throws MalformedURLException, ProtocolException, IOException {
        PageResult<Users> pageResult = null;
        Result result = get(search, page, pageSize, sort, asc);
        pageResult = new PageResult<>(result.getData(), Users.class);
        return pageResult;
    }

    public Users getByID(String id) throws IOException, Exception {
        Users users = null;
        Result result = get(id);
        JSONObject userr = result.getData();
        users = new Users(userr);
        return users;
    }
    
    public Result create(Users users) throws IOException{
        return post(users.toJson());
    }
    
    public Result update(Users users) throws IOException{
        return put(users.toJson());
    }
        
    public Result remove(String id) throws IOException{
        return delete(id);
    }
}
