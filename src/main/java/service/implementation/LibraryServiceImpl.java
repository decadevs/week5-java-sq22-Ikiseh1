package service.implementation;

import enumm.Books;
import model.Identity;
import model.Library;
import service.IdentityComparator;
import service.LibraryService;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LibraryServiceImpl implements LibraryService {

    PriorityQueue<Identity> personsOnQueue;
    Queue<Identity> personsOnQueue2;

    public LibraryServiceImpl(){
        this.personsOnQueue = new PriorityQueue<>(new IdentityComparator());
    }
    public LibraryServiceImpl(int impl2){
        this.personsOnQueue2 = new LinkedList<>();
    }


    @Override
    public void addPerson(Identity Person) {
        personsOnQueue.add(Person);
    }

    @Override
    public void addPerson2(Identity Person) {
        personsOnQueue2.add(Person);
    }


    @Override
    public String collectBook(Library bok) {

        if(bok.getNoOfCopies()==0 ) {
            return "Book Taken.";
        }

       Identity identity = personsOnQueue.poll();
        assert identity != null;
        return identity.getFullName() + " has taken " + bok.getBooks();
    }


    @Override
    public String collectBook2(Library bok) {

        if(bok.getNoOfCopies()==0 ) {
            return "Book Taken.";
        }

        Identity identity = personsOnQueue2.poll();
        assert identity != null;
        return identity.getFullName() + " has taken " + bok.getBooks();
    }

}
