package service;

import model.Identity;
import model.Library;

public interface LibraryService {
    public void addPerson(Identity Person);
    public void addPerson2(Identity Person);
    public String collectBook(Library bok);
    public String collectBook2(Library bok);
}

