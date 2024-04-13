package inter;
// this is an interface
public interface Walkable {
    /*
    in interfaces we can make an method which is common in some of the class and
    they are not inheriting a same class
     */

    // this mehtod will be implemented by other class
    /* humans walks different that robots but they walks so we have just
    write a definition of walk method with out any logic
    this method will be then implementd by human and robot class with different logics
     */

    public void walk();
}
