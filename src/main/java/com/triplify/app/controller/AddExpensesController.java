package com.triplify.app.controller;

import com.triplify.app.database.DatabaseConnection;
import com.triplify.app.database.DatabaseExceptionHandler;
import com.triplify.app.model.AddExpenses;
import com.triplify.app.model.Expenses;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping(path = "api/v1/users")

public class AddExpensesController {
    private List<Expenses> addUserExpense = new ArrayList<>();
    @PostMapping("/addexpenses")
    public void postexpense(@RequestBody AddExpenses expenses) throws DatabaseExceptionHandler, SQLException {

        splitexpenses(expenses);
    }

    public void splitexpenses(AddExpenses expenses) throws DatabaseExceptionHandler, SQLException {
        ArrayList<Long> useridlist = expenses.getUseridlist();
        int size = useridlist.size();
        float split = expenses.getAmount()/size;
        int id = -1;

            for (int i = 0; i < size; i++) {
                if (useridlist.get(i).equals(expenses.getPaidbyuserid())) {
                    setExpenses(expenses, expenses.getAmount() - split, useridlist.get(i));
                    id = i;
                } else {
                    setExpenses(expenses, split * -1, useridlist.get(i));
                }
            }
            if (id < 0) {
                setExpenses(expenses, expenses.getAmount(), useridlist.get(id));
            }

            System.out.println(addUserExpense);
    }

    public void setExpenses(AddExpenses expenses, float splittedAmount, Long useridlist)
            throws DatabaseExceptionHandler, SQLException {

        Connection connection =
                DatabaseConnection.getInstance().getDatabaseConnection();
        Statement statement = connection.createStatement();

        try {
        Expenses expense = new Expenses();
        expense.setId(expenses.getId());
        expense.setTransaction_id(expenses.getTransaction_id());
        expense.setDescription(expenses.getDescription());
        expense.setAmount(splittedAmount);
        expense.setCurrency(expenses.getCurrency());
        expense.setGroupid(expenses.getGroupid());
        expense.setUserid(useridlist);
        addUserExpense.add(expense);

        final int rowInserted =
                    AddExpensesQueryBuilder.insertExpenseQuery(expense, connection);

            if(rowInserted > 0){
            System.out.println("Yes row is inserted !!");
        }
        if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // Write DB code to add them
    }
}