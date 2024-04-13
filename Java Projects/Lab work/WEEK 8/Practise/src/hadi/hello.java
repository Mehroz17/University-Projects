package hadi;

public class hello {

        private String name;
        private String cnic;

    public hello(String name, String cnic) {
       setName(name);
       setCnic(cnic);
    }

    public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setCnic(String cnic) {
            this.cnic = cnic;
        }

        public String getCnic() {
            return this.cnic;
        }
    }

