package part4JavaAdvanced;

//활용 104 static 사용법 익히기
public class CardUtil {
    //static은 객체를 생성하지 않기 위해 만든 키워드
    public static final int SUTDA = 2;
    public static final String[] SUIT = {"H", "C"};
    public static final String[] VALU = {"A", "2", "3", "4", "5", "6", "7", "9", "T"};

    public static int toVal(Card c) {
        return toVal(c.getCardVal().charAt(1)); //카드의 숫자 부분 추출 - "H6"에서 '6'
    }

    public static int toVal(Card c, int index) {
        return toVal(c.getCardVal().charAt(index));
    }

    public static int toVal(char cc) {
        int tot = 0;
        switch (cc) {
            case 'A':
                tot = 1;
                break;
            case 'T':
                tot = 10;
                break;
            case 'J':
                tot = 11;
                break;
            case 'Q':
                tot = 12;
                break;
            case 'K':
                tot = 13;
                break;
            default:
                tot = cc - 'O'; //아스키 숫자를 숫자형으로 변환
                break;
        }
        return tot;
    }
}