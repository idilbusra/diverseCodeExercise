package ternarystatement;

public class TernaryStatementQ2 {
    /*
    Use ternary to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not content.
     */
    public static void main(String[] args) {
        int a = 4, b = 4, c = 3;
        String typeOfTriangle = a==b && b==c ?
                "Equilateral Triangle" :
                (a==b && b!=c || a==c && b!=c || b==c && a!=c ?
                        "Isosceles Triangle" :
                        "It's not both an isosceles triangle and a scalene triangle.");
        System.out.println(typeOfTriangle);

    }
}
