package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength+i-1; j++) {
                int print = Math.abs(cathetusLength-j)+1;
                if(i-print>=0){
                    System.out.print(print);
                } else System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
