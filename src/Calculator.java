
    public class Calculator {
        //atribut
        private double operand1;
        private double operand2;

        // Konstruktor untuk inisialisasi operand1 dan operand2
        public Calculator(double operand1, double operand2) {
            this.operand1 = operand1;
            this.operand2 = operand2;
        }

        // Metode penjumlahan,pengurangan,perkalian,pembagian
        public double add() {
            return operand1 + operand2;
        }

        public double subtract() {
            return operand1 - operand2;
        }

        public double multiply() {
            return operand1 * operand2;
        }

        public double divide() {
            if (operand2 != 0) {
                return operand1 / operand2;
            } else {
                // Melempar pengecualian jika operand2 adalah nol
                throw new ArithmeticException("Cannot divide by zero");
            }
        }

        public static void main(String[] args) {
            // Membuat objek Calculator dengan operand1=10.0 dan operand2=2.0

            Calculator calculator = new Calculator(10.0, 2.0);

            System.out.println("Addition: " + calculator.add());
            System.out.println("Subtraction: " + calculator.subtract());
            System.out.println("Multiplication: " + calculator.multiply());
            try {
                System.out.println("Division: " + calculator.divide());
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
