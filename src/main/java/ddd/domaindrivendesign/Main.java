package ddd.domaindrivendesign;

import ddd.domaindrivendesign.vo.ModelNumber;

public class Main {
    public static void main(String[] args) {
        ModelNumber modelNumber = new ModelNumber("A101", "시흥시", "30");
        System.out.println("modelNumber.toString() = " + modelNumber);
    }
}
