package AdapterPattern_LabSW3;
public class SchoolManagementApp {
    public static void main(String[] args){

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SystemOutlet attendanceAd = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SystemOutlet gradeAd = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SystemOutlet libAd = new LibrarySystemAdapter(librarySystem);

           System.out.println();
           System.out.println(attendanceAd.integrateSystem());
           System.out.println(gradeAd.integrateSystem());
           System.out.println(libAd.integrateSystem());

   }
}
