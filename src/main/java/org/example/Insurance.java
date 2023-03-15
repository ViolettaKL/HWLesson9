package org.example;

public class Insurance {

    public int calculateInsuranceCost(int age) {

        int insuranceCost;
        {
            if (age >= 18 && age <= 29) {
                insuranceCost = 120;
            } else if (age >= 30 && age <= 65) {
                insuranceCost = 100;
            } else if (age >= 66 && age <= 79) {
                insuranceCost = 130;
            } else {
                return 0;
            }
            return insuranceCost;
        }
    }
}
