package com.viafoura.sample.boot.message;

import com.viafoura.sample.boot.domain.Address;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class AddressMessage implements Serializable{

    @NotNull(message = "Can't be null")
    @NotEmpty(message = "Can't be Empty")
    @Size(min = 5, message = "The size can't be less than five")

    private String name;

    @NotNull(message = "Can't be null")
    @NotEmpty(message = "Can't be Empty")
    private String address;

    @NotNull(message = "Can't be null")
    @NotEmpty(message = "Can't be Empty")
    @Pattern(regexp = "^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$", message = "Wrong Postal Code")
    private String postalCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "AddressMessage{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    //todo Adapter pattern
    public Address createAddress(){
        return new Address(getName(), getAddress(), getPostalCode());
    }

}
