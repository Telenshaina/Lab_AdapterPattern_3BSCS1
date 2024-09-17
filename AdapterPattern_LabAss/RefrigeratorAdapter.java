public class RefrigeratorAdapter implements  PowerOutlet{

    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator){
        this.refrigerator = refrigerator;
    }

    public String plugIn(){
        return refrigerator.startCooling();
    }
}
