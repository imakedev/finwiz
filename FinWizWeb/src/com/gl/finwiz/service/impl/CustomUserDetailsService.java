package com.gl.finwiz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.finwiz.core.constant.ServiceConstant;
import com.gl.finwiz.model.User;
import com.gl.finwiz.service.FinwizService;


/**
 * A custom {@link UserDetailsService} where user information
 * is retrieved from a JPA repository
 */
@Service
@Transactional(readOnly = true)
public class CustomUserDetailsService implements UserDetailsService {
	private static final Logger logger = Logger.getLogger(ServiceConstant.LOG_APPENDER);
	/* @Autowired
	private UserRepository userRepository;
	*/
	@Autowired
	@Qualifier("finWizServiceImpl")
	private FinwizService finwizService;
	/*@PersistenceContext
	private EntityManager em;*/
	//@PersistenceUnit(unitName = "hibernatePersistenceUnit")
    //private EntityManagerFactory entityManagerFactory;

	/**
	 * Returns a populated {@link UserDetails} object. 
	 * The username is first retrieved from the database and then mapped to 
	 * a {@link UserDetails} object.
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.debug(" xxxxxxxxxxxxxxxxxxxxxxxxxxxx into loadUserByUsername "+username);
		try {
	      User domainUserContact = null;// userRepository.findByUsername(username);
			logger.debug(" xxxxxxxxxxxxxxxxxxxxxxxxxxxx affter loadUserByUsername "+domainUserContact);
			
			boolean enabled = true;
			boolean accountNonExpired = true;
			boolean credentialsNonExpired = true;
			boolean accountNonLocked = true;
		 
			  boolean isAdmin=false;
			  Long rcId=null;
		if(domainUserContact!=null){
			/*
			//logger.debug("  getMcontactName "+domainUser.getMissContact().getMcontactName());
			EntityManager em = entityManagerFactory.createEntityManager();
            try{
            	//org.hibernate.ejb.TransactionImpl tx=(org.hibernate.ejb.TransactionImpl)em.getTransaction();
            	EntityTransaction tx =  em.getTransaction();
            	tx.begin();
			  CriteriaBuilder cb = em.getCriteriaBuilder();
		        CriteriaQuery<com.gl.finwiz.domain.User> query = cb.createQuery(com.gl.finwiz.domain.User.class);
		       Root<com.gl.finwiz.domain.User> contact = query.from(com.gl.finwiz.domain.User.class);

		        query.where(cb.equal(contact.get("mcontactUsername").as(String.class),
		        		username));
		    
		       tx.commit();
            }catch (Exception e) {
				// TODO: handle exception
            	e.printStackTrace();
			}finally{
				em.close();
			} 
          
         
			MyUserDetails user=new MyUserDetails(domainUserContact.getUsername(),  
					domainUserContact.getPassword().toLowerCase(),
					enabled,
					accountNonExpired,
					credentialsNonExpired,
					accountNonLocked,
					//getAuthorities(domainUser.getRole().getRole()));
					//getAuthorities(domainUserContact.getRole()));
					getAuthorities(getRolesMapping(rcId,isAdmin)));
			MyUser myUser=new MyUser(domainUserContact.getFirstName()+" "+domainUserContact.getLastName());
			th.co.aoe.makedev.missconsult.xstream.MissContact missContact= null;//finwizService.findMissContactByUsername(domainUserContact.getUsername());
			myUser.setMissContact(missContact);
			user.setMyUser(myUser);
		return user;
		*/
			return null;
		}else
			return null;
					
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
/*	public  Set<th.co.aoe.makedev.missconsult.xstream.RoleType> getRolesMapping(Long rcId,boolean isAdmin){
		  Set<th.co.aoe.makedev.missconsult.xstream.RoleType> role =new HashSet<th.co.aoe.makedev.missconsult.xstream.RoleType>();
		th.co.aoe.makedev.missconsult.xstream.RoleType defualt= new th.co.aoe.makedev.missconsult.xstream.RoleType();
		   defualt.setRole("ROLE_USER");
		   role.add(defualt); 
		   if(isAdmin){
				th.co.aoe.makedev.missconsult.xstream.RoleType admin= new th.co.aoe.makedev.missconsult.xstream.RoleType();
				admin.setRole("ROLE_ADMIN");
				role.add(admin);
		   }
         
                   
//     	  logger.debug("yyyyyyyyyyyyyyyyyyyyyyy "+roleContact.getRcId());
     //      if(roleContact!=null && roleContact.getRcId()!=null ){
		     if(rcId!=null){
        	  @SuppressWarnings("unchecked")
			List<th.co.aoe.makedev.missconsult.xstream.RoleType> roles= null;//finwizService.listRoleTypeByRcId(rcId);
        	  logger.debug("zzzzzzzzzzzzzzzzzzzzzzzzzzz "+roles);
        	  if(roles!=null && roles.size()>0){
        		  for (th.co.aoe.makedev.missconsult.xstream.RoleType roleType : roles) {
        			  role.add(roleType);
				}
        	  }
        	  logger.debug("xxxxxxxxxxxxxxxxxxxxxxx "+role.size());
        	 
           }
		return role;
	}*/
	/**
	 * Retrieves a collection of {@link GrantedAuthority} based on a numerical role
	 * @param role the numerical role
	 * @return a collection of {@link GrantedAuthority
	 */
	/*public Collection<? extends GrantedAuthority> getAuthorities(Set<Role> role) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
		return authList;
	}*/
/*	public Collection<? extends GrantedAuthority> getAuthorities(Set<th.co.aoe.makedev.missconsult.xstream.RoleType> role) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
		return authList;
	}*/
	
	/**
	 * Converts a numerical role to an equivalent list of roles
	 * @param role the numerical role
	 * @return list of roles as as a list of {@link String}
	 */
/*	public List<String> getRoles(Set<Role> role) {
		List<String> roles = new ArrayList<String>();
		if(role!=null && role.size()>0)
		for (Role key : role) {
			roles.add(key.getRole());
		}
		return roles;
	}*/
	/*public List<String> getRoles(Set<th.co.aoe.makedev.missconsult.xstream.RoleType> role) {
		List<String> roles = new ArrayList<String>();
		if(role!=null && role.size()>0)
		for (th.co.aoe.makedev.missconsult.xstream.RoleType key : role) {
			roles.add(key.getRole());
		}
		return roles;
	}
	*/
	/**
	 * Wraps {@link String} roles to {@link SimpleGrantedAuthority} objects
	 * @param roles {@link String} of roles
	 * @return list of granted authorities
	 */
	/*public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}*/
	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}
}
