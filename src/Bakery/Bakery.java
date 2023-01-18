package Bakery;

public class Bakery {
        public static void main(String[] args) {
            - 아래와 같이 세 개의 베이커리 지점에서 각 지점별로 1월부터 12월 까지 월별 매출이 발생했다고 가정하겠습니다.
            (연습은 로컬에서 실행되는 샘플 데이터이지만 실제로는 물리적으로 떨어진 세 개의 서버에서 각 지점의 데이터를 조회할 수 있음을 머리 속에서 상상해 보면 좋을 것 같습니다.)

            - 본사에서는 이 세 개 베이커리 지점의 매출액을 모두 합친 전체 매출액을 확인하고 싶어합니다.

            - Java Stream API를 이용해 세 개 베이커리 지점들의 월별 매출액을 모두 더한 전체 매출액을 계산해 보세요.

                    ==== SampleDatasource.java ====
            public class SampleDatasource {
                // A Bakery 지점의 월별 매출
                public static final List<Integer> salesOfBakeryA = List.of(
                        5_000_000, 5_000_000, 4_500_000, 5_000_000, 3_000_000, 4_000_000, 5_000_000, 5_500_000,
                        3_500_000, 6_000_000, 4_500_000, 4_500_000
                );

                // B Bakery 지점의 월별 매출
                public static final List<Integer> salesOfBakeryB = List.of(
                        3_000_000, 3_500_000, 3_300_000, 2_600_000, 3_000_000, 4_000_000, 5_500_000, 3_700_000,
                        5_300_000, 4_400_000, 3_500_000, 3_000_000
                );

                // C Bakery 지점의 월별 매출
                public static final List<Integer> salesOfBakeryC = List.of(
                        6_000_000, 5_500_000, 4_800_000, 6_700_000, 7_000_000, 5_500_000, 3_500_000, 7_200_000,
                        5_300_000, 6_200_000, 7_000_000, 8_000_000
                );
            }

        //=== 출력 결과 ====
        //#전체 매출액: 173000000
        }

}
