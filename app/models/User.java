package models;

import java.util.*;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
//@Table(name="blog_user")
public class User extends Model  {

	public String email;
	public String password;
	public String fullname;
	public boolean isAdmin;
	
	public User(String email,String password,String fullname){
		
		this.email=email;
		this.password=email;
		this.fullname=fullname;
		
	} 
public  static User connect(String email,String password){
		
		return find("byEmailAndPassword", email, password).first();
		
		
	} 
	
}