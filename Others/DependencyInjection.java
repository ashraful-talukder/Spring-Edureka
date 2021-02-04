class Employee{
    int eid;
    String ename;
    Address address;    //HAS-A relationship

    Employee(){
        eid = 0;
        ename = "NA";
        address = new Address();    //Object creation
    }
}

Class Address{
    String city;
    String state;
    int zipCode;
}