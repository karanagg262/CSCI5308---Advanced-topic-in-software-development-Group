package com.triplify.app.Group.database;

import com.triplify.app.Group.model.GroupDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Group Insert Query Builder")
public class GroupCreationQueryBuilderTest {

    @Test
    @DisplayName("Insert Query negative scenario: null group name")
    public void insertGroupQueryNullNameTest(){

        GroupDetails groupDetails = new GroupDetails();
        groupDetails.setGroupName(null);
        groupDetails.setGroupDescription("Coming Soon");
        groupDetails.setDestination("Australia");
        groupDetails.setTripStartDate("12-12-2022");
        groupDetails.setTripEndDate("12-14-2022");
        groupDetails.setTripType("Public");
        groupDetails.setUser_id(Long.valueOf(15));

        GroupCreationQueryBuilder groupCreationQueryBuilder = new GroupCreationQueryBuilder();

        final String expectedInsertQuery = groupCreationQueryBuilder.insertGroupQuery(groupDetails);
        final String actualInsertQuery =
                "INSERT INTO group_details(group_name, trip_start_date, trip_end_date, destination, group_description, trip_type, user_id) VALUES (\"Australia\", \"12-12-2022\", \"12-14-2022\", \"Australia\", \"Coming Soon\", \"Public\", 15);";

        Assertions.assertNotEquals(expectedInsertQuery,actualInsertQuery,"Incorrect Insert Query Has been generated!!");

    }
    @Test
    @DisplayName("Insert Query negative scenario: null group description")
    public void insertGroupQueryNullDescriptionTest(){

        GroupDetails groupDetails = new GroupDetails();
        groupDetails.setGroupName("Australia");
        groupDetails.setGroupDescription(null);
        groupDetails.setDestination("Australia");
        groupDetails.setTripStartDate("12-12-2022");
        groupDetails.setTripEndDate("12-14-2022");
        groupDetails.setTripType("Public");
        groupDetails.setUser_id(Long.valueOf(15));

        GroupCreationQueryBuilder groupCreationQueryBuilder = new GroupCreationQueryBuilder();

        final String expectedInsertQuery = groupCreationQueryBuilder.insertGroupQuery(groupDetails);
        final String actualInsertQuery =
                "INSERT INTO group_details(group_name, trip_start_date, trip_end_date, destination, group_description, trip_type, user_id) VALUES (\"Australia\", \"12-12-2022\", \"12-14-2022\", \"Australia\", \"Coming Soon\", \"Public\", 15);";

        Assertions.assertNotEquals(expectedInsertQuery,actualInsertQuery,"Incorrect Insert Query Has been generated!!");

    }
    @Test
    @DisplayName("Insert Query negative scenario: null group destination")
    public void insertGroupQueryNullDestinationTest(){

        GroupDetails groupDetails = new GroupDetails();
        groupDetails.setGroupName("Australia");
        groupDetails.setGroupDescription("Coming soon");
        groupDetails.setDestination(null);
        groupDetails.setTripStartDate("12-12-2022");
        groupDetails.setTripEndDate("12-14-2022");
        groupDetails.setTripType("Public");
        groupDetails.setUser_id(Long.valueOf(15));

        GroupCreationQueryBuilder groupCreationQueryBuilder = new GroupCreationQueryBuilder();

        final String expectedInsertQuery = groupCreationQueryBuilder.insertGroupQuery(groupDetails);
        final String actualInsertQuery =
                "INSERT INTO group_details(group_name, trip_start_date, trip_end_date, destination, group_description, trip_type, user_id) VALUES (\"Australia\", \"12-12-2022\", \"12-14-2022\", \"Australia\", \"Coming Soon\", \"Public\", 15);";

        Assertions.assertNotEquals(expectedInsertQuery,actualInsertQuery,"Incorrect Insert Query Has been generated!!");

    }
    @Test
    @DisplayName("Insert Query negative scenario: null group start date")
    public void insertGroupQueryNullStartDateTest(){

        GroupDetails groupDetails = new GroupDetails();
        groupDetails.setGroupName("Australia");
        groupDetails.setGroupDescription("Coming soon");
        groupDetails.setDestination("Australia");
        groupDetails.setTripStartDate(null);
        groupDetails.setTripEndDate("12-14-2022");
        groupDetails.setTripType("Public");
        groupDetails.setUser_id(Long.valueOf(15));

        GroupCreationQueryBuilder groupCreationQueryBuilder = new GroupCreationQueryBuilder();

        final String expectedInsertQuery = groupCreationQueryBuilder.insertGroupQuery(groupDetails);
        final String actualInsertQuery =
                "INSERT INTO group_details(group_name, trip_start_date, trip_end_date, destination, group_description, trip_type, user_id) VALUES (\"Australia\", \"12-12-2022\", \"12-14-2022\", \"Australia\", \"Coming Soon\", \"Public\", 15);";
        Assertions.assertNotEquals(expectedInsertQuery,actualInsertQuery,"Incorrect Insert Query Has been generated!!");

    }
    @Test
    @DisplayName("Insert Query negative scenario: null group end date")
    public void insertGroupQueryNullEndDateTest(){

        GroupDetails groupDetails = new GroupDetails();
        groupDetails.setGroupName("Australia");
        groupDetails.setGroupDescription("Coming soon");
        groupDetails.setDestination("Australia");
        groupDetails.setTripStartDate("12-12-2022");
        groupDetails.setTripEndDate(null);
        groupDetails.setTripType("Public");
        groupDetails.setUser_id(Long.valueOf(15));

        GroupCreationQueryBuilder groupCreationQueryBuilder = new GroupCreationQueryBuilder();

        final String expectedInsertQuery = groupCreationQueryBuilder.insertGroupQuery(groupDetails);
        final String actualInsertQuery =
                "INSERT INTO group_details(group_name, trip_start_date, trip_end_date, destination, group_description, trip_type, user_id) VALUES (\"Australia\", \"12-12-2022\", \"12-14-2022\", \"Australia\", \"Coming Soon\", \"Public\", 15);";

        Assertions.assertNotEquals(expectedInsertQuery,actualInsertQuery,"Incorrect Insert Query Has been generated!!");

    }
    @Test
    @DisplayName("Insert Query negative scenario: null trip type")
    public void insertGroupQueryNullTripTypeTest(){

        GroupDetails groupDetails = new GroupDetails();
        groupDetails.setGroupName("Australia");
        groupDetails.setGroupDescription("Coming soon");
        groupDetails.setDestination("Australia");
        groupDetails.setTripStartDate("12-12-2022");
        groupDetails.setTripEndDate("12-14-2022");
        groupDetails.setTripType(null);
        groupDetails.setUser_id(Long.valueOf(15));

        GroupCreationQueryBuilder groupCreationQueryBuilder = new GroupCreationQueryBuilder();

        final String expectedInsertQuery = groupCreationQueryBuilder.insertGroupQuery(groupDetails);
        final String actualInsertQuery =
                "INSERT INTO group_details(group_name, trip_start_date, trip_end_date, destination, group_description, trip_type, user_id) VALUES (\"Australia\", \"12-12-2022\", \"12-14-2022\", \"Australia\", \"Coming Soon\", \"Public\", 15);";

        Assertions.assertNotEquals(expectedInsertQuery,actualInsertQuery,"Incorrect Insert Query Has been generated!!");

    }
    @Test
    @DisplayName("Insert Query negative scenario: null group id")
    public void insertGroupQueryNullGroupIdTest(){

        GroupDetails groupDetails = new GroupDetails();
        groupDetails.setGroupName("Australia");
        groupDetails.setGroupDescription("Coming soon");
        groupDetails.setDestination("Australia");
        groupDetails.setTripStartDate("12-12-2022");
        groupDetails.setTripEndDate("12-14-2022");
        groupDetails.setTripType("Public");
        groupDetails.setUser_id(null);

        GroupCreationQueryBuilder groupCreationQueryBuilder = new GroupCreationQueryBuilder();

        final String expectedInsertQuery = groupCreationQueryBuilder.insertGroupQuery(groupDetails);
        final String actualInsertQuery =
                "INSERT INTO group_details(group_name, trip_start_date, trip_end_date, destination, group_description, trip_type, user_id) VALUES (\"Australia\", \"12-12-2022\", \"12-14-2022\", \"Australia\", \"Coming Soon\", \"Public\", 15);";

        Assertions.assertNotEquals(expectedInsertQuery,actualInsertQuery,"Incorrect Insert Query Has been generated!!");

    }
    @Test
    @DisplayName("Insert Query positive scenario")
    public void insertGroupQueryPositiveTest(){

        GroupDetails groupDetails = new GroupDetails();
        groupDetails.setGroupName("Australia");
        groupDetails.setGroupDescription("Coming Soon");
        groupDetails.setDestination("Australia");
        groupDetails.setTripStartDate("12-12-2022");
        groupDetails.setTripEndDate("12-14-2022");
        groupDetails.setTripType("Public");
        groupDetails.setUser_id(Long.valueOf(15));

        GroupCreationQueryBuilder groupCreationQueryBuilder = new GroupCreationQueryBuilder();

        final String expectedInsertQuery = groupCreationQueryBuilder.insertGroupQuery(groupDetails);
        final String actualInsertQuery =
                "INSERT INTO group_details(group_name, trip_start_date, trip_end_date, destination, group_description, trip_type, user_id) VALUES (\"Australia\", \"12-12-2022\", \"12-14-2022\", \"Australia\", \"Coming Soon\", \"Public\", 15);";

        Assertions.assertEquals(expectedInsertQuery,actualInsertQuery,"Correct Insert Query Has been generated!!");
    }

}
