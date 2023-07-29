public class ParametrosInvalidosException extends Exception {
    int num1;
    int num2;
    ParametrosInvalidosException(int x, int y){
        num1 = x;
        num2 = y;
    }
    public String toString(){
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}

