package com.company;

//public class Main {

   // public static void main(String[] args) {
	// write your code here
        class Geek
        {
            // data members of the class.
            String name;
            int id;

            // constructor would initialize data members
            // with the values of passed arguments while
            // object of that class created.
            Geek(String name, int id)
            {
                this.name = name;
                this.id = id;
            }
        }

        class Main
        {
            public static void main (String[] args)
            {
                // this would invoke the parameterized constructor.
                Geek geek1 = new Geek("adam", 1);
                System.out.println("GeekName :" + geek1.name +
                        " and GeekId :" + geek1.id);
            }
        }

