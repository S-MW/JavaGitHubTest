/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;




import java.util.Scanner;
public class JavaApplication5 {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Input : ");
                int sec = sc.nextInt();
                

       String Time = functions(sec);

        System.out.println(" Output : " + Time);        
        
    }

     static String functions(int x) 
    {
         int HoursInt = 0, MinInt = 0, SecInt = 0;
  String TimeFinal = null , Hours = null, Min = null, Sec = null ;

  for (int i = 0; x != 0; i++) {
    if (x >= 3600) {
      HoursInt++;
      x = (x - 3600);
    }
    if (x >= 60) {
      MinInt++;
      x = (x - 60);
    }
    if (x < 60 && x >= 0) {
      SecInt = x;
      x = 0;
    }
  }

//        System.out.println("HoursInt : " + HoursInt  );
//        System.out.println("MinInt : " + MinInt  );
//        System.out.println("SecInt : " + SecInt  );
        
        if(HoursInt < 10)
        {
            Hours = "0"+HoursInt;
        }
        else{
            Hours = ""+HoursInt ;
        }
        
         if(MinInt < 10)
        {
            Min = "0"+MinInt;
        }
            else{
                        Min = ""+MinInt ;
        }
         
           if(SecInt < 10)
        {
            Sec = "0"+SecInt;
        }
              else{
                                    Sec = ""+SecInt ;
        }
         
          TimeFinal = Hours + ":" + Min + ":" +Sec ;
      //  System.out.println(Hours + ":" + Min + ":" +Sec );

  return (TimeFinal);

    }
    
}
