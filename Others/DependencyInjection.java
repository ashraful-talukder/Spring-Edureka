class Employee{
    int eid;
    String ename;
    Address address;    //HAS-A relationship

    Employee(){
        eid = 0;
        ename = "NA";
        //address = new Address();    //Object creation
    }

    Employee(Address address){
        this.address = address; //lose coupling
    }
}

Class Address{
    String city;
    String state;
    int zipCode;
}