package AdapterPattern_LabSW3;

public class LibrarySystemAdapter implements SystemOutlet{
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter (LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    public String integrateSystem(){
        return librarySystem.manageBooks();
    }
}
