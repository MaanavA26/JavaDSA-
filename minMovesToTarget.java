public class minMovesToTarget {
    public static int minMoves(int target, int maxDoubles) {
        if (target == 1){
            return 1;
        }
        if (target <= 0)
            return 0;
        if (maxDoubles == 0){
            return target - 1;
        }
        int count = 0;
        while (target >1 && maxDoubles > 0){
            if (target % 2 == 0){
                target = target /2;
                count ++;
                maxDoubles--;
            }
            else {
                target = target - 1;
                count ++;
            }
        }
        while(target > 1){
            target = target -1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minMoves(10,4));
    }
}
