package part3JavaBasic;

//중급 062 정수를 입력받을 때 발생할 수 있는 예외 처리하기
public class FormatTryCatch {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";

        try {
            //예외 발생 가능성 있는 문장
            //문자열을 기본 타입으로 변환할 때는 랩퍼 클래스 사용, 실수는 Double.parseDouble()
            int a = Integer.parseInt(sNum); //nNum 입력 시 붉은 글씨로 For input string: "h"
            System.out.println(a);
        } catch (NumberFormatException ee) {
            //예외 처리 - 잘못된 변환 사용 시
            System.out.println("int인지 확인하기");
            System.err.println(ee.getMessage());
        } catch (Exception ee) {
            //다른 예외일 시
            //해당 예외 처리가 먼저라면 모든 예외를 Exception이 처리하여 Unreachable Catch Block Error 발생
            System.out.println("잘 넣었는지 확인하기");
        } finally {
            System.out.println("반드시 수행될 문장");
        }
    }
}
