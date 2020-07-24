/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entity;

//import java.math.BigDecimal;
import org.json.JSONObject;

/**
 *
 * @author denis
 */
public class Users {
    private String userID;
    private String name;
    private String title;
    private String birthDate;
    private String hireDate;
    private String position;
    private String email;
    private String password;

    public Users() {
    }

    public Users(JSONObject obj) {
        this.userID = obj.optString("userID");
        this.name = obj.optString("name");
        this.title = obj.optString("title");
        this.birthDate = obj.optString("birthDate");
        this.hireDate = obj.optString("hireDate");
        this.position = obj.optString("position");
        this.email = obj.optString("email");
        this.password = obj.optString("unitsOnOrder");
    }
    
        public Users(String userID, String name, String title, String birthDate, String hireDate, String position, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.title = title;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.position = position;
        this.email = email;
        this.password = password;
    }
    
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("userID", userID);
        json.put("name", name);
        json.put("title", title);
        json.put("birthDate", birthDate);
        json.put("hireDate", hireDate);
        json.put("position", position);
        json.put("email", email);
        json.put("password", password);
    return json;

     }

      public Object getValue(int index){   
          switch(index){
              case 0: return userID;
              case 1: return name;
              case 2: return title;
              case 3: return birthDate;
              case 4: return hireDate;
              case 5: return position;
              case 6: return email;
              case 7: return password;
              default: return null;
              
          }
      }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PageResult<Users> getPage(String search, int page, int pageSize, String sort, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
          
       
}
