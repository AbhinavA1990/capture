package com.slk.capture.service;

import com.slk.capture.model.Comments;
import com.slk.capture.model.Profile;

public interface CommentsService {
	
	public Comments addcomments(String comment,Profile profile,Long parentcommentid);

}
