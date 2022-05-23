package com.wildcodeschool.sea8.checkpoint.java_basics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.DefaultStyledDocument;

public class ExpireablesDatabase<E extends IExpireable> {
    private List<E> listOfExpireables = new ArrayList<>();

    public void addItem(E item) {
        // TODO: add a new item to the list
        listOfExpireables.add(item);  
    }

    public void removeExpired() {
        // TODO: implement the neccessary function to delete all expired entries from the list
        
        //listOfExpireables.removeAll(LocalDate.now().isAfter(listOfExpireables.expiryDate()));
        //for each schleife
        for(E i : listOfExpireables){
            if(LocalDate.now().isAfter(i.expiryDate())){
                listOfExpireables.remove(i);
            }
        }
        }


    public void sortByExpirationDate(boolean descending) {
        // TODO: sort the list by the expiration date of it's entries
        // hint: use a comparator and expiryDate()
      
       // ERSTER GESCHEITERTER VERSUCH
        final Comparator<E> comparator = new Comparator<E>(){
           @Override
           public int compare(E o1, E o2){
               if(o1.expiryDate().isBefore(o2.expiryDate())){
                    return descending ? 1 : -1;
               } else if(o1.expiryDate().isAfter(o2.expiryDate())){
                    return descending ? -1 : 1;
               }else{
                   return 0;
               }
           }
        
    };

    

        //ZWEITER GESCHEITERTER VERSUCH
        Collections.sort(listOfExpireables, comparator);

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

