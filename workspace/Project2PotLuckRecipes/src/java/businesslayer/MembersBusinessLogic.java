/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslayer;

import dataaccesslayer.MembersDao;
import dataaccesslayer.MembersDaoImpl;
import java.util.List;
import transferobjects.Member;

/**
 *
 * @author Jessie
 */
public class MembersBusinessLogic {
MembersDao membersDao;
public MembersBusinessLogic(){
    membersDao=new MembersDaoImpl();
}
    public List<Member> getAllMembers() {
        
     return   membersDao.getAllMembers();
        
    }
    
}
