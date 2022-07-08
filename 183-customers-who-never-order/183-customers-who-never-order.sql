# Write your MySQL query statement below

SELECT name as Customers FROM customers c LEFT JOIN  orders o
On c.id = o.customerId 
WHERE  customerId is NULL;
