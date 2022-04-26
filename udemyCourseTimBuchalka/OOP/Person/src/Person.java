public class Person {

    private String firstName;
    private String lastName;
    private int age;

//    setters:
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

//    getters:
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

//    is teen
    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }

//    get full name
    public String getFullName() {
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return "";
        } else if (getLastName().isEmpty() && !getFirstName().isEmpty()) {
            return getFirstName();
        } else if (!getLastName().isEmpty() && getFirstName().isEmpty()) {
            return getLastName();
        } else {
            return getFirstName() + " " + getLastName();
        }
    }

}
