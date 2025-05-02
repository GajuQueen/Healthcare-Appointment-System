public class NumberPair<T extends Number, V extends Number>{
        T firstNumber;
        V secondNumber;

        public NumberPair(T firstNumber, V secondNumber){
                this.firstNumber = firstNumber;
                this.secondNumber = secondNumber;
        }

        public double sum(T firstNumber, V secondNumber){
                return firstNumber.doubleValue() + secondNumber.doubleValue();
        }

        public double product(T firstNumber, V secondNumber){
                return firstNumber.doubleValue() * secondNumber.doubleValue();
        }

}

