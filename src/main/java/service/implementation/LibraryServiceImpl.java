package service.implementation;

import enumm.Books;
import model.Identity;
import model.Library;
import service.IdentityComparator;
import service.LibraryService;

import java.util.PriorityQueue;

public class LibraryServiceImpl implements LibraryService {

    PriorityQueue<Identity> personsOnQueue;

    public LibraryServiceImpl(){
        this.personsOnQueue = new PriorityQueue<>(new IdentityComparator());
    }

    @Override
    public void addPerson(Identity Person) {
        personsOnQueue.add(Person);
    }

    @Override
    public String collectBook(Library bok) {
//       if(personsOnQueue.isEmpty()){
//           return "No one is on the Queue.";
//       }
        if(bok.getNoOfCopies()==0 ) {
            return "Book Taken.";
        }

       Identity identity = personsOnQueue.poll();
        assert identity != null;
        return identity.getFullName() + " has taken " + bok.getBooks();
    }

}
