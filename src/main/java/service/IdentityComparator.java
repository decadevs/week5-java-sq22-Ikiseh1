package service;

import enumm.Books;
import model.Identity;

import java.util.Comparator;

public class IdentityComparator implements Comparator<Identity> {


    @Override
    public int compare(Identity d1, Identity d2) {

        if(d1.isTeacher() && !d2.isTeacher()){
            return -1; //D1 IS A TEACHER, PRIORITISE OVER D2
        }else if (!d1.isTeacher() && d2.isTeacher()){
            return 1; // D2 IS A TEACHER, PRIORITISE OVER D1
        }else if(d1.isSeniorStudent() && !d2.isSeniorStudent()){
            return -1; // D1 IS  SNRSTUD, PRIORITSE OVER D2
        }else if(!d1.isSeniorStudent() && d2.isSeniorStudent()){
            return 1;
        }else if(d1.isJuniorStudent() && !d2.isJuniorStudent()){
            return -1;
        }else if(!d1.isJuniorStudent() && d2.isJuniorStudent()){
            return 1;
        }else{
            return 0;
        }
    }
}
