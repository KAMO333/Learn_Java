package practice;

public class NameMe {
    public String firstName;
    public String lastName;
    public String fullName;

    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        setFullName(first, last);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.fullName = firstName + ' ' + lastName;
    }

    public void setFullName(String firstName, String lastName) {
        this.getFullName();
    }
}
