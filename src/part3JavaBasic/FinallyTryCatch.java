package part3JavaBasic;

//중급 063 수학 연산에서 발생하는 예외 처리하기
public class FinallyTryCatch {
    public static void main(String[] args) {
        //Exception으로 프로그래밍의 문제를 유연하게 처리 - RuntimeException, CompileException
        //RuntimeException : 실행 시 발생 - 범위 벗어난 배열, 잘못된 입력 형식, 수학 연산 에러, ...
        try {
            //예외 발생 가능성 있는 문장
            int x = 5;
            int y = 20 / (5 - x); //수학 연산 에러
            System.err.println(y);
        } catch (ArithmeticException e) {
            //예외 처리 - catch문은 예외를 안전하게 끝내는 목적이므로 되도록 간단히 작성
            System.out.println("0으로 나눴는지 확인하기");
//            e.printStackTrace(); //java.lang.ArithmeticException: / by zero
        } finally {
            System.out.println("반드시 수행될 문장");
        }
    }
}