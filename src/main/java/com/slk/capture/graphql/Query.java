package com.slk.capture.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.slk.capture.model.Contact;
import com.slk.capture.model.CustomerBU;
import com.slk.capture.model.Profile;
import com.slk.capture.model.Role;
import com.slk.capture.model.Skill;
import com.slk.capture.model.User;
import com.slk.capture.repo.ContactRepository;
import com.slk.capture.repo.CustomerBURepository;
import com.slk.capture.repo.ProfileRepository;
import com.slk.capture.repo.RoleRepository;
import com.slk.capture.repo.SkillRepository;
import com.slk.capture.repo.UserRepository;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private SkillRepository skillRepository;
	
	@Autowired
	private ProfileRepository profileRepository;
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CustomerBURepository CustomerBURepository;
	
	@Autowired
	private RoleRepository RoleRepository;


	public Skill getSkill(Long graphId) {
		return skillRepository.findOne(graphId);
	}

	public List<Skill> getAllSkill() {
		return (List<Skill>) skillRepository.findAll();
	}

   public Profile getProfile(Long graphID) {
	   return profileRepository.findOne(graphID);
   }
   public List<Profile> getAllProfile(){
	   return (List<Profile>) profileRepository.findAll();
	   
   }
   public Contact getContact(Long graphID) {
	   return contactRepository.findOne(graphID);
   }
   public List<Contact> getAllContact(){
	   return (List<Contact>) contactRepository.findAll();
	   
   }
   public User getUser(Long graphID) {
	   return userRepository.findOne(graphID);
	   
   }
   
   public List<User> getAllUser(){
	   return (List<User>) userRepository.findAll();
   }

   public CustomerBU getCustomerBU(Long graphId) {
	   return CustomerBURepository.findOne(graphId);
   }
   public List<CustomerBU> getAllCustomerBU(){
	   return (List<CustomerBU>) CustomerBURepository.findAll();
	   
   }
   public Role getRole(Long graphId) {
	   return RoleRepository.findOne(graphId);
   }
   public List<Role> getAllRole(){
	   return (List<Role>) RoleRepository.findAll();
	   
   }
   
}
