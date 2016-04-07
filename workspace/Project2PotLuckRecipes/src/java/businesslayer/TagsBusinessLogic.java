/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslayer;


import java.util.List;
import dataaccesslayer.TagsDaoImpl;
import transferobjects.Tag;
import dataaccesslayer.TagsDao;

public class TagsBusinessLogic {
	
	private TagsDao tagsDao = null;
	
	public TagsBusinessLogic(){
		tagsDao = new TagsDaoImpl();
	}
	
	public List<Tag> getAllTags(){
		return tagsDao.getAllTags();
	}
	
	
}
