package code._4_student_effort.pair_of_3;

public class PairOf3 {
    public static Integer findPairs(Integer [] numbers){
        Integer pairs = 0;

        for (int i=0; i<= numbers.length - 2; i++){
            for(int j=i+1; j< numbers.length-1; j++){
                for(int k=j+1; k< numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0)
                        pairs++;
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        Integer [] nr = {1, 3, -1, -6,3, 4};
        System.out.println(findPairs(nr));
    }
}
