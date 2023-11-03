package part4JavaAdvanced;

//활용 104 static 사용법 익히기
public class CardMain {
    public static void main(String[] args) {
        Card c1 = new Card("H4");
        //생성자 (String 아규먼트)
        Card c2 = new Card("H4"); //new로 생성했으므로 해시코드가 위와 다름
        //생성자 (String 아규먼트)
        Card c3 = new Card(c1);
        //복사 생성자 - 값 동일, 해시코드 다름
        System.out.println(c1.hashCode()); //값은 동일, 다른 해시
        System.out.println(c2.hashCode()); //값은 동일, 다른 해시
        System.out.println(c1.getCardVal()); //값은 동일
        System.out.println(c2.getCardVal()); //값은 동일
        System.out.println(c1.equals(c2)); //hashCode 비교-중요-false
        System.out.println(c2.equals(c3)); //hashCode 비교-중요-false

        //해시코드가 서로 다른 20개 카드 객체 생성, 카드값은 랜덤이지만 같을 수 있음
        for(int i = 0; i < CardUtil.SUIT.length; i++) { //SUIT 2
            for (int j = 0; j < CardUtil.VALU.length; j++){ //VALU 10
                    Card c = new Card(); //값은 같을 수 있지만, 해시코드는 고유함(같을 수 없다).
                //임의로 카드 생성 - 기본 생성자()
                System.out.printf("%s\t",c); //c.toString()
            }
            System.out.println(); //10개 출력 후 한 칸 아래
        }
    }
}