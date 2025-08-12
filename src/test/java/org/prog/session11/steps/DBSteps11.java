package org.prog.session11.steps;

import io.cucumber.java.en.Given;
import org.prog.session9.Person1Dto;
import org.prog.session9.Results1Dto;
import org.testng.Assert;

import java.sql.*;
import java.util.List;

public class DBSteps11 {

    public static Connection connection;
    public static String randomPersonName;

    @Given("I store those people in database")
    public void storeMyPersonTOBD() throws SQLException {

        List<Person1Dto> person1Dtos = RestSteps11.response.getResults();
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat, Street, City, Number) " +
                        "VALUES (?,?,?,?,?,?,?,?)"
        );

        person1Dtos.forEach(dto -> executeStatement(dto, preparedStatement));

    }

    @Given("I pick a single random person from DB")
    public void pickMyRandomPersonFromDB() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons ORDER BY RAND() LIMIT 1");
        if (resultSet.next()) {
            randomPersonName = resultSet.getString("FirstName") + " " +
                    resultSet.getString("LastName") + " " +
                    resultSet.getString("Gender") + " " +
                    resultSet.getString("City") + " " +
                    resultSet.getString("Street") + " " +
                    resultSet.getString("Number");
        } else {
            Assert.fail("No records found");

        }
    }

    private void executeStatement (Person1Dto dto, PreparedStatement preparedStatement){
        try {
            preparedStatement.setString(1, dto.getName().getFirst());
            preparedStatement.setString(2, dto.getName().getLast());
            preparedStatement.setString(3, dto.getGender());
            preparedStatement.setString(4, dto.getName().getTitle());
            preparedStatement.setString(5, dto.getNat());
            preparedStatement.setString(6, dto.getLocation().getStreet().getName());
            preparedStatement.setString(7, dto.getLocation().getCity());
            preparedStatement.setString(8, dto.getLocation().getStreet().getNumber());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error inserting person: " + dto);
        }
    }



}
