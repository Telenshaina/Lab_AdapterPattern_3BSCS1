package Adapter_Factory;
public class ConcreteAdapterFactory implements AdapterFactory{
    public SystemOutlet SystemOutlet(){
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        return new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new gradingSystem();
        return new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        return new LibrarySystemAdapter(librarySystem);
    }
}