package com.wildcodeschool.sea8.checkpoint.java_basics;

import java.time.LocalDate;

public class DairyProduct implements IExpireable {
    private LocalDate dateProduced;
    private int daysUntilSpoiled;

    public DairyProduct(int daysUntilSpoiled) {
        this.dateProduced = LocalDate.now();
        this.daysUntilSpoiled = daysUntilSpoiled;
    }

    public DairyProduct(LocalDate dateProduced, int daysUntilSpoiled) {
        this.dateProduced = dateProduced;
        this.daysUntilSpoiled = daysUntilSpoiled;
    }

    @Override
    public boolean isExpired() {
        // TODO: Provide the neccessary check here

        //DaysUntilSpoiled muss berücksichtigt werden, 14 Tage ist nur ein Beispiel
        boolean isExpired = LocalDate.now().isAfter(dateProduced.plusDays(daysUntilSpoiled));
        return isExpired;
    }

    @Override
    public LocalDate expiryDate() {
        // TODO: Return the expiration date

        //DaysUntilSpoiled muss berücksichtigt werden, 14 Tage ist nur ein Beispiel
        LocalDate expiryDate = this.dateProduced.plusDays(daysUntilSpoiled);
        return expiryDate;
    }

    @Override
    public String toString() {
        return String.format("DairyProduct [Date Produced: \"%s\", Expiration Date: \"%s\"]", dateProduced, expiryDate());
    }
    
}
