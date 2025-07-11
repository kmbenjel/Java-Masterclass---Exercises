public class EvenDigitSum {
   public static int  getEvenDigitSum(int number) {
       int sum = 0;
       while (number > 0) {
           if ((number % 10) % 2 == 0) {
               sum += number % 10;
           }
           number /= 10;
       }
       
       return number >= 0 ? sum : -1;
   }
}

