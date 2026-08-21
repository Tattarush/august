package day21.two;

public class Solution2 {
    public static void main(String[] args) {


        System.out.println("a\tb\tAND\t\tOR\t\tXOR\t\tNOT");
        boolean a = true, b = true;
        System.out.print("\t\t"+(a & b)+"\t"+(a | b)+"\t"+(a ^ b)+"\t"+(!a));
    }
}
