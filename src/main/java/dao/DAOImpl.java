package dao;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao")
@Profile("prod")
public class DAOImpl implements IDao {

    @Override
    public double getValue() {
        System.out.println("Version de production");
        return 100.0;
    }
}
