# SQL Notes
## SQL Query Basics

Today I learned the basics of SQL queries, especially how to retrieve and filter data from a table.

I reviewed the structure of my `students` table and practiced writing query statements based on it. In this lesson, I focused on three important SQL clauses:

- `WHERE`: used to filter rows based on conditions
- `ORDER BY`: used to sort query results
- `LIMIT`: used to restrict the number of returned rows

I practiced several kinds of basic condition queries, such as:
- finding students with a specific age
- finding students in a specific major
- selecting students whose age is greater than or equal to a certain value
- checking records that do not match a given condition

I also learned how to sort query results:
- in ascending order with `ASC`
- in descending order with `DESC`

After that, I used `LIMIT` together with `ORDER BY` to view only the first few rows of a sorted result, which helped me understand how SQL can be used to find things like the oldest students or the top few records.

In addition, I became more familiar with the general order of a query statement:

`SELECT ... FROM ... WHERE ... ORDER BY ... LIMIT ...`

By practicing 8–10 query statements on my own table, I gained a clearer understanding of how SQL retrieves data and how different clauses can be combined to form more useful queries.

This lesson helped me move from simply creating and editing tables to actually querying data in a more practical way.

## SQL GROUP BY and Aggregate Functions

Today I learned how to use aggregate functions in SQL to summarize data. I practiced three basic aggregate functions:

- `COUNT()` to count the number of rows
- `SUM()` to calculate the total of a numeric column
- `AVG()` to calculate the average value of a numeric column

I first used these functions on the whole `students` table to calculate the total number of students, the sum of ages, and the average age.

Then I learned how to use `GROUP BY` to divide rows into different groups based on a column value. I used `major` as the grouping column and wrote grouped queries such as:
- counting how many students are in each major
- calculating the average age in each major
- calculating the total age in each major

I also combined `GROUP BY` with `ORDER BY` to sort grouped results, which helped me understand how SQL can be used not only to retrieve rows, but also to generate simple statistical summaries.

This lesson helped me understand the difference between querying individual rows and summarizing data across the whole table or within groups.