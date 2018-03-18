package com.slk.capture.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.slk.capture.model.Advertisement;
import com.slk.capture.model.BlogT;
import com.slk.capture.model.CarPool;
import com.slk.capture.model.Contact;
import com.slk.capture.model.CustomerBU;
import com.slk.capture.model.Profile;
import com.slk.capture.model.Role;
import com.slk.capture.model.Skill;
import com.slk.capture.model.User;
import com.slk.capture.repo.CommentsRepository;
import com.slk.capture.service.AdvertisementService;
import com.slk.capture.service.BlogTService;
import com.slk.capture.service.CarPoolService;
import com.slk.capture.service.ContactService;
import com.slk.capture.service.CustomerBUService;
import com.slk.capture.service.ProfileService;
import com.slk.capture.service.RoleService;
import com.slk.capture.service.SkillService;
import com.slk.capture.service.UserService;

@Component
public class Mutation implements GraphQLMutationResolver {
	
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
	
	public Skill writeSkill(String skillName, String skillDescription, String skillType) {
		return skillService.addSkill(skillName, skillDescription, skillType);
	}

    public Profile writeProfile(String profileName,String workstation, String profileDesignation) {
	    	return profileService.addProfile(profileName, workstation, profileDesignation);
    }

    public Contact writeContact(Long mobileNo,String emailId,Integer extension) {
    	  return contactService.addContact(mobileNo, emailId, extension);
    }
    
    public User writeUser(String userName,String email,String password) {
    	return userService.addUser(userName, email, password);
    }
    
    public CustomerBU writeCustomerBU(String cbuName,String cbuType) {
    return customerBUService.addCustomerBU(cbuName, cbuType);
    }
    
   public Role writeRole(String roleName) {
	   return roleService.addRole(roleName);
   }
   
   public Advertisement writeAdvertisement(String productName,String productDescription, Double productPrice) {
	   return advertisementService.addAdvertisement(productName, productDescription, productPrice);   
	   
   }
//   public Comments writeComments(String comment,Profile profile,Long parentcommentid) {
//	   Comments comments = new Comments();
//	   comments.setProfile(profile);
//	   comments.setComment(comment);
//	   commentsRepo.save(comments);
//	   Comments c = commentsRepo.findOne(parentcommentid);
//	   c.addcomment(comments);
//	   commentsRepo.save(c);
//	   return comments;
//   }
   public CarPool writeCarPool(String destinationTo,String startFrom,String vehicleNumber,Integer seatsAvailable) {
	  return carPoolService.addCarPool(destinationTo, startFrom, vehicleNumber, seatsAvailable);
   }
  public BlogT writeBlogT(String blogTitle,String blogText) {
	  return blogTService.addBlog(blogTitle, blogText);
	
  }  

}
