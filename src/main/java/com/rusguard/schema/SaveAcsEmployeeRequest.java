package com.rusguard.schema;

// DTO класс для запроса
public class SaveAcsEmployeeRequest {
    private String idEmployee;
    private String firstName;
    private String lastName;
    private String secondName;

    private Integer tabelNumber;
    private String position;
//    private String idPposition;
    private String positionGroup;

    private String RegistrationAddress;
    private String ResidentialAddress;
    private String PassportIISUE;
    private String PassportNumber;
    private String email;
    private String emailDescription;
    private Integer emailOrder;
    private String Comment;

    private Boolean isChangeLocked;
    private Boolean isChangePin;

    public SaveAcsEmployeeRequest() {
    }

    public Integer getEmailOrder() {
        return emailOrder;
    }

    public void setEmailOrder(Integer emailOrder) {
        this.emailOrder = emailOrder;
    }

    public Boolean getChangeLocked() {
        return isChangeLocked;
    }

    public void setChangeLocked(Boolean changeLocked) {
        isChangeLocked = changeLocked;
    }

    public Boolean getChangePin() {
        return isChangePin;
    }

    public void setChangePin(Boolean changePin) {
        isChangePin = changePin;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondname) {
        this.secondName = secondname;
    }

    public Integer getTabelNumber() {
        return tabelNumber;
    }

    public void setTabelNumber(Integer tabelNumber) {
        this.tabelNumber = tabelNumber;
    }

//    public String getIdPosition() {
//        return idPosition;
//    }
//
//    public void setIdPosition(String idPosition) {
//        this.idPosition = idPosition;
//    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionGroup() {
        return positionGroup;
    }

    public void setPositionGroup(String positionGroup) {
        this.positionGroup = positionGroup;
    }

    public String getRegistrationAddress() {
        return RegistrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        RegistrationAddress = registrationAddress;
    }

    public String getResidentialAddress() {
        return ResidentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        ResidentialAddress = residentialAddress;
    }

    public String getPassportIISUE() {
        return PassportIISUE;
    }

    public void setPassportIISUE(String passportIISUE) {
        PassportIISUE = passportIISUE;
    }

    public String getPassportNumber() {
        return PassportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        PassportNumber = passportNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailDescription() {
        return emailDescription;
    }

    public void setEmailDescription(String emailDescription) {
        this.emailDescription = emailDescription;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public Boolean getIsChangeLocked() {
        return isChangeLocked;
    }

    public void setIsChangeLocked(Boolean changeLocked) {
        isChangeLocked = changeLocked;
    }

    public Boolean getIsChangePin() {
        return isChangePin;
    }

    public void setIsChangePin(Boolean changePin) {
        isChangePin = changePin;
    }
}