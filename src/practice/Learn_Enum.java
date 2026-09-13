package practice;

import javax.accessibility.AccessibleValue;
import java.util.Scanner;

public class Learn_Enum {

    public static void main(String[]args){

//        Level mylevel = Level.FIRST;
//        Level mylevel1 = Level.SECOND;
//        Level mylevel2 = Level.THIRD;
//        Level mylevel3 = Level.FOUR;
//        Level mylevel4 = Level.fifth;

//        // Loop through an enum . enum --> keyword.
//        for (Level value :Level.values()){
//            System.out.println("Values : "+value);
//        }

        for (Level value : Level.values()){
            value.getDescription();
        }
    }

    enum Level {
        FIRST("First level"),
        SECOND("Second level"),
        THIRD("Third level"),
        FOUR("Fourth level"),
        fifth("Fifth level");

        private String description;

        Level(String description) {    // enum constructor
           this.description = description;
        }

        public void getDescription() {
            System.out.println("Description : "+description);
        }
    }
}


