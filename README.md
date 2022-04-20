# **NUMBER OF DIGITS**

# Information

* **This program returns the sum of the digits of the entered number.**

# Technologies Used

* **JAVA**

# Contents

* The variables **a**, **b** and **c** are defined with int.

* Scanner class created for user to enter numbers.

* It performs the addition of the digits of the number with the while loop.

<br />

# Codes

```Java

        import java.util.Scanner;

        public class numberofdigits{

            public static void main(String[] args) {

                int a, b, c = 0;

                Scanner input = new Scanner(System.in);

                System.out.print("Enter The Number : ");

                a = input.nextInt();


```

```Java

                while (a != 0){

                b = a % 10;

                c += b;

                a /= 10;

                }
                System.out.println("Sum of Digits : " + c);
            }

        }

```

```bash

        Enter The Number : 1643
        Sum of Digits : 14

```

<br />

# LINK

* Click here https://github.com/Fogo9/NumberofDigits.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
