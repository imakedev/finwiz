package com.gl.finwiz.model;

//Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 5/27/2012 12:11:59 AM
//Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
//Decompiler options: packimports(3) 
//Source File Name:   User.java


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


//Referenced classes of package th.co.aoe.makedev.missconsult.exam.domain:
//         Role

@Entity(name="user")
public class User
{

 public User()
 {
 }

 public Long getId()
 {
     return id;
 }

 public void setId(Long id)
 {
     this.id = id;
 }

 public String getFirstName()
 {
     return firstName;
 }

 public void setFirstName(String firstName)
 {
     this.firstName = firstName;
 }

 public String getLastName()
 {
     return lastName;
 }

 public void setLastName(String lastName)
 {
     this.lastName = lastName;
 }

 public String getUsername()
 {
     return username;
 }

 public void setUsername(String username)
 {
     this.username = username;
 }

 public String getPassword()
 {
     return password;
 }

 public void setPassword(String password)
 {
     this.password = password;
 }

/* public Role getRole()
 {
     return role;
 }

 public void setRole(Role role)
 {
     this.role = role;
 }*/

 @Id
 private Long id;
 /*public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}
*/
	

private String firstName;
 private String lastName;
 @Column(unique=true)
 private String username;
 private String password;
/*  @OneToOne(mappedBy="user", cascade={javax.persistence.CascadeType.ALL})
 private Role role;*/
 /*
  @OneToMany(mappedBy="user")
 
	private Set<Role> role;
	 */
 
/*	@OneToOne(mappedBy="mcontactUsername", cascade={CascadeType.ALL})
 private MissContact missContact;*/
}
