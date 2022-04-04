package code._4_student_effort.fizz;

public class Fizz {

    public static String fizzBuz(int i){
        String s=" ";

        WordCorrelation [] correlations = {
                new WordCorrelation(3,"Fizz"),
                new WordCorrelation(5,"Buzz"),
                new WordCorrelation(7,"Rizz"),
                new WordCorrelation(11,"Jazz")
        };

       boolean isDivisible = false;
       for( WordCorrelation correlation: correlations){
           if(i % correlation.getNr() == 0){
               isDivisible=true;
               s+=correlation.getName();

           }
       }
       if (!isDivisible){
           s=String.valueOf(i);
       }
        return s;
    }


    public static void main(String[] args) {
        for(int i=1; i< 100; i++){
            System.out.println(fizzBuz(i));
        }
    }
}
