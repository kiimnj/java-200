package part3JavaIntermediate;

//중급 070 StringBuilder로 문자열 수정, 변경, 추가하기
public class StringBuilderMain {
    public static void main(String[] args) {
        //String은 값이 변하면 새 객체를 생성하여 해시코드가 변경되고 원래 값을 가진 객체는 가비지가 됨
        //StringBuffer는 기존 객체의 내용만 바뀌는 뮤터블한 특성
        //반대로 바꾼 문자열을 다시 대입하지 않으면 원래 문자열이 되는 것이 이뮤터블
        //StringBuilder는 동기화를 하지 않는 StringBuffer이며, 여러 쓰레드에서 한 StringBuffer 사용하는 건 피함
        StringBuilder sbu = new StringBuilder();
        sbu.append("I")
                .append(" go")
                .append(" to school.");
        System.out.println(sbu);
        System.out.println(sbu.deleteCharAt(3));
        System.out.println(sbu.delete(1, 3));
        System.out.println(sbu.substring(0));
        System.out.println(sbu.substring(0, 4));
    }
}