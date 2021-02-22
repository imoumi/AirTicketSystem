package ui;

import model.Booking;
import model.Flight;
import model.Seat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    private static String des;
    private static Date dateTime;
    private static String seatType;
    private static boolean seatBookingFlag;
    private static ArrayList<String> userInfo = new ArrayList<String>();
    private static ArrayList<Flight> selectedFlights = new ArrayList<Flight>();
    private static Flight matchedFlight = new Flight();
    private static ArrayList<Flight> flightList = new ArrayList<Flight>();

    private static ArrayList<Flight> flightsList = new ArrayList<Flight>();


    // Modifies: this
    // Require : Initializes flights

    public static ArrayList<Flight> flightsInit() {
        Flight f1 = new Flight("Air North","AN43215","Canada","Calgary",
                "Domestic", "4 hrs",null,3,2,null);
        f1.setSeatInfo(f1seatsInit(f1.getBusinessSeatNo() + f1.getEconomySeatNo()));
        f1.setTimeDate(f1timeInit());
        flightsList.add(f1);
        Flight f2 = new Flight("Air Canada","AC64536","Canada","Montreal",
                "Domestic", "5 hrs",null,2,2,null);
        f2.setSeatInfo(f2seatsInit(f2.getBusinessSeatNo() + f2.getEconomySeatNo()));
        f2.setTimeDate(f2timeInit());
        flightsList.add(f2);
        Flight f3 = new Flight("Southern Airline","SA64536","Canada","Toronto",
                "Domestic", "5 hrs",null,2,2,null);
        f3.setSeatInfo(f3seatsInit(f3.getBusinessSeatNo() + f3.getEconomySeatNo()));
        f3.setTimeDate(f3timeInit());
        flightsList.add(f3);
        Flight f4 = new Flight("Kingfisher","KS34521","Canada","Vancouver",
                "Domestic", "5 hrs",null,2,2,null);
        f4.setSeatInfo(f4seatsInit(f4.getBusinessSeatNo() + f4.getEconomySeatNo()));
        f4.setTimeDate(f4timeInit());
        flightsList.add(f4);
        return flightsList;
    }


    // Modifies: This
    // Effect: initializes seats for flight 1

    public static Seat[] f1seatsInit(int totalSeats) {
        Seat[] f1seats = new Seat[totalSeats];
        f1seats[0] = new Seat("1",false,"Economic",true,null,200);
        f1seats[1] = new Seat("2",false,"Economic",false,null,180);
        f1seats[2] = new Seat("3",false,"Business",false,null,250);
        f1seats[3] = new Seat("4",false,"Business",true,null,300);
        f1seats[4] = new Seat("5",false,"Business",false,null,200);
        return f1seats;
    }

    // Modifies: This
    // Effect: initializes seats for flight 2

    public static Seat[] f2seatsInit(int totalSeats) {
        Seat[] f2seats = new Seat[totalSeats];
        f2seats[0] = new Seat("1",false,"Economic",true,null,200);
        f2seats[1] = new Seat("2",false,"Economic",false,null,180);
        f2seats[2] = new Seat("3",false,"Business",false,null,250);
        f2seats[3] = new Seat("4",false,"Business",true,null,300);
        return f2seats;
    }
    // Modifies: This
    // Effect: initializes seats for flight 3

    private static Seat[] f3seatsInit(int totalSeats) {
        Seat[] f3seats = new Seat[totalSeats];
        f3seats[0] = new Seat("1",false,"Economic",true,null,200);
        f3seats[1] = new Seat("2",false,"Economic",false,null,180);
        f3seats[2] = new Seat("3",false,"Business",false,null,250);
        f3seats[3] = new Seat("4",false,"Business",true,null,300);
        return f3seats;
    }
    // Modifies: This
    // Effect: initializes seats for flight 4

    private static Seat[] f4seatsInit(int totalSeats) {
        Seat[] f4seats = new Seat[totalSeats];
        f4seats[0] = new Seat("1",false,"Economic",true,null,200);
        f4seats[1] = new Seat("2",false,"Economic",false,null,180);
        f4seats[2] = new Seat("3",false,"Business",false,null,250);
        f4seats[3] = new Seat("4",false,"Business",true,null,300);
        return f4seats;
    }

    // Modifies: This
    // Effect: initializes time for flight 1
    public static Date[] f1timeInit() {
        Date[] f1dates = new Date[3];
        //1st date
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.DAY_OF_MONTH,3);
        c1.set(Calendar.HOUR_OF_DAY,14);
        c1.set(Calendar.MINUTE,11);
        c1.set(Calendar.SECOND,0);
        f1dates[0] = c1.getTime();
        //2nd date
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.DAY_OF_MONTH,15);
        c2.set(Calendar.HOUR_OF_DAY,18);
        c2.set(Calendar.MINUTE,30);
        c2.set(Calendar.SECOND,0);
        f1dates[1] = c2.getTime();
        //3rd date
        Calendar c3 = Calendar.getInstance();
        c3.set(Calendar.DAY_OF_MONTH,24);
        c3.set(Calendar.HOUR_OF_DAY,5);
        c3.set(Calendar.MINUTE,30);
        c3.set(Calendar.SECOND,0);
        f1dates[2] = c3.getTime();
        return f1dates;
    }
    // Modifies: This
    // Effect: initializes time for flight 2

    public static Date[] f2timeInit() {
        Date[] f2dates = new Date[3];
        //1st date
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.DAY_OF_MONTH,3);
        c1.set(Calendar.HOUR_OF_DAY,14);
        c1.set(Calendar.MINUTE,00);
        c1.set(Calendar.SECOND,0);
        f2dates[0] = c1.getTime();
        //2nd date
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.DAY_OF_MONTH,15);
        c2.set(Calendar.HOUR_OF_DAY,18);
        c2.set(Calendar.MINUTE,30);
        c2.set(Calendar.SECOND,0);
        f2dates[1] = c2.getTime();
        //3rd date
        Calendar c3 = Calendar.getInstance();
        c3.set(Calendar.DAY_OF_MONTH,24);
        c3.set(Calendar.HOUR_OF_DAY,5);
        c3.set(Calendar.MINUTE,30);
        c3.set(Calendar.SECOND,0);
        f2dates[2] = c3.getTime();
        //System.out.println(d);
        return f2dates;
    }
    // Modifies: This
    // Effect: initializes time for flight 3

    private static Date[] f3timeInit() {
        Date[] f3dates = new Date[3];
        //1st date
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.DAY_OF_MONTH,3);
        c1.set(Calendar.HOUR_OF_DAY,14);
        c1.set(Calendar.MINUTE,00);
        c1.set(Calendar.SECOND,0);
        f3dates[0] = c1.getTime();
        //2nd date
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.DAY_OF_MONTH,15);
        c2.set(Calendar.HOUR_OF_DAY,18);
        c2.set(Calendar.MINUTE,30);
        c2.set(Calendar.SECOND,0);
        f3dates[1] = c2.getTime();
        //3rd date
        Calendar c3 = Calendar.getInstance();
        c3.set(Calendar.DAY_OF_MONTH,24);
        c3.set(Calendar.HOUR_OF_DAY,5);
        c3.set(Calendar.MINUTE,30);
        c3.set(Calendar.SECOND,0);
        f3dates[2] = c3.getTime();
        //System.out.println(d);
        return f3dates;
    }
    // Modifies: This
    // Effect: initializes time for flight 4

    private static Date[] f4timeInit() {
        Date[] f4dates = new Date[3];
        //1st date
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.DAY_OF_MONTH,3);
        c1.set(Calendar.HOUR_OF_DAY,14);
        c1.set(Calendar.MINUTE,00);
        c1.set(Calendar.SECOND,0);
        f4dates[0] = c1.getTime();
        //2nd date
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.DAY_OF_MONTH,15);
        c2.set(Calendar.HOUR_OF_DAY,18);
        c2.set(Calendar.MINUTE,30);
        c2.set(Calendar.SECOND,0);
        f4dates[1] = c2.getTime();
        //3rd date
        Calendar c3 = Calendar.getInstance();
        c3.set(Calendar.DAY_OF_MONTH,24);
        c3.set(Calendar.HOUR_OF_DAY,5);
        c3.set(Calendar.MINUTE,30);
        c3.set(Calendar.SECOND,0);
        f4dates[2] = c3.getTime();
        //System.out.println(d);
        return f4dates;
    }


    // Runs the entire program

    public static void main(String[] args) {
        chooseDestination();
        chooseDate();
        chooseSeatType();
        selectedFlights = searchFlight();
        if (seatBookingFlag == true) {
            matchedFlight = seatBooking(selectedFlights);
            if (!matchedFlight.equals(null)) {
                userInfo = userInfo();
                booking(matchedFlight);
            }
        }
    }

    //Modifies: This
    //Effects: Search available flights upon user's input

    public static ArrayList<Flight> searchFlight() {
        ArrayList<Flight> selectedFlights = new ArrayList<Flight>();
        flightList = flightsInit();
        for (Flight f : flightList) {
            Date[] d = new Date[3];
            d = f.getTimeDate();
            for (Date date : d) {
                Seat[] s = new Seat[f.getEconomySeatNo() + f.getBusinessSeatNo()];
                s = f.getSeatInfo();
                for (Seat seat : s) {
                    if (des.equals(f.getArrival()) && seatType.equals(seat.getSeatType())
                            && dateTime.getDate() == date.getDate() && dateTime.getYear() == date.getYear()
                            && dateTime.getMonth() == date.getMonth() && seat.isBookingStatus() == false) {
                        seatBookingFlag = true;
                        String windowVariable = checkWindow(seat.isWindow());
                        printSelectedSeatInfo(seat.getSeatNo(), des, seat.getSeatType(), date.toString(),
                                f.getFlightNo(), f.getAirlineName(), windowVariable, seat.getPrice(), f.getDuration());
                        selectedFlights.add(f);
                    }
                }
            }
        }
        showNoFlightMassage(seatBookingFlag);
        return selectedFlights;
    }

    //Modifies: This
    //Effects: Shows no flights available upon user's input

    public static void showNoFlightMassage(boolean flag) {
        if (flag == false) {
            System.out.println("---No flights available---");
            chooseDestination();
        }
    }

    //Modifies: this
    //Effects: determines weather the seat is a window seat

    public static String checkWindow(boolean value) {
        String windowVariable = "";
        if (value == true) {
            windowVariable = "Yes";
        } else {
            windowVariable = "n/a";
        }
        return windowVariable;
    }

    // Modifies: this
    // Effects: Prints available seat info

    public static void printSelectedSeatInfo(String seatNo, String destination, String seatType, String date,
                                             String flightNo, String airlineName, String window, int price,
                                             String duration) {
        System.out.println("Seat no: " + seatNo + "    Destination: " + destination + "    Seat type: " + seatType
                + "    Date: " + date + "    \nFlight No.: " + flightNo + "    Airlines Name: " + airlineName
                + "    Window Seat: " + window + "    Price: " + price + "    Duration: " + duration + "\n");
    }

    //Modifies: This
    //Effects: Asks user to select a seat and if wrong seat info is given the user is asked to Choose seat again

    public static Flight seatBooking(ArrayList<Flight> selectedFlight) {
        Flight matchedFlight = new Flight();
        boolean flag = false;
        System.out.println("For booking please enter seat no. and flight no.:\nSeat no.:");
        String seatNo = input.next();
        System.out.println("Flight No.:");
        String flightNo = input.next();
        for (Flight f : selectedFlight) {
            Seat[] s = new Seat[f.getEconomySeatNo() + f.getBusinessSeatNo()];
            s = f.getSeatInfo();
            for (Seat seat : s) {
                if (f.getFlightNo().equals(flightNo) && seat.getSeatNo().equals(seatNo)) {
                    flag = true;
                    seat.setBookingStatus(true);
                    matchedFlight = f;
                }
            }
        }
        if (flag == false) {
            System.out.println("Invalid seat or flight no.\nTry again!!");
            seatBooking(selectedFlight);
        }
        return matchedFlight;
    }

    //Modifies: This
    //Effects: Takes input for user's personal details

    public static ArrayList<String> userInfo() {
        ArrayList<String> userList = new ArrayList<String>();
        System.out.println("Enter your personal info: \nname:");
        String name = input.next();
        userList.add(name);
        String passportNo = setUserPassportNo();
        userList.add(passportNo);
        Date d = setUserBirthday();
        String dateOfBirth = String.valueOf(d.getDate() + "-" + d.getMonth() + "-" + d.getYear());
        userList.add(dateOfBirth);
        String address = setUserAddress();
        userList.add(address);
        System.out.println("Contact No:");
        String contact = input.next();
        userList.add(contact);
        String emergencyContact = setEmergencyContact(contact);
        userList.add(emergencyContact);
        String gender = selectGender();
        userList.add(gender);
        String email = setUserEmail();
        userList.add(email);
        return userList;
    }
    // Modifies: this
    // Effects: takes input for user's passport No.

    public static String setUserPassportNo() {
        System.out.println("Passport No:");
        String passportNo = input.next();
        return passportNo;
    }

    // Modifies: this
    // Effects: takes input of user's address

    public static String setUserAddress() {
        System.out.println("Address:");
        String address = input.next();
        return address;
    }

    // Modifies: this
    // Effects: takes input of user's email address

    public static String setUserEmail() {
        System.out.println("Email address:");
        String email = input.next();
        return email;
    }

    // Modifies: this
    // Effects: takes input of user's DOB

    public static Date setUserBirthday() {
        Date dateOfBirth = null;
        System.out.println("Date Of Birth:\nDay:");
        int day = input.nextInt();
        if (day >= 1 && day <= 31) {
            System.out.println("Month:");
            int month = input.nextInt();
            if (month >= 1 && month <= 12) {
                System.out.println("Year:");
                int year = input.nextInt();
                if (year >= 1950 && year <= 2010) {
                    dateOfBirth = generateDateFormat(day, (month - 1), year);
                    System.out.println("Your Date of Birth is: " + day + "-" + month + "-" + year);
                } else {
                    System.out.println("Oops! wrong input!\nOR\nYour age is below 10.");
                    endProgram();
                }
            }
        }
        return dateOfBirth;
    }
    // Modifies: this
    // Effects: takes input of user's emergency contact

    public static String setEmergencyContact(String contact) {
        String emergencyContact = "";
        do {
            if (contact.equals(emergencyContact)) {
                System.out.println("---Emergency and personal contact no can't be same!---");
            }
            System.out.println("Emergency Contact No:");
            emergencyContact = input.next();
        } while (contact.equals(emergencyContact));
        return emergencyContact;
    }
    // Modifies: this
    // Effects: takes input of user's gender

    public static String selectGender() {
        System.out.println("Gender: \n         m -> Male\n         f -> Female\n         o -> Other");
        String gender = input.next();
        switch (gender) {
            case "m":
                gender = "Male";
                break;
            case "f":
                gender = "Female";
                break;
            case "o":
                gender = "Other";
                break;
            default:
                System.out.println("Invalid Gender!");
                selectGender();
        }
        return gender;
    }
    // Modifies: this
    // Effects: takes input of user's destination

    public static void chooseDestination() {
        System.out.println("\nTravelling to:\nc -> Calgary\nm -> Montreal");
        System.out.println("t -> Toronto\nv ->Vancouver\npress q for quit");
        String choice1 = input.next();
        if (choice1.equals("c")) {
            des = "Calgary";
        } else if (choice1.equals("m")) {
            des = "Montreal";
        } else if (choice1.equals("t")) {
            des = "Toronto";
        } else if (choice1.equals("v")) {
            des = "Vancouver";
        } else if (choice1.equals("q")) {
            endProgram();
        } else {
            System.out.println("Oops! wrong input!\nYou have to choose again");
            chooseDestination();
        }
        if (!des.equals("")) {
            System.out.println("Travelling to: " + des);
        }
    }

    // Modifies: this
    // Effects: takes input of user's date of choice

    public static void chooseDate() {
        int day;
        int month;
        int year;
        System.out.println("Travel Date:\nDay:");
        day = input.nextInt();
        if (day >= 1 && day <= 31) {
            System.out.println("Month:");
            month = input.nextInt();
            if (month >= 1 && month <= 12) {
                System.out.println("Year:");
                year = input.nextInt();
                if (year >= 2020 && year <= 2022) {
                    dateTime = generateDateFormat(day, month, year);
                    System.out.println("Your selected date is: " + day + "-" + month + "-" + year);
                } else {
                    System.out.println("Oops! wrong input!\nYou have to choose again");
                    chooseDate();
                }
            }
        }
    }
    // Modifies: this
    // Effects: generates the date format that is shown upon user's entry

    public static Date generateDateFormat(int day, int month, int year) {
        Date date = null;
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.YEAR, year);
        date = c.getTime();
        return date;
    }

    // Modifies: this
    // Effects: takes input of user's Seat Type

    public static void chooseSeatType() {
        System.out.println("Seat Type:");
        System.out.println("e -> Economic\nb -> Business\n");
        String seat = input.next();
        switch (seat) {
            case "e":
                seatType = "Economic";
                System.out.println("Seat Type: Economic");
                break;

            case "b":
                seatType = "Business";
                System.out.println("Seat Type: Business");
                break;
            default:
                System.out.println("Oops! wrong input!\nYou have to choose again");
                chooseSeatType();

        }
    }
    // Modifies: this
    // Effects: The program ends

    public static void endProgram() {
        System.exit(0);
    }
    // Modifies: this, f
    // Effects: gathers all the information about the travel

    public static void booking(Flight f) {
        Booking book = new Booking();
        Seat[] s = new Seat[f.getEconomySeatNo() + f.getBusinessSeatNo()];
        s = f.getSeatInfo();
        for (Seat seat : s) {
            if (seat.isBookingStatus() == true) {
                book.setName(userInfo.get(0));
                book.setPassportNo(userInfo.get(1));
                book.setDateOfBirth(userInfo.get(2));
                book.setAddress(userInfo.get(3));
                book.setContactNo(userInfo.get(4));
                book.setEmergencyContact(userInfo.get(5));
                book.setGender(userInfo.get(6));
                book.setEmail(userInfo.get(7));
                book.setSeatType(seat.getSeatType());
                book.setSeatNo(seat.getSeatNo());
                book.setFlightNo(f.getFlightNo());
                book.setArrival(f.getArrival());
                book.setDuration(f.getDuration());
                book.setDate(dateTime);
                book.setBookingNo(book.generateBookingNo());
                printTicket(book);
            }
        }
    }
    // Modifies: this
    // Effects: prints the details of the booked ticket

    public static void printTicket(Booking book) {
        System.out.println("-----------------------------------------------------------------------------\nTicket No: "
                + " " + book.getBookingNo() + "  Flight No.:" + book.getFlightNo() + "   Time: " + book.getDate()
                + "  Destination: " + book.getArrival() + "\nName: " + book.getName()
                + " Passport No.: " + book.getPassportNo() + "  Date of Birth: " + book.getDateOfBirth()
                + "  Contact No: " + book.getContactNo() + "  Emergency Contact No.: " + book.getEmergencyContact()
                + "\n------------------------------------------------------------------------------------------------");
    }


}