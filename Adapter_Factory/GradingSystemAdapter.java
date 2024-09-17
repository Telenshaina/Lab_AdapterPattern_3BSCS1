package AdapterPattern_LabSW3;

public class GradingSystemAdapter implements SystemOutlet{
    private GradingSystem gradingSystem;

    public GradingSystemAdapter (GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    public String integrateSystem(){
        return gradingSystem.recordGrades();
    }
}


