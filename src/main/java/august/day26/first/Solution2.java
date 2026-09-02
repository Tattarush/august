package august.day26.first;

public class Solution2 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {
            one: {
                two:{
                    three:{
                        System.out.println("i - равно = " + i);
                        if(i == 0) break one;
                        if(i == 1) break two;
                        if(i == 2) break three;
                        System.out.println("three");
                    }
                    System.out.println("two");
                }
                System.out.println("one");
            }
        }
        System.out.println("Finish");
    }
}
