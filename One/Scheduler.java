/**
 * Scheduler
 */

public class Scheduler {

    private String availServices;
    private String survey;
    private String serviceNeed;
    private String appointment;
    private String referral;
    
    //public member functions
    public void makeAppointment(){

    }

    public void makeReferral(){

    }
    
    
    public MedicalEngagement requestToBeSeen(MedicalEngagement m){
        System.out.println("Select a service provided or select unknown.");
       
       if(true){
        makeAppoitnmet();
    }    
        ServiceNeed.identifyNeed();

        if (true){
            makeAppoitnmet();
    }
        else {
            makeReferral();
    }    

        return m;

}

    private void makeAppoitnmet() {
    }
}