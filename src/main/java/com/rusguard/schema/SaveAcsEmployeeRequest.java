package com.rusguard.schema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
// DTO класс для запроса
@Schema(description = "Запрос на сохранение/обновление данных сотрудника СКУД")
public class SaveAcsEmployeeRequest {
    @Schema(
            description = "Уникальный идентификатор сотрудника (UUID)",
            example = "a38abfd9-d277-43fb-b719-618c7c91e7a1",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String idEmployee;
    @Schema(
            description = "Имя сотрудника",
            example = "Иван",
            minLength = 1,
            maxLength = 100
    )
    @Size(min = 1, max = 100, message = "Имя должно содержать от 1 до 100 символов")
    private String firstName;
    @Schema(
            description = "Фамилия сотрудника",
            example = "Иванов",
            minLength = 1,
            maxLength = 100
    )
    @Size(min = 1, max = 100, message = "Фамилия должна содержать от 1 до 100 символов")
    private String lastName;
    @Schema(
            description = "Отчество сотрудника",
            example = "Иванович",
            maxLength = 100
    )
    @Size(max = 100, message = "Отчество должно содержать до 100 символов")
    private String secondName;
    @Schema(
            description = "Табельный номер сотрудника",
            example = "12345",
            minimum = "1",
            maximum = "999999"
    )
    private Integer tabelNumber;
    @Schema(
            description = "Идентификатор должности (UUID)",
            example = "2129e300-520e-4ec3-a95a-8b5c7dfb34a7"
    )
    @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$",
            message = "Неверный формат UUID")
    private String position;
    private String idPosition;
    private String positionGroup;

    private String RegistrationAddress;
    private String ResidentialAddress;
    private String PassportIISUE;
    private String PassportNumber;@Schema(
            description = "Адрес электронной почты",
            example = "ivanov@example.com",
            format = "email"
    )
    @Email(message = "Неверный формат email")
    private String email;
    private String emailDescription;
    private Integer emailOrder;
    private String Comment;
    @Schema(
            description = "Заблокировать изменения вручную",
            example = "false",
            defaultValue = "false"
    )
    private Boolean isChangeLocked;
    @Schema(
            description = "Заблокировать изменение PIN-кода",
            example = "false",
            defaultValue = "false"
    )
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

    public String getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(String idPosition) {
        this.idPosition = idPosition;
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
        this.RegistrationAddress = registrationAddress;
    }

    public String getResidentialAddress() {
        return ResidentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.ResidentialAddress = residentialAddress;
    }

    public String getPassportIISUE() {
        return PassportIISUE;
    }

    public void setPassportIISUE(String passportIISUE) {
        this.PassportIISUE = passportIISUE;
    }

    public String getPassportNumber() {
        return PassportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.PassportNumber = passportNumber;
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
        this.Comment = comment;
    }

    public Boolean getIsChangeLocked() {
        return isChangeLocked;
    }

    public void setIsChangeLocked(Boolean changeLocked) {
        this.isChangeLocked = changeLocked;
    }

    public Boolean getIsChangePin() {
        return isChangePin;
    }

    public void setIsChangePin(Boolean changePin) {
        this.isChangePin = changePin;
    }
}