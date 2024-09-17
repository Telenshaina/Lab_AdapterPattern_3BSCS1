package AdapterPattern_LabSW3;
public class AttendanceSystemAdapter implements SystemOutlet{

    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter (AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    public String integrateSystem(){
        return attendanceSystem.markAttendance();
    }

    
}
