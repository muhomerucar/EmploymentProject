public interface IContract {

    /*
    Interface is a kind of commitment between classes that implement it.
    In this case, salary, insurance and bonus must be provided to Employees.
    */

    double salary();
    int insurance();
    double bonus();
}
