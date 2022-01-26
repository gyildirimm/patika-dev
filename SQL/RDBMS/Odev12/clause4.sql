SELECT SUM(payment.amount) AS Payment_Amount, customer.first_name, customer.last_name FROM customer 
INNER JOIN payment ON customer.customer_id = payment.customer_id 
GROUP BY payment.customer_id, customer.first_name, customer.last_name 
ORDER BY SUM(payment.amount) DESC LIMIT 10;
