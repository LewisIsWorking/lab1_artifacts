package app.tests;

import app.model.Account;
import app.model.Transaction;
import app.model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserTest {

    public static void main(String[] args){

        // 1. Set up the object and test the data. IInitialise.
        // See the four steps in:
        String test_username = "mike";
        String test_password = "my_passwd";
        String test_first_name = "Mike";
        String test_last_name = "Smith";
        String test_mobile_number = "07771234567";

        // 2. Exercise, run the object under test.
        User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);

        // 3. Verify (assert).
        // Need to test: test_username, test_password, test_first_name, test_last_name, test_mobile_number

        boolean passed = true;

        // Test test_username.
        if(testUser.getUsername() != test_username){
            System.out.println("TC1 failed: username did not match");
            passed = false;
        }

        // Test test_password.
        if(testUser.getPassword() != test_password){
            System.out.println("TC1 failed: password did not match");
            passed = false;
        }

        // TODO | Add three other if-code blocks just like the above two, to verify the other two fields of the class.

        // Test test_first_name.
        if(testUser.getFirst_name() != test_first_name){
            System.out.println("TC1 failed: first_name did not match");
            passed = false;
        }

        // Test test_last_name.
        if(testUser.getLast_name() != test_last_name){
            System.out.println("TC1 failed: Last_name did not match");
            passed = false;
        }

        if(passed){
            System.out.println("All TC's passed.");
        }

        // 3.3.3

        if(testUser.getFirst_name() != test_first_name){
            System.out.println("TC3 failed: first_name did not match.");
        }

        if(testUser.getLast_name() != test_last_name){
            System.out.println("TC4 failed: last_name did not match.");
        }

        if(testUser.getMobile_number() != test_mobile_number){
            System.out.println("TC5 failed: mobile_number did not match.");
        }

        // Using asserts.

        assert testUser.getUsername() == test_username;
//        assert 1 == 2;
        // TODO add the other assertions like the one above, to verify the other four fields of the class.
        // Need to test: test_username, test_password, test_first_name, test_last_name, test_mobile_number

        assert testUser.getPassword() == test_password;
        assert testUser.getFirst_name() == test_first_name;
        assert testUser.getLast_name() == test_last_name;
        assert testUser.getMobile_number() == test_mobile_number;

        System.out.println("All Java assertions in the test suite passed (none failed).");

    }

    public static void main1(String[] args) throws ParseException {

        // Account.
        Account testAccount = new Account("5495-1234", "mike", "Standard",
                new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2019"));
        System.out.println("test Account:");
        System.out.println(testAccount);

        // Transaction.
        Transaction testTransaction = new Transaction("123", 1,
                new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2019"));
        System.out.println("test Transaction:");
        System.out.println(testTransaction);

        // User.
        User testUser = new User("mike", "my_password", "Mike", "Smith",
                "07771234567");
        System.out.println("test User:");
        System.out.println(testUser);

    }

}
