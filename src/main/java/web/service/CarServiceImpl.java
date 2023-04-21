package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Mercedes-Benz", "C-class",16478));
        cars.add(new Car("Toyota", "Kluger",0));
        cars.add(new Car("Toyota", "Camry",133));
        cars.add(new Car("Mitsubishi", "Delica",121243));
        cars.add(new Car("Kia", "Rio",87009));
    }

    private final int COUNT_DEFAULT_VALUE = cars.size();

    public int getCOUNT_DEFAULT_VALUE() {
        return COUNT_DEFAULT_VALUE;
    }

    @Override
    public List<Car> show(Integer count) {
        if (count == null) {
            count = getCOUNT_DEFAULT_VALUE();
        }
        return cars.stream().limit(count).toList();
    }
}
