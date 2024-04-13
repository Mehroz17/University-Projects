package Inheritance;

public class Application {
    public static void main(String[] args) {

        //Hostelite hstd = new Hostelite("Ali","FA20-BSE-000","Johar Hostel",44);

        Masters mstd = new Masters();

        System.out.println(mstd);

        //Accessing grandparent states
        mstd.setName("Faizan");
        mstd.getName();

        //Accessing own state
        System.out.println(mstd.type);

        //Accessing parent states, inherited states
        mstd.setTech("Cyber security");
        mstd.getTech();


        //direct accessing states of a class / they are default and they are in the same package
		/*hstd.id = "FA20-BSE-000";
		hstd.name = "Ali";

		System.out.println(hstd.id);
		System.out.println(hstd.name);*/

		/*hstd.setName("Ali");
		hstd.getName();
		hstd.setId("FA20-BSE-000");
		hstd.getId();*/

		/*hstd.getName();
		hstd.getId();
		hstd.getHostel();
		hstd.getRoom();
		hstd.calculateFee();
		System.out.println(hstd.uniName);*/






    }

}

