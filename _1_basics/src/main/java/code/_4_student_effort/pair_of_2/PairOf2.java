package code._4_student_effort.pair_of_2;

public class PairOf2 {
    public static Integer findPairs(Integer [] numbers){
        Integer pairs = 0;

        for (int i=0; i<= numbers.length - 1; i++){
            for(int j=i+1; j< numbers.length; j++){
                if(numbers[i] + numbers [j] == 0 )
                    pairs++;
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        Integer [] nr = {1, 3, -1, -3, 4};
        System.out.println(findPairs(nr));
    }
}
