public class Calculator {
    int num1;
    int num2;
    int result;

    public void setNumbers(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(){
        result = num1 + num2;
        return result;
    }

    public int subtract(){
        result = num1 - num2;
        return result;
    }

    public int multiply(){
        result = 0;
        for (int i = 0; i < num2; i++)
            result += num1; // result = result + num1;

        return result;
    }

    public int divide(){
        result = 0;
        int quotient = 0;
        int currentNum1 = num1; // 루프 내에서 num1의 값을 변경해야 하므로 지역 변수 사용
        // num1에서 num2를 반복적으로 뺍니다. (부호에 관계없이 그대로 뺌)
        while (currentNum1 >= num2) {
            // subtract 메서드는 더 이상 인자를 받지 않고 멤버 변수를 사용하므로,
            // 이 곳에서는 직접 뺄셈을 수행하거나 subtract를 호출하기 위한 다른 접근이 필요합니다.
            // 여기서는 루프를 위해 직접 뺄셈 로직을 사용하겠습니다.
            currentNum1 -= num2;
            quotient++;
        }
        result = quotient; // 최종 결과를 멤버 변수에 저장

        return result;
    }

    public void displayResult(String operator){
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}