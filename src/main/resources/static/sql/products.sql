INSERT INTO demo_pagination_backend_bd.products
(created_at, name, price)
VALUES
	(current_timestamp(), 'Produto 1', 5.00),
	(current_timestamp(), 'Produto 2', 5.40),
	(current_timestamp(), 'Produto 3', 8.30),
	(current_timestamp(), 'Produto 4', 10.00),
	(current_timestamp(), 'Produto 5', 15.00),
	(current_timestamp(), 'Produto 6', 9.40),
	(current_timestamp(), 'Produto 8', 2.00),
	(current_timestamp(), 'Produto 9', 15.10),
	(current_timestamp(), 'Produto 10', 9.10),
	(current_timestamp(), 'Produto 11', 7.10),
	(current_timestamp(), 'Produto 12', 4.00),
	(current_timestamp(), 'Produto 13', 89.10),
	(current_timestamp(), 'Produto 14', 56.60),
	(current_timestamp(), 'Produto 15', 30.20),
    (current_timestamp(), 'Produto 16', 25.10);

SELECT * FROM demo_pagination_backend_bd.products;