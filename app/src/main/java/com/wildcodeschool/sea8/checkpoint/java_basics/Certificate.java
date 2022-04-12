package com.wildcodeschool.sea8.checkpoint.java_basics;

import java.time.LocalDate;
import java.util.Date;

public class Certificate implements IExpireable {

    // Date to when this certificate is valid
    private LocalDate validTo;
    // Subject of the certificate and issuer of the certificate
    private String subject, issuer;

    public Certificate(String subject, String issuer, LocalDate validTo) {
        this.subject = subject;
        this.issuer = issuer;
        this.validTo = validTo;
    }

    public Certificate(String subject, String issuer, long validityPeriodInDays) {
        this.subject = subject;
        this.issuer = issuer;
        this.validTo = LocalDate.now().plusDays(validityPeriodInDays);
    }

    public void renew(long daysValidFromNow) {
        // TODO: renew certificate
  
        LocalDate.now().plusDays(daysValidFromNow);
    }
         

    @Override
    public boolean isExpired() {
        // TODO: Provide the neccessary check here

        // stimmt wohl
        boolean isExpired = LocalDate.now().isAfter(this.validTo);
        
        return isExpired;
    }

    @Override
    public LocalDate expiryDate() {
        //TODO: Return the expiration date
      
       //bisschen zu kompliziert, aber ok
        LocalDate expiryDate =this.validTo;
        return expiryDate;
        
    }

    @Override
    public String toString() {
        return String.format("Certificate [Subject: \"%s\", Issuer: \"%s\", Valid Until: \"%s\"]", subject, issuer, validTo.toString());
    }
    
}
