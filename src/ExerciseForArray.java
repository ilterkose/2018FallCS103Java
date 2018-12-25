public class ExerciseForArray {
    public static void main(String[] args) {
        int[] quizes = {80,60,60,0,100};
        System.out.println(average(quizes));
    }

        public static double average(int[] array){
            int sum = 0;
            int times = array.length;
            for(int i=0;i<array.length;i++){
                sum += array[i];
            }
            return sum / times;
        }
    }

