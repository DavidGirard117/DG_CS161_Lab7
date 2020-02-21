/**
 * ClinicService
 */
public class ClinicService {

    private int number;
    private String name;
    private String serviceDescription;

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
    public void getAvailableService(){
       
    }
    
    public ServiceNeed compare(ServiceNeed s){
        return s;
    }

    

    

}