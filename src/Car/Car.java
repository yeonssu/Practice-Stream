package Car;

public class Car {
        public static void main(String[] args) {
            - 여러 브랜드의 자동차를 판매하는 자동차 판매 총판 기업의 데이터베이스에 여러 브랜드의 자동차 정보가 등록되어 있다고 가정해 봅시다.
            - 그리고 데이터베이스에 등록된 자동차 정보를 조회해 아래와 같은 결과 값을 리턴 받았다고 가정합시다.
            - 조회된 데이터는 2022년에 가장 많이 팔린 자동차 10위 안에 드는 데이터입니다.
            - 매출 10위권 안에 드는 자동차 브랜드(중복이 제거된)를 확인하는 것이 이번 예제 코드의 핵심입니다.

                    ==== SampleDatasource.java ====
import static com.codestates.stream.practice.common.Car.CarBrand;
import static com.codestates.stream.practice.common.Car.CarType;
import java.util.List;

            public class SampleDatasource {
                public static List<Car> cars = List.of(
                        new Car(CarBrand.Volkswagen, CarType.SEDAN, "티구안", 23_000_000, true),
                        new Car(CarBrand.BMW, CarType.SUV,"미니",  33_000_000, true),
                        new Car(CarBrand.Benz, CarType.SUV,"지바겐", 50_000_000, true),
                        new Car(CarBrand.Benz, CarType.SEDAN, "E-Class",  28_000_000, true),
                        new Car(CarBrand.Ford, CarType.SUV, "익스플로러",  18_000_000, true),
                        new Car(CarBrand.Jeep, CarType.SUV, "랭글러",  23_000_000, true),
                        new Car(CarBrand.Volkswagen, CarType.SUV, "투아렉",  40_000_000, true),
                        new Car(CarBrand.Volkswagen, CarType.SUV, "골프",  43_000_000, true),
                        new Car(CarBrand.Jeep, CarType.SEDAN, "체로키",  35_000_000, true),
                        new Car(CarBrand.Jeep, CarType.PICKUPTRUCK, "글래디에이터",  45_000_000, true)
                );
            }

            - 이 List<Car> cars 에는 여러 건의 자동차 정보가 존재하는데, 이 List<Car> cars를 이용해 중복이 제거된 CarBrand(자동차 브랜드)만 추출해서 콘솔에 출력해 보세요.
                    - 출력 결과는 아래와 같습니다.

                    ==== 출력 결과 시작 ====
            Volkswagen, 티구안
            BMW, 미니
            Benz, 지바겐
            Ford, 익스플로러
            Jeep, 랭글러
                    ==== 출력 결과  끝 ====
: 사실 자동차 이름은 필요없지만 CarBrand(자동차 브랜드)의 중복이 잘 제거되는지 확인하기 위해 자동차 이름도 같이 출력해 봅니다.

                    ---------------------------------------------------------------------------------------------
                    ==== Car.java ====
import lombok.Getter;
import lombok.RequiredArgsConstructor;

            @Getter   // lombok 라이브러리 필요
            @RequiredArgsConstructor  // lombok 라이브러리 필요
            public class Car {
                private final CarBrand carBrand;
                private final CarType carType;
                private final String name;
                private final int price;
                private final boolean isNew;

                public enum CarBrand {
                    BMW,
                    Benz,
                    Volkswagen,
                    Ford,
                    Jeep
                }

                public enum CarType {
                    SEDAN,
                    SUV,
                    PICKUPTRUCK

                }
            }
        }
    }
