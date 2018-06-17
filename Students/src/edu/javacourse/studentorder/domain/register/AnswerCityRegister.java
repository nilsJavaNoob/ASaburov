package edu.javacourse.studentorder.domain.register;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by n on 12.05.18.
 */
public class AnswerCityRegister {
     private List<AnswerCityRegisterItem> items;

     public void addItem(AnswerCityRegisterItem item){
          if(item == null){
               items = new ArrayList(10);
          }
          items.add(item);
     }
     public List <AnswerCityRegisterItem> getItems(){
         return  items;
     }
}//class
