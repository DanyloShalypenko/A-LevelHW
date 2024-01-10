package ua.shalypenko.JDBC;

public class Main {
    public static void main(String[] args) {

        JDBCMethods.insertIntoTableContact();
        JDBCMethods.createNewPersonInTableEmployee();
        JDBCMethods.selectFromTableEmployee();
        JDBCMethods.deleteFromTableEmployee();
        JDBCMethods.deleteFromTableContact();
        JDBCMethods.deleteFromTableOrder3();
    }
}
