package com.slk.capture.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.slk.capture.model.Advertisement;
import com.slk.capture.model.BlogT;
import com.slk.capture.model.CarPool;
import com.slk.capture.model.Comments;
import com.slk.capture.model.Contact;
import com.slk.capture.model.CustomerBU;
import com.slk.capture.model.MultiMedia;
import com.slk.capture.model.Profile;
import com.slk.capture.model.Role;
import com.slk.capture.model.Skill;
import com.slk.capture.model.User;
import com.slk.capture.repo.AdvertisementRepository;
import com.slk.capture.repo.BlogRepsository;
import com.slk.capture.repo.CarPoolRepository;
import com.slk.capture.repo.CommentsRepository;
import com.slk.capture.repo.ContactRepository;
import com.slk.capture.repo.CustomerBURepository;
import com.slk.capture.repo.MultiMediaRepository;
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
	
	@Autowired
	private AdvertisementRepository AdvertisementRepository;
	
	@Autowired
	private CarPoolRepository carpoolRepository;
	
	@Autowired
	private BlogRepsository blogRepository;

	@Autowired
	private MultiMediaRepository multimediaRepository;
	
	@Autowired
	private CommentsRepository commentsRepository;

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
   public Advertisement getAdvertisement(Long graphId) {
	   return AdvertisementRepository.findOne(graphId);
   }
   public List<Advertisement> getAllAdvertisement(){
	   return (List<Advertisement>) AdvertisementRepository.findAll();
   }
   public CarPool getCarPool(Long graphId) {
	   return carpoolRepository.findOne(graphId);
   }
   public List<CarPool> getAllCarPool(){
	   return (List<CarPool>) carpoolRepository.findAll();
   }
   public BlogT getBlogT(Long graphId) {
	   return blogRepository.findOne(graphId);   
   }
   
   public List<BlogT> getAllBlogT(){
	   return (List<BlogT>) blogRepository.findAll(); 
   }
   public MultiMedia getMultiMedia(Long graphId) {
	   return multimediaRepository.findOne(graphId);
   }
   public List<MultiMedia> getAllMultiMedia(){
	   return (List<MultiMedia>) multimediaRepository.findAll();
   }
//   public Comments getComments(Long graphId) {
//	   return commentsRepository.findOne(graphId);
//   }
//   public List<Comments> getAllComments(){
//	   return (List<Comments>) commentsRepository.findAll();
//   }
}
