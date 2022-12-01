package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order) {
        String saying = "";
        if(order % 3 == 0){
            saying += "Fizz";
        }
        if (order % 5 == 0) {
             saying += "Buzz";
        }
        if (order % 7 == 0) {
            saying += "Whizz";
        }
        if(!saying.isEmpty()) return saying;
        return Integer.toString(order);
    }
}
