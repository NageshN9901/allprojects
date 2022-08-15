
package learning;
public class Mealprice {



        public static double calculateTotalMealPrice(double listedMealPrice, double taxRate, double tipRate) {
            double tip=tipRate * listedMealPrice;
            double tax=taxRate * listedMealPrice;
            double result=listedMealPrice+tax +tip;
            //
            return result;
            //System.out.println("your totol bill Amount is +result");

        }
        public static void main(String[] args) {
//double totalBillAmount=calculateTotalMealPrice(100,.18,.6);
            double totalBillAmount=calculateTotalMealPrice(100,.18,.8);

// there are total 5 membrs so w are doing group shearing food app
            double individualMealPrice=totalBillAmount/5;
            System.out.println(" total amonut is " + totalBillAmount);
            System.out.println(individualMealPrice);
        }
    }



