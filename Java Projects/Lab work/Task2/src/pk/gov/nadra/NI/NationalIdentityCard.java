package pk.gov.nadra.NI;

import pk.gov.nadra.common.Address;

import java.time.LocalDate;

    import java.time.LocalDate;
    public class NationalIdentityCard {
        //states
        private  int cnic;
        private String name;
        private String fatherName;
        private String gender;
        private String dateOfBirth;
        private String region;
        private static LocalDate issueDate;
        private static LocalDate expiryDate;
        private Address address;
        // Non Static Block
        {
            cnic = 85;
        }
        public NationalIdentityCard(String name, String fatherName, String
                gender, String dateOfBirth, String region, Address address) {
            this(region);
            setName(name, fatherName);
            setGender(gender);
            setDateOfBirth(dateOfBirth);
            setAddress(address);
        }
        public NationalIdentityCard(String region) {
            setCnic(region);
        }
        static {
            LocalDate today = LocalDate.now();
            issueDate = today;
            expiryDate = issueDate.plusYears(10);
        }
        private void setCnic(String region) {

            if (region == "KPK") {
                this.cnic = 16202;
            }else if (region == "Punjab") {
                this.cnic = 1739;
            }else if (region == "Sindh") {
                this.cnic = 5876;
            }else if (region == "Balochistan") {
                this.cnic = 9982;
            }else {
                System.out.println("Region not found");
            }


        }
        private void setDateOfBirth(String dateOfBirth) {
            String regex = "^\\d{4}-\\d{2}-\\d{2}$";
            if (dateOfBirth.matches(regex)) {
                this.dateOfBirth = dateOfBirth;
            }else {
                this.dateOfBirth = "";
                System.out.println("Invalid Date of Birth:");
            }
        }
        private void setGender(String gender) {
            if (gender == "Male" || gender == "Female") {
                this.gender = gender;
            }else {
                this.gender = "";
                System.out.println("Invalid gender entered.");
            }
        }
        private void setName(String name, String fatherName) {
            String regex = "^[a-zA-Z]+$";
            if (name.matches(regex)) {
                this.name = name;
            }else {
                this.name = "";
                System.out.println("Invalid applicant name.");
            }
            if (fatherName.matches(regex)) {
                this.fatherName = fatherName;
            }else {
                this.fatherName = "";
                System.out.println("Invalid applicant father name.");
            }
        }
        private void setAddress(Address address) {
            this.address = address;
        }
        public Address getAddress() {
            address.getAddress("Present");
            return address;
        }
        public static void getValidityDates() {
            System.out.println("Issue Date" + " : " + issueDate);
            System.out.println("Expiry Date" + " : " + expiryDate);
        }public void printDetails() {
            System.out.println("NIC number : " + " " + this.cnic);
            System.out.println("Name : " + " " + this.name);
            System.out.println("Father Name : " + " " + this.fatherName);
            System.out.println("Gender : " + " " + this.gender);
            System.out.println("Date of birth is : " + "" + this.dateOfBirth);
            getValidityDates();
        }

}
