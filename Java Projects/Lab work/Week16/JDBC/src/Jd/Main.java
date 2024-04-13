package Jd;
//JDBC
public class Main {


        //JDBC - Java Data Base Connectivity API
        // API is set of classes

        /*
        JDBC uses 2 pakages
        1. java.sql
        2. javax.sql (include set of predefined classes)

        * These APIs are used to interact with data base

        //Data base :-
        it is a place where you keep data in an organized way(DBS helps us to implement it)

        XAMPP:-
        X -> cross platform
        A-> Apache (it is like a trasporter of your quries from your java application
        M -> MYSql - > database   -> we are using MySql because it is free


Apache and MySql has to be run from XAMPP control panel
Then creat data base

    Java --Interaction-- DataBase

    java makes use of JDBC API for the interaction - > Driver Manager class program(java/mysql connector)


    There are 2 types of Libraries:
     1. Standard (java automatically includes libraries)
     2. Non-Standard(like external library) ->for eaxmple MySql , Java connector  these have to be provided to java

     When you want to iteract with database we need to establish a connection with the database
     connection requiries  3 important information
    1. Username (database - by default , user name = root)
    2. Password (by deaful password is empty)
    3. database information(to which data base you wnat to connect)

    BB name is  = undergraduate
    username = root
    password = empty


    Application JDBC:

    CRUD (C-> create , R-> retrieve , U-> update ,D-> Delete)

    Creat:-
    Insert Records
    to insert we have a class which is "Statement Class". its purpose is to create an object that will carry SQL quries to DB
    Stsement class to be used in conjunction with Connection Class(creatstatement method is used )

executeUpdate ->  insert, delete ,  -> update take argument as a String
executeQuery ->  view(fetch records)

         */





}
