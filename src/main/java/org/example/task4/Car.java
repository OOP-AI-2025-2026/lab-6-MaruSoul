package org.example.task4;

public class Car implements Comparable<Car> {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.setPrice(price);
        this.setYear(year);
        this.setHorsePower(horsePower);
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            return;
        }

        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < 0) {
            return;
        }

        this.year = year;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < 0) {
            return;
        }

        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Car carY) {
        if (this.price < carY.getPrice()) {
            return 1;
        } else if (this.price > carY.getPrice()) {
            return -1;
        }

        if (this.year > carY.getYear()) {
            return 1;
        } else if (this.year < carY.getYear()) {
            return -1;
        }

        if (this.horsePower > carY.getHorsePower()) {
            return 1;
        } else if (this.horsePower < carY.getHorsePower()) {
            return -1;
        }

        return 0;
    }
}
