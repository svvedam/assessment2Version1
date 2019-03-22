package rocks.zipcode.assessment2.objectorientation;

import java.util.Objects;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    private String addressLine1 = "";
    private String addressLine2 = "";
    private String city = "";
    private String state = "";
    private String zipcode = "";

    public Address() {
        //another way to set the default value for the fields
//        this.addressLine1 = "";
//        this.addressLine2 = "";
//        this.city = "";
//        this.state = "";
//        this.zipcode = "";

    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof Address)) {
            return false;
        }

        Address otherAddress = (Address)o;

        return isEqualField(this.addressLine1, otherAddress.addressLine1)
                && isEqualField(this.addressLine2, otherAddress.addressLine2)
                && isEqualField(this.city, otherAddress.city)
                && isEqualField(this.state, otherAddress.state)
                && isEqualField(this.zipcode, otherAddress.zipcode);
    }

    private boolean isEqualField(Object object1, Object object2) {
        if (object1 == null && object2 != null) {
            return false;
        } else if (!object1.equals(object2)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Address{addressLine1='" + this.addressLine1
                + "', addressLine2='" + this.addressLine2
                +"', city='" + this.city
                + "', state='" + this.state
                +"', zipcode='" + this.zipcode + "'}";
    }
}
