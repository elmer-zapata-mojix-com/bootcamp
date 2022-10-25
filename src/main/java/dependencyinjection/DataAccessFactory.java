package dependencyinjection;

public class DataAccessFactory {
//    public static DataAccess GetDataAccessObj()
//    {
//        return new DataAccess();
//    }

    public static ICustomerDataAccess GetCustomerDataAccessObj()
    {
        return new CustomerDataAccess();
    }
}
