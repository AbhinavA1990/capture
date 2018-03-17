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
import com.slk.capture.service.AdvertisementService;
import com.slk.capture.service.AdvertisementServiceImpl;
import com.slk.capture.service.BlogTService;
import com.slk.capture.service.BlogTServiceImpl;
import com.slk.capture.service.CarPoolService;
import com.slk.capture.service.CarPoolServiceImpl;
import com.slk.capture.service.ContactService;
import com.slk.capture.service.ContactServiceImpl;
import com.slk.capture.service.CustomerBUService;
import com.slk.capture.service.CustomerBUServiceImpl;
import com.slk.capture.service.MultiMediaService;
import com.slk.capture.service.MultiMediaServiceImpl;
import com.slk.capture.service.ProfileService;
import com.slk.capture.service.ProfileServiceImpl;
import com.slk.capture.service.RoleService;
import com.slk.capture.service.RoleServiceImpl;
import com.slk.capture.service.SkillService;
import com.slk.capture.service.SkillServiceImpl;
import com.slk.capture.service.UserService;
import com.slk.capture.service.UserServiceImpl;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private SkillService skillService;
	
	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomerBUService customerBUService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private AdvertisementService advertisementService;
	
	@Autowired
	private CommentsRepository commentsRepo;
	
	@Autowired
	private CarPoolService carPoolService;
	
	@Autowired
	private BlogTService blogTService;
	
	@Autowired
	private MultiMediaService multiMediaService;


	public Skill getSkill(Long graphId) {
		return skillService.getSkill(graphId);
	}

	public List<Skill> getAllSkill() {
		return skillService.getAllSkill();
	}

   public Profile getProfile(Long graphID) {
	   return profileService.getProfile(graphID);
   }
   public List<Profile> getAllProfile(){
	   return profileService.getAllProfile();
	   
   }
   public Contact getContact(Long graphID) {
	   return contactService.getContact(graphID);
   }
   public List<Contact> getAllContact(){
	  return contactService.getAllContact();
   }
   public User getUser(Long graphID) {
	   return userService.getUser(graphID);
   }

   public List<User> getAllUser(){
	return userService.getAllUser();   
   }

   public CustomerBU getCustomerBU(Long graphId) {
	   return customerBUService.getCustomerBU(graphId);
   }
   public List<CustomerBU> getAllCustomerBU(){
	   return customerBUService.getAllCustomerBU();
	   
   }
   public Role getRole(Long graphId) {
	   return roleService.getRole(graphId);
   }
   public List<Role> getAllRole(){
	  return roleService.getAllRole();
	   
   }
   public Advertisement getAdvertisement(Long graphId) {
	   return advertisementService.getAdvertisement(graphId);
   }
   public List<Advertisement> getAllAdvertisement(){
	  return advertisementService.getAllAdvertisement();
   }
   public CarPool getCarPool(Long graphId) {
	   return carPoolService.getCarPool(graphId);
   }
   public List<CarPool> getAllCarPool(){
	  return carPoolService.getAllCarPool();
   }
   public BlogT getBlogT(Long graphId) {
	  return blogTService.getBlogT(graphId);
   }
   
   public List<BlogT> getAllBlogT(){
	  return blogTService.getAllBlogT();
   }
   public MultiMedia getMultiMedia(Long graphId) {
	  return multiMediaService.getMultiMedia(graphId);
   }
   public List<MultiMedia> getAllMultiMedia(){
	  return multiMediaService.getAllMultiMedia();
   }
//   public Comments getComments(Long graphId) {
//	   return commentsRepository.findOne(graphId);
//   }
//   public List<Comments> getAllComments(){
//	   return (List<Comments>) commentsRepository.findAll();
//   }
}
