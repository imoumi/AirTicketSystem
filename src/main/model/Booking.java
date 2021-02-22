package model;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

//Makes a booking and generates a ticket
public class Booking {
    private String name;
    private String passportNo;
    private String dateOfBirth;
    private String address;
    private String contactNo;
    private String emergencyContact;
    private String gender;
    private String email;
    private String seatNo;
    private String seatType;
    private boolean windowSeat;
    private String flightNo;
    private String departure;
    private String arrival;
    private String flightType;
    private String duration;
    private Date date;
    private String bookingNo;

    public Booking(){

    }

    public Booking(String name, String passportNo, String dateOfBirth, String address, String contactNo,
                   String emergencyContact, String gender, String email, String seatNo, String seatType,
                   boolean windowSeat, String flightNo, String departure, String arrival, String flightType,
                   String duration, Date date, String bookingNo) {

        this.name = name;
        this.passportNo = passportNo;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.contactNo = contactNo;
        this.emergencyContact = emergencyContact;
        this.gender = gender;
        this.email = email;
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.windowSeat = windowSeat;
        this.flightNo = flightNo;
        this.departure = departure;
        this.arrival = arrival;
        this.flightType = flightType;
        this.duration = duration;
        this.date = date;
        this.bookingNo = bookingNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public boolean isWindowSeat() {
        return windowSeat;
    }

    public void setWindowSeat(boolean windowSeat) {
        this.windowSeat = windowSeat;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
    }

    // Require: flight no.
    // Effects: generates ticket number

    public String generateBookingNo() {
        String bookingNo = "";
        int lastDigits = 5432;
        SecureRandom ran = new SecureRandom();
        lastDigits = lastDigits + 1;
        if (!flightNo.equals("")) {
            bookingNo = flightNo + "-" + lastDigits;
        } else {
            bookingNo = lastDigits + "-" + lastDigits;
        }
        return bookingNo;
    }
}