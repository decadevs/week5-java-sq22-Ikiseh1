import enumm.Books;
import model.Identity;
import model.Library;
import service.implementation.LibraryServiceImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Identity seniorStudent = new Identity("Alabo Hamlet", false, true, false);
        Identity juniorStudent = new Identity("Aruehi-Ohi Prosper", false, false, true);
        Identity teacher = new Identity("Segun Osiki", true, false, false);

        Library libraryBooks = new Library(Books.FUNDAMENTALS_OF_JAVA, 1);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        libraryService.addPerson(seniorStudent);
        libraryService.addPerson(juniorStudent);
        libraryService.addPerson(teacher);

        System.out.println("*****************************************************************");
        System.out.println("IMPLEMEMENTATION 1 BASE ON PRIORITY:");
        System.out.println(libraryService.collectBook(libraryBooks));

        System.out.println("*****************************************************************");
        System.out.println("IMPLEMENTATION 2 BASE ON FIRST COME FIRST SERVE:");
        LibraryServiceImpl libraryService2 = new LibraryServiceImpl(2);

        libraryService2.addPerson2(seniorStudent);
        libraryService2.addPerson2(juniorStudent);
        libraryService2.addPerson2(teacher);
        System.out.println(libraryService2.collectBook2(libraryBooks));



    }
}
