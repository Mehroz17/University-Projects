package Enumirations;

public class C {
    private String CN;

    public C(String CN) {
        setCN(CN);

    }

    public String getCN() {
        return CN;
    }

    public void setCN(String CN) {
        this.CN = CN;
    }



    public void show(){
        if(CN.equals("Lahore")){
            System.out.println("City Name: "+Apple.C.getCity());
            System.out.println("Population: "+Apple.C.getPopulation());
        }
    }




    }

