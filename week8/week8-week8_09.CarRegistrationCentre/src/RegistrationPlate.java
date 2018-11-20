
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode; //pub year
        this.country = country; //name
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (this.regCode != compared.regCode) {
            return false;
        }

        if (this.country == null || !this.country.equals(compared.country)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        if (this.country == null) {
            return 7;
        }

        return this.regCode.hashCode() + this.country.hashCode();
    }
}

/*
public class RegistrationPlate {
    // don't change the code which is already given to you
 
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;
 
    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }
 
    @Override
    public String toString() {
        return country + " " + regCode;
    }
 
    @Override
    public boolean equals(Object o) {
        RegistrationPlate comparable = (RegistrationPlate) o;
 
        // it might be good to check that this.regCode and this.country are not null
        // however, let's assume that register codes are always in correct format and
        // country has been initialized with some value
        // it would be best to check register code's and country's values in the constructor, and
        // we will be doing this as soon as we learn more of Java's "exceptions"
 
        return regCode.equals(comparable.regCode) && this.country.equals(comparable.country);
    }
 
    @Override
    public int hashCode() {
        // also in this method we trust that register code is in the correct format
        // and that country and regCode are not null
 
        return this.country.hashCode() + this.regCode.hashCode();
    }
}
*/