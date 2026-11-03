# Write your MySQL query statement below
SELECT en.name,e.unique_id FROM Employees en
LEFT JOIN EmployeeUNI e
ON e.id=en.id;