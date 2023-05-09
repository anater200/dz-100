public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public boolean isRetired() {
        if (this instanceof Woman) {
            return age >= 60;
        } else if (this instanceof Man) {
            return age >= 65;
        } else {
            return false;
        }
    }

    public void registerPartnership() {
        if (partner != null) {
            partner.setLastName(lastName);
        }
    }

    public void deregisterPartnership(boolean revertLastName) {
        if (partner != null) {
            if (revertLastName) {
                partner.setLastName(partner.getLastName());
            } else {
                partner.setLastName("");
            }
        }
    }
}