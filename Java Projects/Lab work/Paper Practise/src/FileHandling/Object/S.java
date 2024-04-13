package FileHandling.Object;

import java.io.Serializable;

public class S implements Serializable {

        //default serialVersion id
        private static final long serialVersionUID = 1L;

        private String first_name;
        private String last_name;
        private int age;

        public S(String fname, String lname, int age){
            this.first_name = fname;
            this.last_name  = lname;
            this.age        = age;
        }

        public void setFirstName(String fname) {
            this.first_name = fname;
        }

        public String getFirstName() {
            return this.first_name;
        }

        public void setLastName(String lname) {
            this.first_name = lname;
        }

        public String getLastName() {
            return this.last_name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return new StringBuffer(" First Name : ").append(this.first_name)
                    .append(", Last Name : ").append(this.last_name).append(", Age : ").append(this.age).toString();
        }

    }

