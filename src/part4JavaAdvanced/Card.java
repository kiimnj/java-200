package part4JavaAdvanced;

//활용 104 static 사용법 익히기
public class Card {
    //카드 중요 정보(멤버필드)를 private로 보호
    private String cardVal; //H8, H6, ...
    //카드 값을 외부로 반환하는 getter 메서드
    public String getCardVal() {
        return cardVal;
    }
    //기본(디볼트) 생성자
    public Card() {
        //SUIT, VALU는 static 배열이므로 객체 생성 없이 사용
        //0~3
        int suit = (int) (Math.random() * CardUtil.SUIT.length);
        //0~12
        int valu = (int) (Math.random() * CardUtil.VALU.length);
        // 임의의 카드값을 갖는다. H8, H6, ...
        cardVal = CardUtil.SUIT[suit] + CardUtil.VALU[valu];
    }
    //테스트용
    public Card(String s) {
            this.cardVal=s; //문자열은 값 복사
    }
    //복사 생성자
    public Card(Card c){ //다른 카드의 카드값만 가져옴
        this(c.cardVal); //문자열은 값 복사
        // this.cardVal-c.getCardVal(); //동일
    }
    //cardVal 내용
    @Override
    public String toString() {
        return "[" + cardVal + "]";
    }
}