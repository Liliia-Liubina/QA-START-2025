package org.prog.session10;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.prog.session9.Person1Dto;
import org.prog.session9.PersonDto;
import org.prog.session9.Results1Dto;
import org.prog.session9.ResultsDto;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.List;

public class MySqlTestsHW10 {

    private Connection connection;

    @BeforeSuite
    public void beforeSuite() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db", "root", "password");
    }

    @AfterSuite
    public void tearDown() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Test
    public void testWriteToDB() throws SQLException, ClassNotFoundException {
        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat, City, Street, House) " +
                "VALUES ('Leo', 'Lee', 'male', 'Mr', 'US', 'Canada', '5th Avenue', '1')");
    }


    @Test
    public void testReadFromDB() throws SQLException, ClassNotFoundException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons");
        while (resultSet.next()) {
            System.out.print(resultSet.getString("FirstName") + " ");
            System.out.print(resultSet.getString("LastName") + " ");
            System.out.print(resultSet.getString("Gender") + " ");
            System.out.print(resultSet.getString("City") + " ");
            System.out.print(resultSet.getString("Street") + " ");
            System.out.println(resultSet.getString("House") + " ");
        }
    }


    @Test
    public void testWriteToDBFromAPI() throws SQLException, ClassNotFoundException {
        Results1Dto results1Dto = getUsers(3);
        List<Person1Dto> person1Dtos = results1Dto.getResults();
//            Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat, Street, City, Number) " +
                        "VALUES (?,?,?,?,?,?,?,?)"
        );

        person1Dtos.forEach(dto -> executeStatement(dto, preparedStatement));
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
                System.out.println("Error inserting person: " + dto);
            }
        }


        private Results1Dto getUsers (int amount){
            Response respones = RestAssured.given()
                    .baseUri("https://randomuser.me/")
                    .basePath("api/")
                    .queryParam("inc", "gender,name,location,nat")
                    .queryParam("results", amount)
                    .queryParam("noinfo")
                    .get();
            respones.prettyPrint();
            return respones.as(Results1Dto.class);
        }

//    @Test
//    public void testWriteToDB() throws SQLException {
//        Connection connection = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db",
//                    "root", "password");
//            Statement statement = connection.createStatement();
//            statement.execute("INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat, City, Street, House)" +
//                    "VALUES ('Mike', 'Lee', 'male', 'Mr', 'US', 'Canada', '5th Avenue', '101');");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (connection !=null && !connection.isClosed()) {
//                connection.close();
//            }
//        }
    }








