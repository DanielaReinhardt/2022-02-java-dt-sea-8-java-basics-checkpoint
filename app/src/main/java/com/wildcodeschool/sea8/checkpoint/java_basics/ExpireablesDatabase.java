package com.wildcodeschool.sea8.checkpoint.java_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExpireablesDatabase<E extends IExpireable> {
    private List<E> listOfExpireables = new ArrayList<>();

    public void addItem(E item) {
        // TODO: add a new item to the list
        listOfExpireables.add(item);  
    }

    public void removeExpired() {
        // TODO: implement the neccessary function to delete all expired entries from the list
        listOfExpireables.removeAll(listOfExpireables);

    }

    public void sortByExpirationDate(boolean descending) {
        // TODO: sort the list by the expiration date of it's entries
        // hint: use a comparator and expiryDate()
      
       // ERSTER GESCHEITERTER VERSUCH
        // final Comparator<E> comparator = new Comparator<E>(){
        //    public int compare(E e1, E e2){
        //     return e1.expiryDate().compareTo(e2.expiryDate());
        //    }
        //    }

        //ZWEITER GESCHEITERTER VERSUCH
       // Collections.sort(listOfExpireables, Comparator.comparing(E listOfExpireables::item.expiryDate()).reversed());

    }

    public E getFirstEntry() {
        // TODO: Return first item in the list
        return listOfExpireables.get(0);
        
    }

    public E getLastEntry() {
        // TODO: Return last item in the list
        return listOfExpireables.get(listOfExpireables.size()-1);
        
    }

    public List<E> getList() {
        return listOfExpireables;
    }

    

}

