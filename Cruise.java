/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaidecruiseline;

import java.util.*;

/**
 * Create the cruise class
 * @author Yifei
 * @version 1.0.0
 * @since 02/10/2014
 */

public class Cruise {
    /**
     * Stand for the serial number of cruise
     */
    private int number;
    /**
     * Stand for the sailing date of cruise
     */
    private Date sailingDate;
    /**
     * Stand for the return date of cruise
     */
    private Date returnDate;
    /**
     * Stand for the departure port of cruise
     */
    private String departurePort;
    /**
     * Stand for the ship of cruise
     */
    private Ship ship;
    /**
     * Stand for the passengers of cruise
     */
    private ArrayList<Passenger> passengers;
    /**
     * Stand for the ports of cruise
     */
    private ArrayList<Port> ports;
    /**
     * Stand for the sailors of cruise
     */
    private ArrayList<Sailor> sailors;
    /**
     * Create a new class of cruise
     *
     * @param number the serial number of cruise
     */
    public Cruise(int number) {
        this.number = number;
        this.sailingDate = new Date(114, 8, 30);
        this.returnDate = new Date(114, 9, 30);
        this.departurePort = "Adelaide";
    }
    /**
     * Return the serial number of cruise
     *
     * @return the serial number of cruise
     */
    public int getNumber() {
        return number;
    }
    /**
     * Set the serial number of cruise
     *
     * @param number the serial number of cruise
     */
    public void setNumber(int number) {
        this.number = number;
    }
    /**
     * Return the sailing date of cruise
     *
     * @return the sailing date of cruise
     */
    public Date getSailingDate() {
        return sailingDate;
    }
    /**
     * Set the sailing date of cruise
     *
     * @param sailingDate the sailing date of cruise
     */
    public void setSailingDate(Date sailingDate) {
        this.sailingDate = sailingDate;
    }
    /**
     * Return the return date of cruise
     *
     * @return the return date of cruise
     */
    public Date getReturnDate() {
        return returnDate;
    }
    /**
     * Set the return date of cruise
     *
     * @param returnDate the return date of cruise
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    /**
     * Return the departure port of cruise
     *
     * @return the departure port of cruise
     */
    public String getDeparturePort() {
        return departurePort;
    }
    /**
     * Set the departure port of cruise
     *
     * @param departurePort the departure port of cruise
     */
    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    /**
     * Return the ship of cruise
     *
     * @return the ship
     */
    public Ship getShip() {
        return ship;
    }
    /**
     * Set the ship of cruise
     * @param ship the ship
     */
    public void setShip(Ship ship) {
        this.ship = ship;
    }
    /**
     * Return the passengers of cruise
     * @return the passengers
     */
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    /**
     * Set the passengers of cruise
     * @param passengers the passengers
     */
    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
    /**
     * Return the ports of cruise
     * @return ports
     */
    public ArrayList<Port> getPorts() {
        return ports;
    }
    /**
     * Set the ports of cruise
     * @param ports ports
     */
    public void setPorts(ArrayList<Port> ports) {
        this.ports = ports;
    }
    /**
     * Return sailors of cruise
     * @return sailors
     */
    public ArrayList<Sailor> getSailors() {
        return sailors;
    }
    /**
     * Set sailors of cruise
     * @param sailors sailors of cruise
     */
    public void setSailors(ArrayList<Sailor> sailors) {
        this.sailors = sailors;
    }
}
