
package coloborate;

public class Coloborate {

    public static void main(String[] args) {
        int dayF1 = 0;
        int dayF2 = 0;
        int dayF3 = 0;
        int space1 = 6, space2, space3;
        System.out.printf("\n\n");
        for(int i = 0; i < 4; i++){
            int day1 = 1, day2 = 1, day3 = 1;
            if(i == 0){
                dayF1 = 31;
                dayF2 = 28; 
                dayF3 = 31;
            }
            if(i == 1){
                dayF1 = 30;
                dayF2 = 31;  
                dayF3 = 30;
            } 
            if(i == 2){
                dayF1 = 31;
                dayF2 = 31; 
                dayF3 = 30;
            } 
            if(i == 3){
                dayF1 = 31;
                dayF2 = 30; 
                dayF3 = 31;
            } 
            if(i == 0) System.out.printf("\nColoborate of the 2023\n\n\n\t  January\t\t\t\t\t  February\t\t\t\t\t   March\n\n");
            if(i == 1) System.out.printf("\t  April\t\t\t\t\t\t    May\t\t\t\t\t\t   June\n\n");
            if(i == 2) System.out.printf("\t  June\t\t\t\t\t\t   July\t\t\t\t\t\t  August\n\n");
            if(i == 3) System.out.printf("\t  October\t\t\t\t\t  November\t\t\t\t\t  December\n\n");
            int once = 0;
            while(day1 <= dayF1 || day2 <= dayF2 || day3 <= dayF3){
                if(once == 0){
                    space2 = (space1 + dayF1) % 7;
                    space3 = (space2 + dayF2) % 7;
                    for(int k = 0; k < space1; k++)
                        System.out.printf("    ");
                    for(int k = 0; (space1 + day1) <= 7; k++)
                        System.out.printf("%d   ", day1++);
                    space1 = (space3 + dayF3) % 7;
                    System.out.printf("\t\t\t");
                    for(int k = 0; k < space2; k++)
                        System.out.printf("    ");
                    for(int k = 0; (space2 + day2) <= 7; k++)
                        System.out.printf("%d   ", day2++);
                    System.out.printf("\t\t\t");
                    for(int k = 0; k < space3; k++)
                        System.out.printf("    ");
                    for(int k = 0; (space3 + day3) <= 7; k++)
                        System.out.printf("%d   ", day3++);
                    System.out.printf("\n");
                    once = 1;
                }
                int k;
                if(day1 <= dayF1){
                    for(k = 0; k < 7 && day1 <= dayF1; k++){
                        if(day1 < 10)
                            System.out.printf("%d   ", day1++);
                        else 
                            System.out.printf("%d  ", day1++);
                    }
                    if(k != 7)
                        while(k < 7){
                            System.out.printf("    ");
                            k++;
                        }
                }
                System.out.printf("\t\t\t");
                if(day2 <= dayF2){
                    for(k = 0; k < 7 && day2 <= dayF2; k++){
                        if(day2 < 10)
                           System.out.printf("%d   ", day2++);
                        else 
                            System.out.printf("%d  ", day2++);
                    }
                    if(k != 7)
                        while(k < 7){
                            System.out.printf("    ");
                            k++;
                        }
                }
                System.out.printf("\t\t\t");
                if(day3 <= dayF3){
                     for(k = 0; k < 7 && day3 <= dayF3; k++){
                        if(day3 < 10)
                            System.out.printf("%d   ", day3++);
                        else 
                            System.out.printf("%d  ", day3++);
                    }
                    if(k != 7)
                        while(k < 7){
                            System.out.printf("    ");
                            k++;
                        }
                }
                System.out.printf("\n");
                }
            System.out.printf("\n\n\n\n");
        }
    }
}   
