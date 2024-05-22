package service.implementation;

import enumm.Books;
import model.Identity;
import model.Library;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    @Test
    void itShouldTestForAddPerson() {
        //Show that 1 person is added at a time.
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        Identity identity = new Identity("Segun Osiki", true, false, false);
        libraryService.addPerson(identity);
        assertEquals(1, libraryService.personsOnQueue.size());
    }

    @Test
    void itShouldTestForBookTaken() {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        Library collectBook = new Library(Books.FUNDAMENTALS_OF_JAVA, 0);
        assertEquals("Book Taken.", libraryService.collectBook(collectBook));

    }
}