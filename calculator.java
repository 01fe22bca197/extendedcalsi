class Calculator {

    float addition(float operand1, float operand2) {
        return (operand1 + operand2);
    }

    float subsraction(float operand1, float operand2) {
        return (operand1 - operand2);
    }

    float multiplication(float operand1, float operand2) {
        return (operand1 * operand2);
    }

    float division(float operand1, float operand2) {
        return (operand1 / operand2);
    }

    float square(float operand1) {
        return (operand1 * operand1);
    }

    float cube(float operand1) {
        return ((operand1 * operand1) * operand1);
    }

    public static void main(String[] args) {
        float operand1 = 10;
        float operand2 = 10;
        Calculator c = new Calculator();
        float a_result = c.addition(operand1, operand2);
        System.out.println(a_result);
        float s_result = c.addition(operand1, operand2);
        System.out.println(s_result);
        float m_result = c.addition(operand1, operand2);
        System.out.println(m_result);
        float d_result = c.addition(operand1, operand2);
        System.out.println(d_result);
        float sq_result = c.square(operand1);
        System.out.println(sq_result);
        float c_result = c.cube(operand1);
        System.out.println(c_result);
    }
}