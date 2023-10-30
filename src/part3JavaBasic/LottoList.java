package part3JavaBasic;

import java.util.ArrayList;
import java.util.List;

//중급 056 배열보다 편리한 List 사용하기
public class LottoList {
    public static void main(String[] args) {
        /* 리스트는 배열과 다르게 개수가 지정되어 있지 않고 스스로 확보한다.
        List는 int 대신 랩퍼 클래스인 Integer 사용
        List 계열인 ArrayList를 생성 */
        List<Integer> ilist = new ArrayList<>();

        //데이터 입력: .add()
        for (int i = 1; i < 10;i++) ilist.add(i);

        //데이터 가져오기: .get()
        for (Integer i : ilist) {
            int m = ilist.get(i);
            System.out.printf("%d\t", m);
        }
        System.out.println();
    }
}
