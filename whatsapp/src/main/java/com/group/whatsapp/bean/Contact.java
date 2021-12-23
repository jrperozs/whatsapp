package com.group.whatsapp.bean;

public class Contact {
    private Long contactId;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String mainEmail;
    private Long countryId;

    public Contact(Long contactId, String phoneNumber, String firstName, String lastName, String mainEmail, Long countryId) {
        this.contactId = contactId;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainEmail = mainEmail;
        this.countryId = countryId;
    }

    public Long getContactId() { return contactId; }
    public void setContactId(Long contactId) { this.contactId = contactId; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getMainEmail() { return mainEmail; }
    public void setMainEmail(String mainEmail) { this.mainEmail = mainEmail; }

    public Long getCountryId() { return countryId; }
    public void setCountryId(Long countryId) { this.countryId = countryId; }
}
