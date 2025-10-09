package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao2")
@Profile("dev")
public class DAOImpl2 implements IDao {

    @Override
    public double getValue() {
        System.out.println("Version de developpement");
        return 150.0;
    }
}
