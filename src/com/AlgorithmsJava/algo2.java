package com.AlgorithmsJava;

public class algo2 {
    class Arithmetic {
        public int add (int A, int B) {
            return A + B;
        }
    }

    class Adder extends Arithmetic {
        private int result = 0;
        public int Adder (int A, int B) {
            result = add(A, B);
            return result;
        }
    }
}
