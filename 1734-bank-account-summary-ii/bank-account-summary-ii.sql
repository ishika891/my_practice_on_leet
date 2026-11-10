# Write your MySQL query statement below
SELECT Users.name , SUM(Transactions.amount) AS balance FROM Users
NATURAL JOIN Transactions
GROUP BY account
HAVING SUM(Transactions.amount)>10000;