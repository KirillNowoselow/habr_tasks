package tasks;

public class Task_3_1 {
    public static void main(String[] args) {

        System.out.println(searchRadical(0, 10));
    }

    public static double funcRadical(double x){
        return Math.cos(Math.pow(x,5))+Math.pow(x,4)-345.3*x-23;
    }

    public static double searchRadical(double start, double end){
        if(end - start <= 0.001){
            return start;
        }
        double x = start + (end - start) / 2;

        if(funcRadical(start) * funcRadical(x) > 0){
            return searchRadical(x, end);
        } else {
            return searchRadical(start, x);
        }
    }
//    public static double searchRadical(double start, double end){
//        if (funcRadical(start) == 0){
//            return start;
//        }
//        else if (funcRadical(end) == 0){
//            return end;
//        }
//        double middle = 0;
//        while (end-start>0.001){
//            double dx = (end-start)/2;
//            middle = start+dx;
//            if (funcRadical(start)!=funcRadical(middle)){
//                end=middle;
//            }else {
//                start=middle;
//            }
//        }
//        return middle;
//    }
}
