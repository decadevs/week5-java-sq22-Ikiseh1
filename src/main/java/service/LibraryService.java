package service;

import model.Identity;
import model.Library;

public interface LibraryService {
    public void addPerson(Identity Person);
    public String collectBook(Library bok);
}

