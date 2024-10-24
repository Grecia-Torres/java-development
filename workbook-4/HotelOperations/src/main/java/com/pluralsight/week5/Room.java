package com.pluralsight.week5;

public class Room {
    int numberOfBeds;
    double price;
    boolean occupied;
    boolean dirty;

    Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
    public boolean  isAvailable() {
        if (!dirty && !occupied) {
            return true;
        } else {
            return false;
        }
    }
        public void checkIn() {
            this.occupied = true;
            this.dirty = true;
        }
        public void checkOut() {
        this.occupied = false;
        }
        public void cleanRoom() {
            this.dirty = false;
        }
    }


